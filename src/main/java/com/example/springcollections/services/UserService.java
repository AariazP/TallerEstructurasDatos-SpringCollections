package com.example.springcollections.services;


import com.example.springcollections.entities.Cliente;
import com.example.springcollections.entities.Empleado;
import com.example.springcollections.entities.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

@Service
@Scope("singleton")
public class UserService {

    @Autowired
    private UserRepository userRepository;



    public boolean login(String username, String password) {

        AtomicBoolean login = new AtomicBoolean(false);

        userRepository.findAll().forEach(user -> {
            if(user instanceof Cliente cliente) {
                if(cliente.getEmail().equals(username) && cliente.getPassword().equals(password)) {
                    login.set(true);
                }
            }
            if(user instanceof Empleado empleado) {
                if(empleado.getEmail().equals(username) && empleado.getPassword().equals(password)) {
                    login.set(true);
                }
            }
        });
        return login.get();
    }


    public void register(String username, String password) {
          Cliente user = new Cliente();
          user.setEmail(username);
          user.setPassword(password);
          System.out.println(" Creado el cliente con: "+user.getEmail()+" y "+user.getPassword() );
          userRepository.save(user);

    }


    public boolean existeCliente(Cliente cliente) {
        AtomicBoolean existe = new AtomicBoolean(false);

        userRepository.findAll().forEach(user -> {
            if(user instanceof Cliente cliente1) {
                if(cliente1.getEmail().equals(cliente.getEmail())) {
                    existe.set(true);
                }
            }
        });
        return existe.get();

    }

    public void register(Cliente cliente) {
        userRepository.save(cliente);

    }
}
