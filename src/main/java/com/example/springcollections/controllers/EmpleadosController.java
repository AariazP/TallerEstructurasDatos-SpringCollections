package com.example.springcollections.controllers;

import com.example.springcollections.entities.Empleado;
import com.example.springcollections.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmpleadosController {

    @Autowired
    public UserService userService;

    @GetMapping("/empleados")
    public List<Empleado> getEmpleados() {
       return userService.getEmpleados();
    }

}
