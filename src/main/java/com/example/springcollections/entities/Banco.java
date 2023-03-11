package com.example.springcollections.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Scope;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

@Scope("singleton")
@Getter
@Setter
public class Banco implements IBanco{


    private Long id;
    @OneToMany(mappedBy = "banco", targetEntity = Cliente.class)
    private HashSet<Cliente> listaClientes;
    @OneToMany(mappedBy = "banco")
    private TreeSet<Empleado> listaEmpleados;
    @OneToMany(mappedBy = "banco", targetEntity = Cuenta.class)
    private HashMap<String, Cuenta> listaCuentas;


    public Banco() {

    }


    @Override
    public Double consultarSaldo(String numeroCuenta) {
        //recorrer la lista de cuentas
        //si el número de cuenta es igual al número de cuenta que se está buscando
        //retornar el saldo de la cuenta

        for (Cuenta cuenta : listaCuentas.values()) {
            if (cuenta.getNumeroCuenta().equals(numeroCuenta)) {
                return cuenta.getSaldo();
            }
        }

        return null;

    }

    @Override
    public void crearEmpleado(Empleado empleado) {
        listaEmpleados.add(empleado);

    }

    @Override
    public void actualizarEmpleado(Empleado empleado) {

        listaEmpleados.forEach(empleado1 -> {
            if (empleado1.getId().equals(empleado.getId())) {
                empleado1.setNombre(empleado.getNombre());
                empleado1.setApellido(empleado.getApellido());
                empleado1.setCedula(empleado.getCedula());
                empleado1.setDireccion(empleado.getDireccion());
                empleado1.setTelefono(empleado.getTelefono());
                empleado1.setFechaNacimiento(empleado.getFechaNacimiento());
                empleado1.setCodigo(empleado.getCodigo());
                empleado1.setSalario(empleado.getSalario());
                empleado1.setEmail(empleado.getEmail());
                empleado1.setPassword(empleado.getPassword());
            }
        });

    }

    @Override
    public void eliminarEmpleado(Empleado empleado) {
        listaEmpleados.remove(empleado);

    }

    @Override
    public void obtenerEmpleado() {

    }

    @Override
    public void crearCliente() {

    }

    @Override
    public void actualizarCliente() {

    }

    @Override
    public void eliminarCliente() {

    }

    @Override
    public void obtenerCliente() {

    }

    @Override
    public void realizarTransaccion() {

    }

    @Override
    public double retirarDineroCuenta() {
        return 0;
    }

    @Override
    public void depositarDineroCuenta() {

    }
}
