package com.dima.views;

import com.dima.controllers.MainMenuController;
import com.dima.controllers.MakeCoffeeController;
import com.dima.utils.Constants;
import com.dima.utils.Printer;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MakeCoffeeView {
    public int getData() {
        Printer.printHeader(Constants.MAKE_COFFEE_HEADER);
        printMenu();

        Scanner scanner = new Scanner(System.in);
        int choice = -1;
        while (choice == -1) {
            try {
                choice = scanner.nextInt();
                if (choice < 0 || choice > MainMenuController.CHOICES_VALUES.length) {
                    System.out.println("Wrong input " + choice);
                    choice = -1;
                }
            } catch (InputMismatchException e) {
                System.out.println("Wrong input");
            }
        }

        return choice;
    }

    private void printMenu() {
        for (int i = 0; i < MakeCoffeeController.COFFEE_KINDS_VALUES.length; i++) {
            System.out.println(i + 1 + " - " + MakeCoffeeController.COFFEE_KINDS_VALUES[i].getName());
        }
    }
}
