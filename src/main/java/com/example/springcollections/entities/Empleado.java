package com.example.springcollections.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.LinkedList;

@Entity

public class Empleado extends Persona implements Comparable<Empleado>{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Getter
    @Setter
    private Long id;
    @Getter
    @Setter
    private String codigo;
    @Getter
    @Setter
    private String salario;
    @Getter
    @Setter
    private String email;
    @Getter
    @Setter
    private String password;
    @OneToMany
    private ArrayList<Cliente> listaClienteAsociados;
    @ManyToOne
    private Banco banco;

    public Empleado() {}


    public Empleado(String firstName, String lastName, String cedula, String direccion, String telefono, String fechaNacimiento, Long id, String codigo, String salario,
                    String email, String password, Banco banco) {
        super(firstName, lastName, cedula, direccion, telefono, fechaNacimiento);
        this.id = id;
        this.codigo = codigo;
        this.salario = salario;
        this.email = email;
        this.password = password;
        this.banco = banco;
        listaClienteAsociados = new ArrayList<>();
    }

    public Empleado(String codigo, String salario) {
        listaClienteAsociados = new ArrayList<>();
        this.codigo = codigo;
        this.salario = salario;
    }

    @Override
    public int compareTo(Empleado o) {
        return o.getNombre().compareTo(this.getNombre());
    }
}
