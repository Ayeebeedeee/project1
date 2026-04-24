package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // CREATE
    public String addUser(User user) {
        userRepository.save(user);
        return "User saved!";
    }

    // UPDATE
    public String updateUser(User user) {
        if (user.getId() == null || !userRepository.existsById(user.getId())) {
            throw new UserNotFoundException("User not found with id: " + user.getId());
        }

        userRepository.save(user);
        return "User updated!";
    }

    // GET
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    // DELETE
    public String deleteUser(Integer id) {
        if (!userRepository.existsById(id)) {
            throw new UserNotFoundException("User not found with id: " + id);
        }

        userRepository.deleteById(id);
        return "User deleted!";
    }
}