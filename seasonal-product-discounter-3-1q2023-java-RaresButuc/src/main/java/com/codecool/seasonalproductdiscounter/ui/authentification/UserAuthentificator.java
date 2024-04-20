package com.codecool.seasonalproductdiscounter.ui.authentification;

import com.codecool.seasonalproductdiscounter.model.users.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class UserAuthentificator {
    public List<User> currentUsersInfos() {
        List<User> existingUsers = new ArrayList<>();
        existingUsers.add(new User("Rares", "2002"));
        existingUsers.add(new User("Sinziana", "1993"));
        existingUsers.add(new User("Silvia", "1999"));
        return existingUsers;
    }

    public boolean authenticate(User user) {
        for (User userInfo :
                currentUsersInfos()) {
            if (Objects.equals(userInfo.userName(), user.userName()) && Objects.equals(userInfo.password(), user.password())) {
                return true;
            }
        }
        return false;
    }

    public User getUser() {
        String userName = getTextInput("Enter the USERNAME:");
        String userPassword = getTextInput("Enter the PASSWORD:");
        return new User(userName, userPassword);
    }

    protected static String getTextInput(String text) {
        String input = "";

        while (input.isEmpty()) {
            System.out.print(text);
            input = new Scanner(System.in).nextLine();
        }

        return input;
    }
}
