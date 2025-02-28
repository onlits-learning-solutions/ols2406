package ols2406.todoapp;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/SaveTask")
public class SaveTask extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Task.add(request.getParameter("name"), request.getParameter("due_date"));
        request.getRequestDispatcher("/home.html").forward(request, response);
    }
}