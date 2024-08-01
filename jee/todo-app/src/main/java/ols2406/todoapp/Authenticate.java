package ols2406.todoapp;

import java.io.IOException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Authenticate")
public class Authenticate extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        try {
            if (Users.authenticate(request.getParameter("email"), request.getParameter("password")) == 1)
                request.getRequestDispatcher("/home.html").forward(request, response);
            else
                request.getRequestDispatcher("/").forward(request, response);
        } catch (Exception exception) {

        }
    }
}