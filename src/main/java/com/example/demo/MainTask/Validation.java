package com.example.demo.MainTask;

public class Validation {

    private String login;
    private String password;

    private String myLogin="guardian";
    private String myPassword = "ghost";

    public Validation() {}

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isValid(){
        return (myLogin.equals(login) && myPassword.equals(password));
    }
}
