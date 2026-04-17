package com.example.demo;

import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class UserService {

    List<User> users = new ArrayList<>();

    public String addUser(User user) {
        users.add(user);
        return "User added successfully!";
    }

    public List<User> getUsers() {
        return users;
    }
}