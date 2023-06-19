package com.dima.controllers;

import com.dima.views.MakeCoffeeView;

public class MakeCoffeeController {
    private MakeCoffeeView view;

    public MakeCoffeeController() {
        view = new MakeCoffeeView();
    }

    public void handleData() {
        view.getData();
    }
}
