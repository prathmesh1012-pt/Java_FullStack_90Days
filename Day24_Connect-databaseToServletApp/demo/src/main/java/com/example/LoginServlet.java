package com.example;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.RequestDispatcher;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)throws IOException, ServletException{

        RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/jsp/login.jsp");
        dispatcher.forward(req, res);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
            throws ServletException, IOException {
        
        String username = req.getParameter("username");
        String password = req.getParameter("pass");
        String sql = "INSERT INTO incidents (username, password) VALUES (?, ?)";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, username);
            stmt.setString(2, password);

            int rowsInserted = stmt.executeUpdate();

            if (rowsInserted > 0) {
                req.setAttribute("message", "Incident saved to database successfully!");
            }

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            req.setAttribute("message", "Database Error: " + e.getMessage());
        }

        // Hardcoded check for demo purposes
        if ("admin".equals(username) && "1234".equals(password)) {
            // 1. Get or create session
            HttpSession session = req.getSession();
            
            // 2. Store user info inside session scope (persists across pages)
            session.setAttribute("loggedUser", username);
            
            // 3. Redirect to dashboard
            req.setAttribute("user", username);
            req.getRequestDispatcher("/WEB-INF/jsp/dashboard.jsp").forward(req, resp);
        } else {
            resp.sendRedirect("login.jsp?error=invalid");
        }
    }
}