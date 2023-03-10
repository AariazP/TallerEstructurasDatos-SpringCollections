package com.example.springcollections.entities;

import jakarta.persistence.*;

import java.util.LinkedList;

@Entity
public class Empleado extends Persona implements Comparable<Empleado>{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String codigo;
    private String salario;
    @OneToMany
    @JoinColumn(name = "empleado_id")
    private LinkedList<Cliente> listaClienteAsociados;
    @ManyToOne
    private Banco banco;

    public Empleado() {}

    public Empleado(String codigo, String salario) {
        listaClienteAsociados = new LinkedList<>();
        this.codigo = codigo;
        this.salario = salario;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public LinkedList<Cliente> getListaClienteAsociados() {
        return listaClienteAsociados;
    }

    public void setListaClienteAsociados(LinkedList<Cliente> listaClienteAsociados) {
        this.listaClienteAsociados = listaClienteAsociados;
    }

    @Override
    public int compareTo(Empleado o) {
        return o.getNombre().compareTo(this.getNombre());
    }
}
