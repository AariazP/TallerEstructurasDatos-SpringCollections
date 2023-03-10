package com.example.springcollections.controllers;

import com.example.springcollections.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {

    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String login() {
        return "login.html";
    }


    @PostMapping("/login")
    public String login(@RequestParam("email") String username, @RequestParam("password") String password) {
        if(userService.login(username, password)) {
            return "index.html";
        } else {
            return "login.html";
        }
    }




}
