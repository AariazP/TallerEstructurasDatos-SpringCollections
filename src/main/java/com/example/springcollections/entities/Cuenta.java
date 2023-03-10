package com.example.springcollections.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedList;
import java.util.Objects;
@Entity
@Getter
@Setter
public class Cuenta implements ICuenta{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String numeroCuenta;
    private Double saldo;
    @ManyToOne
    private Banco banco;
    @OneToMany(mappedBy = "cuenta")
    private LinkedList<Transaccion> listaTransacciones;
    @OneToOne
    private Cliente cliente;


    public Cuenta() {
    }

    public Cuenta(String numeroCuenta, Double saldo) {
        listaTransacciones = new LinkedList<>();
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cuenta cuenta = (Cuenta) o;
        return Objects.equals(numeroCuenta, cuenta.numeroCuenta) && Objects.equals(saldo, cuenta.saldo) && Objects.equals(banco, cuenta.banco);
    }





    @Override
    public int hashCode() {
        return Objects.hash(numeroCuenta, saldo, banco);
    }

    @Override
    public Double retirarDinero() {
        return null;
    }

    @Override
    public void depositarDinero() {

    }

    @Override
    public Double consultarSaldo() {
        return null;
    }
}
