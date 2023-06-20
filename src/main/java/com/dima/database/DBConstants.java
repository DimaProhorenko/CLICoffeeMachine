package com.dima.database;

public class DBConstants {
    public static final String DB_NAME = "database.db";
    public static final String DB_BASE_URL = "src/main/resources/database/database.db";
    public static final String DB_DRIVER = "jdbc:sqlite:";
    public static final String DB_CONNECTION_STRING = DB_DRIVER + DB_BASE_URL + DB_NAME;
}
