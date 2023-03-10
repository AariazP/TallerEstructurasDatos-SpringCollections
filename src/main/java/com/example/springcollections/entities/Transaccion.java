package com.example.springcollections.entities;

import jakarta.persistence.*;

@Entity
public class Transaccion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fecha;
    private String hora;
    private Double valor;
    @ManyToOne
    private Banco banco;

    public Transaccion() {
    }

    public Transaccion(String fecha, String hora, Double valor) {
        this.fecha = fecha;
        this.hora = hora;
        this.valor = valor;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }
}
