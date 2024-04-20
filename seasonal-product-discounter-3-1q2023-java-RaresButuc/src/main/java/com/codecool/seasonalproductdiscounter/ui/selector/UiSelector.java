package com.codecool.seasonalproductdiscounter.ui.selector;

import com.codecool.seasonalproductdiscounter.ui.UiBase;
import com.codecool.seasonalproductdiscounter.ui.factory.StatisticsUiFactory;
import com.codecool.seasonalproductdiscounter.ui.factory.UiFactoryBase;

import java.util.List;
import java.util.Scanner;

public class UiSelector {
    private final List<UiFactoryBase> factories;

    public UiSelector(List<UiFactoryBase> factories) {
        this.factories = factories;
    }

    public UiBase select() {
        System.out.println("Welcome to Seasonal Product Discounter v3");
        displayMenu();

        int code = getIntInput();

        return factories.get(code - 1).create();
    }

    private void displayMenu() {
        System.out.println("Available screens:");
        for (int i = 0; i < factories.size(); i++) {
            System.out.println((i + 1) + ". " + factories.get(i).getUiName());
        }
    }

    private static int getIntInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}

