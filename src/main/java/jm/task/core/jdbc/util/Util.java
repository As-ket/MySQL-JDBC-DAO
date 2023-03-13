package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    // реализуйте настройку соеденения с БД
    private final static String USER = "root";
    private final static String PASSWORD = "u5WMdxza";
    private final static String URL = "jdbc:mysql://localhost:3306/myTask";


    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            System.out.println("not work");
        }
        return connection;
    }
}
