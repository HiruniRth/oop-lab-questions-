
package com.mycompany.lab8;
    import java.sql.Connection;
    import java.sql.SQLException;

public class StudentConnectionTest {
    public static void main(String[] args) {

        try {

            Connection con = StudentDatabaseConnection.getConnection();

            System.out.println("Database connected successfully.");

        } catch (SQLException e) {

            System.out.println("Database connection error.");
            System.out.println(e.getMessage());
        }
    }
}
