package com.example.nickchat.storage;

public class UserStorage {

    private static UserStorage instance;

    private UserStorage(){

    }

    public static synchronized UserStorage getInstance(){
        if(instance == null){
            instance = new UserStorage();
        }
        return instance;
    }
}
