package com.example;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/dashboard")
public class DashboardServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
            throws ServletException, IOException {
        
        // false = do NOT create a new session if one doesn't exist
        HttpSession session = req.getSession(false);

        // Check if user is logged in
        if (session != null && session.getAttribute("loggedUser") != null) {
            String user = (String) session.getAttribute("loggedUser");
            req.setAttribute("user", user);
            req.getRequestDispatcher("/WEB-INF/jsp/dashboard.jsp").forward(req, resp);
        } else {
            // Unauthenticated user -> redirect to login
            resp.sendRedirect(req.getContextPath() + "/login.jsp");
            return;
        }
    }
}