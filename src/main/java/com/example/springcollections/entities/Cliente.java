package com.example.springcollections.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;
@Entity
@Getter
@Setter
public class Cliente extends Persona implements Comparable<Cliente>{


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Empleado empleadoAsociado;
    @ManyToOne
    private  Banco banco;
    @OneToOne(mappedBy = "cliente")
    private Cuenta cuenta;


    public Cliente() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(empleadoAsociado, cliente.empleadoAsociado) && Objects.equals(banco, cliente.banco) && Objects.equals(cuenta, cliente.cuenta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empleadoAsociado, banco, cuenta);
    }

    @Override
    public int compareTo(Cliente o) {
        return this.getNombre().compareTo(o.getNombre());
    }


}
