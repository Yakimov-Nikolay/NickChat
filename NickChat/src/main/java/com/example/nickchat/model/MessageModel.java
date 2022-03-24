package com.example.nickchat.model;

public class MessageModel {

    private String message;
    private String fromLogin;

    public String getMessage() {
        return message;
    }

    public MessageModel setMessage(String message) {
        this.message = message;
        return this;
    }

    public String getFromLogin() {
        return fromLogin;
    }

    public MessageModel setFromLogin(String fromLogin) {
        this.fromLogin = fromLogin;
        return this;
    }

    @Override
    public String toString() {
        return "MessageModel{" +
                "message='" + message + '\'' +
                ", fromLogin='" + fromLogin + '\'' +
                '}';
    }
}
