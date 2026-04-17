package com.example.demo;

import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {

    @Id
    private int id;

    private String name;
    private String email;

    public User() {}   // IMPORTANT (default constructor)

    public User(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }
}