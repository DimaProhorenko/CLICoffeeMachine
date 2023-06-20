package com.dima.utils;

import java.util.Arrays;

public class Helpers {

    public static <T> boolean arrayContains(T el, T[] arr) {
        for (T t : arr) {
            if (el.equals(t)) {
                return true;
            }
        }
        return false;
    }
}
