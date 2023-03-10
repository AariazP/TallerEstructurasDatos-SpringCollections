package com.example.springcollections.controllers;

import com.example.springcollections.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {

    @Autowired
    private UserService userService;

    @GetMapping("/login")
    public String login() {
        return "login.html";
    }


    @PostMapping("/signIn")
    public ResponseEntity<String> login(@RequestParam String email, @RequestParam String password) {
        if (userService.login(email, password)) {
            // Si el inicio de sesión es correcto, redirigir al usuario a la página de inicio.
            return ResponseEntity.ok("Login correcto");
        } else {
            // Si las credenciales son incorrectas, mostrar un mensaje de error.
            return ResponseEntity.badRequest().body("Login incorrecto");
        }
    }



}
