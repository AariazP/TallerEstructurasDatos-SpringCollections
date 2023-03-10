package com.example.springcollections;

import com.example.springcollections.entities.UserRepository;
import com.example.springcollections.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringCollectionsApplication {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringCollectionsApplication.class, args);
        UserService userService = context.getBean(UserService.class);
        userService.register("admin@gmail.com", "1234");
    }

}
