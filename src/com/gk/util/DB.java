package com.gk.util;

import java.sql.Connection;
import java.sql.SQLException;

public class DB {
    public static Connection getConnection() {
        java.lang.String dbUserName = "root";
        java.lang.String dbPassword = "070499.";
        java.lang.String dbUrl = "jdbc:mysql://localhost:3306/studentinfomanagement?"
                + "user=" + dbUserName + "&password=" + dbPassword + "&useUnicode=true&characterEncoding=UTF-8";
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = java.sql.DriverManager.getConnection(dbUrl);
        } catch (SQLException | ClassNotFoundException e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return conn;
    }

    public static void closeConnection(Connection conn) {
        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}