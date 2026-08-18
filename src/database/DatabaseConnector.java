package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnector {

    private static final String URL = "jdbc:mysql://localhost:3306/hospitality_management";
    private static final String USER = "root";
    private static final String PASSWORD = "Chhavi@200608";   

    public static Connection getConnection() {

        Connection con = null;

        try {
            con = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Database Connected Successfully...");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return con;
    }
}
