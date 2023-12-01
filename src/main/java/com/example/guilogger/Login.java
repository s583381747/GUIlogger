package com.example.guilogger;

public class Login {
    private String name;
    private String password;

    public Login() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return this.name;
    }

    public String getPassword() {
        return this.password;
    }

    public int getPasswordLength() {
        return this.password.length();
    }
}
