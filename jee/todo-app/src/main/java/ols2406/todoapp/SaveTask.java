package ols2406.todoapp;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/SaveTask")
public class SaveTask extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        Connection connection;
        Statement statement;
        try {
            connection = DriverManager.getConnection(getInitParameter("DB_URL"), getInitParameter("DB_USER"), getInitParameter("DB_PASS"));
            statement = connection.createStatement();
            String sql = "INSERT INTO task(name, date_added, due_date, priority, notes, status) VALUES('" + request.getParameter("name") + "', CURDATE(), '" + request.getParameter("due_date") + "', 'N', NULL, 'O')";
            statement.executeUpdate(sql);
            request.getRequestDispatcher("/home.html").forward(request, response);
        } catch(SQLException exception) {

        }
    }
}