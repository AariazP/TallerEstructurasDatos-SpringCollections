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


    @GetMapping("/signIn")
    public String login(@RequestParam String email, @RequestParam String password) {
        if (userService.login(email, password)) {
            // Si el inicio de sesión es correcto, redirigir al usuario a la página de inicio.
            System.out.println("Login correcto");
            return "redirect:/index.html";
        } else {
            // Si las credenciales son incorrectas, mostrar un mensaje de error.
            System.out.println("Login incorrecto");
            return "Lo siento, sus credenciales no son válidas. <a href=\"/forgot-password.html\">¿Olvidó su contraseña?</a>";
        }
    }



}
