package com.example.kodillatesting.user;

public class SimpleUser {

    private String username;

    public SimpleUser(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "SimpleUser{" +
                "username='" + username + '\'' +
                '}';
    }
}