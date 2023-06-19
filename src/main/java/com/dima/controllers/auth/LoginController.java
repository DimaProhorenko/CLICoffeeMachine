package com.dima.controllers.auth;

import com.dima.views.auth.LoginView;

import java.util.Arrays;

public class LoginController {
    private LoginView view;

    public LoginController() {
        view = new LoginView();
    }

    public void handleData() {
        String[] data = view.getData();
        System.out.println(Arrays.toString(data));
    }
}
