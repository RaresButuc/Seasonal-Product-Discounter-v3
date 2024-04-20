package com.codecool.seasonalproductdiscounter.service.users;

import com.codecool.seasonalproductdiscounter.model.users.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class AuthenticationServiceImpl implements AuthenticationService {
    public List<User> currentUsersInfos() {
        List<User> existingUsers = new ArrayList<>();
        existingUsers.add(new User("Rares", "2002"));
        existingUsers.add(new User("Sinziana", "1993"));
        existingUsers.add(new User("Silvia", "1999"));
        return existingUsers;
    }

    @Override
    public boolean authenticate(User user) {
        for (User userInfo :
                currentUsersInfos()) {
            if (Objects.equals(userInfo.userName(), user.userName()) && Objects.equals(userInfo.password(), user.password())) {
                return true;
            }
        }
        return false;
    }
}
