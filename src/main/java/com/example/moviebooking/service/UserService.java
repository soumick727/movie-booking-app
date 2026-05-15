package com.example.moviebooking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.moviebooking.entity.User;
import com.example.moviebooking.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    //Register User
    public User registerUser(User user) {
        return userRepository.save(user);
    }

    //login user
    public String loginUser(String username, String password) {
        User user = userRepository.findByUsername(username);
        if (user != null && user.getPassword().equals(password)) {
            return "Login successful";
        }
        return "invalid username or password";
    }

    //get user by id
    public User getUserById(long id) {
        return userRepository.findById(id).orElse(null);
    }

    //get all user
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}

