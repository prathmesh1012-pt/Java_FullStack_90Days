package com.example;
import java.io.IOException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.ServletException;
import jakarta.servlet.RequestDispatcher;

@WebServlet("/home")
public class incident extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)throws IOException, ServletException{

        RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/jsp/home.jsp");
        dispatcher.forward(req, res);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse res) 
            throws ServletException, IOException {
        String title = req.getParameter("title");
        String description = req.getParameter("description");

        req.setAttribute("message", "Incident reported successfully!");
        req.setAttribute("submittedTitle", title);
        req.setAttribute("submittedDescription", description);

        RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/jsp/home.jsp");
        dispatcher.forward(req, res);

            }
}
