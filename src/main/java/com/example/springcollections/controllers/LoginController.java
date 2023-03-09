package com.example.springcollections.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {


    @RequestMapping("/")
    public String login() {
        return "login.html";
    }


    @PostMapping("/login")
    public void login(@RequestParam("username") String username, @RequestParam("password") String password) {
        System.out.println("Received username: " + username);
        System.out.println("Received password: " + password);
    




}
