package com.dima.database;

public class DBConstants {
    public static final String DB_NAME = "database.db";
    public static final String DB_BASE_URL = "src/main/resources/database/";
    public static final String DB_DRIVER = "jdbc:sqlite:";
    public static final String DB_CONNECTION_STRING = DB_DRIVER + DB_BASE_URL + DB_NAME;

    public static final String TABLE_USERS = "users";
    public static final String COLUMN_USERS_ID = "_id";
    public static final String COLUMN_USERS_USERNAME = "username";
    public static final String COLUMN_USERS_PASSWORD = "password";
    public static final String COLUMN_USERS_DOC = "doc";
    public static final String COLUMN_USERS_IS_ADMIN = "isAdmin";
}
