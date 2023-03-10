package com.example.springcollections.services;


import com.example.springcollections.entities.Cliente;
import com.example.springcollections.entities.UserRepository;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicBoolean;

@Service
@Scope("singleton")
public class UserService {

    private UserRepository userRepository;



    public boolean login(String username, String password) {
        AtomicBoolean login = new AtomicBoolean(false);

        userRepository.findAll().forEach(user -> {
            if(user.getEmail().equals(username) && user.getPassword().equals(password)) {
                login.set(true);
            }
        });

        return login.get();
    }


    public void register(String username, String password) {
      //  userRepository.save();
    }




}
