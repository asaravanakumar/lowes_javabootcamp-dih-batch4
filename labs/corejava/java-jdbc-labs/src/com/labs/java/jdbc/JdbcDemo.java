package com.labs.java.jdbc;

import java.sql.*;

public class JdbcDemo {
    public static void main(String[] args) {

        // Optional if using Java 8 and above
        // 1. Load Driver
        // 2. Register Driver

        // 3. Create Connection - server address (ip/port), db, username, password
        String JDBC_URL="jdbc:mysql://localhost:3306/dihtraining";
        String username = "root";
        String password = "root";
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;

        String query = "SELECT id, description FROM dihtraining.order";

        try {
            con = DriverManager.getConnection(JDBC_URL, username, password);
            System.out.println("Connection established successfully!!!");
//            System.out.println(con + " " + con.getSchema() + " " + con.getClientInfo());
        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        // 4. Create Statement
        try {
            stmt = con.createStatement();

            // 5. Execute Query / Get Response
            rs = stmt.executeQuery(query);

            while(rs.next()) {
                int id = rs.getInt("id");
                String desc = rs.getString("description");
                System.out.format("%5d %30s \n", id, desc);
            }

        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        // 6. Close Connection
        try {
            rs.close();
            stmt.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
    }

}
