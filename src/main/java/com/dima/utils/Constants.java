package com.dima.utils;

import com.dima.controllers.MainMenuController;

public class Constants {
    public static final String APP_NAME = "Just Add Coffee";
    public static final String MAIN_MENU_HEADER = "JAC Main menu";
    public static final String MAKE_COFFEE_HEADER = "Select kind of coffee";
    public static final String LOGIN_HEADER = "JAC LOGIN";

    public static final String PRINTER_DELIMETER = "-";

    public static final int NUMBER_OF_OPTIONS_NOT_ADMIN = 3;
    public static final MainMenuController.Choices[] EXCLUDE_FROM_ADMIN = {MainMenuController.Choices.LOGIN};
    public static final MainMenuController.Choices[] EXCLUDE_FROM_NOT_ADMIN = {MainMenuController.Choices.ADD_SUPPLIES};
    public static final int NUMBER_OF_OPTIONS_ADMIN = MainMenuController.CHOICES_VALUES.length;
}
