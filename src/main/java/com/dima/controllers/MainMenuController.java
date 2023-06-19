package com.dima.controllers;

import com.dima.views.MainMenuView;

public class MainMenuController {
    public static final Choices[] CHOICES_VALUES = Choices.values();
    public enum Choices {
        EXIT("Exit"),
        MAKE_COFFEE("Make coffee");

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
            choice = view.getData();
            if (choice == -1) continue;
            switch (CHOICES_VALUES[choice]) {
                case MAKE_COFFEE -> new MakeCoffeeController().handleData();
            }
        }
    }
}
