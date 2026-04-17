package com.example.demo;

import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public String addUser(User user) {
        userRepository.save(user);
        return "User saved in DB!";
    }

    public List<User> getUsers() {
        return userRepository.findAll();
    }
}