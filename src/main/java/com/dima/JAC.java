package com.dima;

import com.dima.controllers.MainMenuController;
import com.dima.database.DBConnection;
import com.dima.utils.Constants;


public class JAC {
    private static boolean isAdmin = false;


    public static boolean isAdmin() {
        return isAdmin;
    }

    public static void setAdmin(boolean newIsAdmin) {
        isAdmin = newIsAdmin;
    }

    public static void main(String[] args) {
        DBConnection.start();
        MainMenuController mmc = new MainMenuController();
        mmc.handleData();
        DBConnection.close();
    }
}
