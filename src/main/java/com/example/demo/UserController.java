package com.example.demo;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    // CREATE
    @PostMapping
    public String addUser(@RequestBody User user) {
        return userService.addUser(user);
    }

    // GET ALL
    @GetMapping
    public List<User> getUsers() {
        return userService.getUsers();
    }

    // GET BY ID 🔥
    @GetMapping("/{id}")
    public User getUser(@PathVariable Integer id) {
        return userService.getUserById(id);
    }

    // UPDATE
    @PutMapping
    public String updateUser(@RequestBody User user) {
        return userService.updateUser(user);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable Integer id) {
        return userService.deleteUser(id);
    }
}