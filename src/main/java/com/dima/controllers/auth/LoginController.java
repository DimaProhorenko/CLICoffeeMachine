package com.dima.controllers.auth;

import com.dima.JAC;
import com.dima.database.DBConnection;
import com.dima.models.LoginModel;
import com.dima.utils.Encryptor;
import com.dima.views.auth.LoginView;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Arrays;

public class LoginController {
    private LoginView view;
    private LoginModel model;


    public LoginController() {
        view = new LoginView();
        model = new LoginModel();
    }

    public void handleData() {
        String[] data = view.getData();
        boolean isLogged = model.validateUser(data);
        if (isLogged) {
            JAC.setAdmin(true);
            view.printLoginSuccess();
        } else {
            view.printLoginError();
        }

    }
}
