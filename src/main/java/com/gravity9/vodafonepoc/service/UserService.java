package com.gravity9.vodafonepoc.service;

import com.gravity9.vodafonepoc.model.User;
import com.gravity9.vodafonepoc.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getUsers() {
        return userRepository.findAll();
    }

    public User getUserById(String id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("No user by ID: " + id));
    }

    public User saveUser(User user) {
        return userRepository.save(user);
    }

}