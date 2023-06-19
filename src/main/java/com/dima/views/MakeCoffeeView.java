package com.dima.views;

import com.dima.controllers.MakeCoffeeController;
import com.dima.utils.Constants;
import com.dima.utils.Printer;

public class MakeCoffeeView {
    public void getData() {
        Printer.printHeader(Constants.MAKE_COFFEE_HEADER);
        printMenu();
    }

    private void printMenu() {
        for (int i = 0; i < MakeCoffeeController.COFFEE_KINDS_VALUES.length; i++) {
            System.out.println(i + 1 + " - " + MakeCoffeeController.COFFEE_KINDS_VALUES[i].getName());
        }
    }
}
