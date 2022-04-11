package com.example.kodillatesting.user;

public class SimpleUser {

    private String username;
    private String realName;

    public SimpleUser(String username, String realName) {
        this.username = username;
        this.realName = realName;
    }

    public String getUsername() {
        return username;
    }

    public String getRealName() {
        return realName;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    @Override
    public String toString() {
        return "SimpleUser{" +
                "username='" + username + '\'' +
                '}';
    }
}