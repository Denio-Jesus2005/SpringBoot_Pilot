package com.Spring.ProjetoSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Spring.ProjetoSpring.entities.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
