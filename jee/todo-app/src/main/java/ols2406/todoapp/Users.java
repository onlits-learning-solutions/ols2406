package ols2406.todoapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Users {
    public static int authenticate(String email, String password) {
        String url = "jdbc:mariadb://localhost:3306/todoapp_2406";

        try {
            Connection connection = DriverManager.getConnection(url, "ols2406", "ols2406");
            Statement statement = connection.createStatement();
            String sql = "SELECT email FROM user WHERE email='" + email + "' AND password=SHA1('" + password + "')";
            ResultSet resultSet = statement.executeQuery(sql);
            if (resultSet.next()) {
                return 1;
            }
        } catch (Exception exception) {
        }
        return 0;
    }
}
