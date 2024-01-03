package com.gravity9.vodafonepoc.controller;

import com.gravity9.vodafonepoc.model.User;
import com.gravity9.vodafonepoc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(path = "/users")
    public ResponseEntity<List<User>> getAllUsers() {
        return ResponseEntity.ok().body(userService.getUsers());
    }

    @GetMapping(path = "/users/{id}")
    public ResponseEntity<User> getUserByIdPath(@PathVariable String id) {
        return ResponseEntity.ok().body(userService.getUserById(id));
    }

    @PostMapping(path = "/users")
    public ResponseEntity<User> saveUser(@RequestBody User user) {
        return ResponseEntity.ok(userService.saveUser(user));
    }

}
