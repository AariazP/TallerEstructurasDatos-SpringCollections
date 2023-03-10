package com.example.springcollections.controllers;

import com.example.springcollections.entities.Cliente;
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


        Cliente cliente = new Cliente(firstName, lastName, email, password, repeatPassword, cedula, direccion, telefono, fechaNacimiento);

        if(userService.existeCliente(cliente)){
            return ResponseEntity.badRequest().body("El cliente ya existe");
        }
        userService.register(cliente);
        return ResponseEntity.ok("Cliente registrado");
    }



}
