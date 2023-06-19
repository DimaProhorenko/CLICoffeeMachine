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
        view.getData();
    }
}
