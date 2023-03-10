package com.example.springcollections;

import com.example.springcollections.entities.Banco;
import com.example.springcollections.entities.Empleado;
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
       // userService.register("admin@gmail.com", "1234");
        Empleado Empleado1 = new Empleado("John", "Doe", "1234567890", "123 Main St", "555-1234", "01/01/2000", 1L, "EMP-001",
                "$45,000", "empleado1@empresa.com", "password123", new Banco());

        Empleado Empleado2 = new Empleado("Jane", "Doe", "0987654321", "456 Main St", "555-5678", "02/02/2000", 2L, "EMP-002",
                "$60,000", "empleado2@empresa.com", "password123", new Banco());

        Empleado Empleado3 = new Empleado("Bob", "Smith", "1111111111", "789 Main St", "555-9012", "03/03/2000", 3L, "EMP-003",
                "$75,000", "empleado3@empresa.com", "password123", new Banco());

        Empleado Empleado4 = new Empleado("Alice", "Johnson", "2222222222", "321 Main St", "555-3456", "04/04/2000", 4L, "EMP-004",
                "$90,000", "empleado4@empresa.com", "password123", new Banco());

        Empleado Empleado5 = new Empleado("Charlie", "Brown", "3333333333", "654 Main St", "555-7890", "05/05/2000", 5L, "EMP-005",
                "$105,000", "empleado5@empresa.com", "password123", new Banco());

        userService.registerEmpleado(Empleado1);
        userService.registerEmpleado(Empleado2);
        userService.registerEmpleado(Empleado3);
        userService.registerEmpleado(Empleado4);
        userService.registerEmpleado(Empleado5);



    }

}
