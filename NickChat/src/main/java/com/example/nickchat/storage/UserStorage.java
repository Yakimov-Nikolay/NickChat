package com.example.nickchat.storage;

import java.util.Set;

public class UserStorage {

    private static UserStorage instance;
    private Set<String> users;

    private UserStorage() {

    }

    public static synchronized UserStorage getInstance() {
        if (instance == null) {
            instance = new UserStorage();
        }
        return instance;
    }

    private Set<String> getUsers() {
        return users;
    }

    private void setUsers(String username) throws Exception {
        if (users.contains(username)) {
            throw new Exception("User already exist whit username: " + username);
        }
        users.add(username);
    }
}
