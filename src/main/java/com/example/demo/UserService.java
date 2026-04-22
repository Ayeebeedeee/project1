package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public String addUser(User user) {
        userRepository.save(user);
        return "User saved in DB!";
    }
    public String updateUser(User user) {
    userRepository.save(user);
    return "User updated successfully!";
    }
    public List<User> getUsers() {
        return userRepository.findAll();
    }
}