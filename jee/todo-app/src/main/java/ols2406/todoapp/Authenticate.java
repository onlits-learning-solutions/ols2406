package ols2406.todoapp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Authenticate")
public class Authenticate extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();
        String url = "jdbc:mariadb://localhost:3306";
        String username = "ols2406";
        String password = "ols2406";
        Connection connection = DriverManager.getConnection(url, username, password);
        Statement statement = connection.createStatement(); 
        out.println("Aal is well!");
    }
}