package com.dima.utils;

public abstract class Printer {


    public static void printHeader(String header) {
        int headerLength = header.length();
        printSeparator(headerLength);
        System.out.println(header);
        printSeparator(headerLength);
    }


    private static void printSeparator(int quantity, String delimeter) {
        System.out.println(delimeter.repeat(quantity));
    }

    private static void printSeparator(int quantity) {
        printSeparator(quantity, Constants.PRINTER_DELIMETER);
    }
}
