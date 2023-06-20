package com.dima.models;

import com.dima.database.DBConnection;
import com.dima.database.DBConstants;
import com.dima.utils.Encryptor;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginModel {

    public boolean validateUser(String[] data) {
        String sql = "SELECT %s, %s from %s WHERE (%s = ?)".formatted(
                DBConstants.COLUMN_USERS_USERNAME, DBConstants.COLUMN_USERS_PASSWORD,
                DBConstants.TABLE_USERS, DBConstants.COLUMN_USERS_USERNAME
        );
        try (PreparedStatement pstmt = DBConnection.getConnection().prepareStatement(sql)) {
            pstmt.setString(1, data[0]);
            ResultSet result = pstmt.executeQuery();
            if (result.next()) {
                String dbPassword = result.getString(DBConstants.COLUMN_USERS_PASSWORD);
                return Encryptor.validatePassword(data[1], dbPassword);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }
}
