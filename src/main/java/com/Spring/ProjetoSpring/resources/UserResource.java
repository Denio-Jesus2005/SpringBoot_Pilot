package com.Spring.ProjetoSpring.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Spring.ProjetoSpring.entities.User;
import com.Spring.ProjetoSpring.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	@Autowired
	UserService userService;

	@GetMapping
	public ResponseEntity<List<User>> findAll() {
		List<User> listUsers = userService.findAll();

		return ResponseEntity.ok().body(listUsers);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<User> findById(@PathVariable Integer id) {
		return ResponseEntity.ok().body(userService.findById(id));
	}
}
