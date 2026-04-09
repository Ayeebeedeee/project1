package com.example.demo;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
public class UserController {

    List<User> users = new ArrayList<>();

    @PostMapping("/addUser")
    public String addUser(@RequestBody User user) {
        users.add(user);
        return "User added successfully!";
    }

    @GetMapping("/getUsers")
    public List<User> getUsers() {
        return users;
    }
}