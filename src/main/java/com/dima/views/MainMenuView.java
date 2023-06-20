package com.dima.views;

import com.dima.controllers.MainMenuController;
import com.dima.utils.Constants;
import com.dima.utils.Helpers;
import com.dima.utils.Printer;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainMenuView {

    public void printMainHeader() {
        Printer.printHeader("Welcome to " + Constants.APP_NAME);
    }

    public int getData(MainMenuController.Choices[] excludeOptions) {
        Printer.printHeader(Constants.MAIN_MENU_HEADER);
        printMenu(excludeOptions);
        return getUserInput();
    }

    private void printMenu(MainMenuController.Choices[] excludeOptions) {
        for (int i = 0; i < MainMenuController.CHOICES_VALUES.length; i++) {
            if (excludeOptions == null) {
                break;
            }
            if (Helpers.arrayContains(MainMenuController.CHOICES_VALUES[i], excludeOptions)) {
                continue;
            }
            System.out.println(i + " - "
                    + MainMenuController.CHOICES_VALUES[i].getMsg());
        }
    }

    private int getUserInput() {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        try {
            choice = scanner.nextInt();
            if (choice > MainMenuController.CHOICES_VALUES.length - 1) {
                System.out.println("No action associated with  " + choice);
                choice = -1;
            }
        } catch (InputMismatchException e) {
            System.out.println("Wrong input");
        }

        return choice;
    }
}
