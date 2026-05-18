package com.example.demo.controller.Model;

public class User {
    private final String name;
    private final String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }
    // Getters and Setters
    public String getName() { return name; }
    public String getEmail() { return email; }
}