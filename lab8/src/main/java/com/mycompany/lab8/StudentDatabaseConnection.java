package com.mycompany.lab8;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class StudentDatabaseConnection {

    private static final String URL = "jdbc:mysql://localhost:3306/oop_lab_08";

    private static final String USERNAME = "root";
    private static final String PASSWORD = "Hiruni@04";

    public static Connection getConnection()
            throws SQLException {

        return DriverManager.getConnection(URL,USERNAME,PASSWORD);
    }
}
