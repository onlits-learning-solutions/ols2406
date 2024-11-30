package ols2406.todoapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Task {
    // private int id;
    // private String name;
    // private String date_added;
    // private String due_date;
    // private char priority;
    // private String notes;
    // private char status;

    public static void add(String name, String due_date) {
        String url = "jdbc:mariadb://localhost:3306/todoapp_2406";

        try {
            Connection connection = DriverManager.getConnection(url, "ols2406", "ols2406");
            Statement statement = connection.createStatement();
            String sql = "INSERT INTO task(name, date_added, due_date, priority, notes, status) VALUES('" + name
                    + "', CURDATE(), '" + due_date + "', 'N', NULL, 'O')";
            statement.executeUpdate(sql);
        } catch (SQLException exception) {

        }
    }
    
    public static void remove(int id) {

    }

    public static void get(int id) {

    }

    public static void all() {
        String url = "jdbc:mariadb://localhost:3306/todoapp_2406";

        try {
            Connection connection = DriverManager.getConnection(url, "ols2406", "ols2406");
            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM task";
            ResultSet resultSet = statement.executeQuery(sql);
        } catch (SQLException exception) {

        }
    }
}
