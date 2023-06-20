package com.dima.controllers.auth;

import com.dima.JAC;
import com.dima.models.LoginModel;
import com.dima.views.auth.LoginView;

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
