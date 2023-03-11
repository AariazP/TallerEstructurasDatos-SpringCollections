package com.example.springcollections.entities;

public interface IBanco {

    Double consultarSaldo(String numeroCuenta);
    void crearEmpleado(Empleado empleado);

    void actualizarEmpleado(Empleado empleado);

    void eliminarEmpleado();

    void eliminarEmpleado(Empleado empleado);

    void obtenerEmpleado();
    void crearCliente();
    void actualizarCliente();
    void eliminarCliente();
    void obtenerCliente();
    void realizarTransaccion();
    double retirarDineroCuenta();
    void depositarDineroCuenta();


}
