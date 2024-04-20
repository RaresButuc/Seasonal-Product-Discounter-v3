package com.codecool.seasonalproductdiscounter.ui;

import com.codecool.seasonalproductdiscounter.model.users.User;

import java.util.Scanner;

public abstract class UiBase {
    private final boolean authenticationNeeded;
    private final String title;

    protected UiBase(boolean authenticationNeeded, String title) {
        this.title = title;
        this.authenticationNeeded = authenticationNeeded;
    }

    protected static String getTextInput(String text) {
        String input = "";

        while (input.isEmpty()) {
            System.out.print(text);
            input = new Scanner(System.in).nextLine();
        }

        return input;
    }

    protected User getUser() {
        String userName = getTextInput("Enter the USERNAME:");
        String userPassword = getTextInput("Enter the PASSWORD:");
        return new User(userName, userPassword);
    }

    public void displayTitle() {
        System.out.println(title);
    }

    public boolean isAuthenticationNeeded() {
        return authenticationNeeded;
    }

    //    public boolean authenticate() {
//        User user = getUser();
//        return authenticationService.authenticate(user);
//    }
    public abstract void run();
}


