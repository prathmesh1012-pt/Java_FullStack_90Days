package com.example;

import java.io.IOException;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/incident")
public class IncidentServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
            throws ServletException, IOException {
        
        req.setAttribute("service", "Authentication Service");
        req.setAttribute("status", "ACTIVE");
        
        RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/jsp/incident.jsp");
        dispatcher.forward(req, resp);
    }
}