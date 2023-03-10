package com.example.springcollections.entities;

public interface IBanco {

    Double consultarSaldo();
    void crearEmpleado();
    void actualizarEmpleado();
    void eliminarEmpleado();
    void obtenerEmpleado();
    void crearCliente();
    void actualizarCliente();
    void eliminarCliente();
    void obtenerCliente();
    void realizarTransaccion();
    double retirarDineroCuenta();
    void depositarDineroCuenta();


}
