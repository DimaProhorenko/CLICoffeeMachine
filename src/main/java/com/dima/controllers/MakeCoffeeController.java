package com.dima.controllers;

import com.dima.views.MakeCoffeeView;

public class MakeCoffeeController {
    public enum CoffeeKinds {
        LATTE("Latte"),
        ESPRESSO("Espresso");

        private String name;

        CoffeeKinds(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }
    public final static CoffeeKinds[] COFFEE_KINDS_VALUES = CoffeeKinds.values();
    private MakeCoffeeView view;

    public MakeCoffeeController() {
        view = new MakeCoffeeView();
    }

    public void handleData() {
        int choice = view.getData();
        if (choice != -1) {
            switch (COFFEE_KINDS_VALUES[choice-1]) {
                case LATTE -> System.out.println("Making latte");
                case ESPRESSO -> System.out.println("Making espresso");
            }
        }
    }
}
