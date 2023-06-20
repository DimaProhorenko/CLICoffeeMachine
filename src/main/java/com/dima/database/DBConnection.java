package com.dima.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static Connection conn;

    public static boolean start() {
        try {
            conn = DriverManager.getConnection(DBConstants.DB_CONNECTION_STRING);
            return true;
        } catch (SQLException e) {
            System.out.println("Couldn't connect to db");
        }
        return false;
    }

    public static boolean close() {
        try {
            conn.close();
            return true;
        } catch (SQLException e) {
            System.out.println("Couldn't close db");
        }
        return false;
    }
    public static Connection getConnection() {
        return conn;
    }
}
