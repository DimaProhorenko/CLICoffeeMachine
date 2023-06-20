package com.dima.controllers;

import com.dima.controllers.auth.LoginController;
import com.dima.utils.Constants;
import com.dima.views.MainMenuView;
import com.dima.JAC;

public class MainMenuController {
    public static final Choices[] CHOICES_VALUES = Choices.values();
    public enum Choices {
        EXIT("Exit"),
        MAKE_COFFEE("Make coffee"),
        LOGIN("Login");

        private String msg;

        Choices(String msg) {
            this.msg = msg;
        }

        public String getMsg() {
            return msg;
        }
    }

    private final MainMenuView view;

    public MainMenuController() {
        view = new MainMenuView();
    }

    public void handleData() {
        view.printMainHeader();
        int choice = -1;

        while (choice != Choices.EXIT.ordinal()) {
            if(JAC.isAdmin()) {
                choice = view.getData(Constants.NUMBER_OF_OPTIONS_ADMIN);
            } else {
                choice = view.getData(Constants.NUMBER_OF_OPTIONS_NOT_ADMIN);
            }
            if (choice == -1) continue;
            switch (CHOICES_VALUES[choice]) {
                case MAKE_COFFEE -> new MakeCoffeeController().handleData();
                case LOGIN -> new LoginController().handleData();
            }
        }
    }
}
