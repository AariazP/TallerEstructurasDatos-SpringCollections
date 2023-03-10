package com.example.springcollections.controllers;

import com.example.springcollections.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrerController {

    @Autowired
    private UserService userService;



    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestParam("firstName") String firstName,
                                           @RequestParam("lastName") String lastName,
                                           @RequestParam("email") String email,
                                           @RequestParam("password") String password,
                                           @RequestParam("repeatPassword") String repeatPassword,
                                           @RequestParam("cedula") String cedula,
                                           @RequestParam("direccion") String direccion,
                                           @RequestParam("telefono") String telefono,
                                           @RequestParam("fechaNacimiento") String fechaNacimiento) {
        System.out.println(" Llega una request http post a /register");
        System.out.println("firstName+ = " + firstName + "lastName = " + lastName + "email = " + email + "password = " + password + "repeatPassword = " + repeatPassword + "cedula = " + cedula + "direccion = " + direccion + "telefono = " + telefono + "fechaNacimiento = " + fechaNacimiento);
        return ResponseEntity.badRequest().body("Registro incorrecto");
    }



}
