package com.example.springcollections.entities;

import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;
@Entity
@Scope("singleton")
public class Banco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany(mappedBy = "banco", targetEntity = Cliente.class)
    private HashSet<Cliente> listaClientes;
    @OneToMany(mappedBy = "banco")
    private TreeSet<Empleado> listaEmpleados;
    @OneToMany(mappedBy = "banco", targetEntity = Cuenta.class)
    private HashMap<String, Cuenta> listaCuentas;


    public Banco() {

    }


}
