package com.example.springcollections.entities;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Cliente, Long> {
}
