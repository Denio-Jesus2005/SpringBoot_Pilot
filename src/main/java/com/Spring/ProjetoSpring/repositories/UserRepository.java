package com.Spring.ProjetoSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Spring.ProjetoSpring.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

}
