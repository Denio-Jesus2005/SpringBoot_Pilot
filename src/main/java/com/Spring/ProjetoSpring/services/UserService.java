package com.Spring.ProjetoSpring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Spring.ProjetoSpring.entities.User;
import com.Spring.ProjetoSpring.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository repository;
	
	public List<User> findAll() {
		return repository.findAll();
	}
	
	public User findById(Integer id) {
		User user = repository.findById(id)
			.orElseThrow(() -> new RuntimeException("Pedido não encontrado"));
		return user;
	}
	
}
