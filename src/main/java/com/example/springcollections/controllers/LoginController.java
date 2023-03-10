package com.example.springcollections.controllers;

import com.example.springcollections.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public String login() {
        return "login.html";
    }


    @PostMapping("/login")
    public void login(@RequestParam("email") String username, @RequestParam("password") String password) {
        System.out.println("Received username: " + username);
        System.out.println("Received password: " + password);
    }




}
