package ols2406.todoapp;

import jakarta.servlet.http.HttpServlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/myhome") // Request dispatcher

public class MyHome extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();
        try {
            Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost/todoapp_2406", "ols2406",
                    "ols2406");
            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM task";
            ResultSet resultSet = statement.executeQuery(sql);
            out.println("<html>");
            out.println("<head>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>MyHome</h1>");
            out.println("<table>");
            out.println("<tr>");
            out.println("<th>Id</th>");
            out.println("<th>Name</th>");
            out.println("<th>Due Date</th>");
            out.println("</tr>");
            while (resultSet.next()) {
                out.println("<tr>");
                out.println("<td>" + resultSet.getInt("id") + "</td>");
                out.println("<td>" + resultSet.getString("name") + "</td>");
                out.println("<td>" + resultSet.getString("due_date") + "</td>");
                out.println("</tr>");
            }
            out.println("</table>");
            out.println("</body>");
            out.println("</html>");
        } catch (SQLException exception) {
            out.println(exception.toString());
        }
    }
}