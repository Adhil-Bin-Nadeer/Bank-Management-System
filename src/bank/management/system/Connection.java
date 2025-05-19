package bank.management.system;

import java.sql.*;

public class Connection {
    java.sql.Connection connection;
    Statement statement;

    public Connection() {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/bankSystem",
                    "root",
                    "@5Aur0n4295*"
            );
            statement = connection.createStatement();
        } catch (Exception e) {
            // Print detailed error to console
            e.printStackTrace();
        }
    }
}