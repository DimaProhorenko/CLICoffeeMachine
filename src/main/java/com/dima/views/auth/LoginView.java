package com.dima.views.auth;

import com.dima.utils.Constants;
import com.dima.utils.Printer;

import java.util.Scanner;

public class LoginView {

    public String[] getData() {
        Printer.printHeader(Constants.LOGIN_HEADER);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter username: ");
        String userName = scanner.next();
        scanner.nextLine();
        System.out.println("Enter password");
        String password = scanner.next();
        scanner.nextLine();
        return new String[] {userName, password};
    }

    public void printLoginSuccess() {
        Printer.printHeader("Logged in successfully");
    }

    public void printLoginError() {
        Printer.printHeader("Logging in failed");
    }
}
