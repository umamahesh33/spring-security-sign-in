package com.example.springsecuritysignin.requestPOJO;



public class userRequest{

    private String username;
    private  String password;

    public userRequest(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public userRequest() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
