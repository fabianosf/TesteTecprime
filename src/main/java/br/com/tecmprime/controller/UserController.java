package br.com.tecmprime.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.tecmprime.entity.User;
import br.com.tecmprime.repository.UserRepository;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	//retorna lista de usuarios 
	@GetMapping(produces="application/json")
	public @ResponseBody Iterable<User> ListaUser() {
		Iterable<User> listUser = userRepository.findAll();
		return listUser;		
	}
	
	
	//salvando um usuario
	@PostMapping()
	public User createUser(@RequestBody @Valid User user) {
		return userRepository.save(user);
				
	}
	
	//deletando user
	@DeleteMapping()
	public User deleteUser(@RequestBody User user) {
		  userRepository.delete(user);
		  return user;
	}
	
	//atualizando user
	@PutMapping()
	public User updateUser(@PathVariable("id") Long id, @RequestBody User user) {
		userRepository.saveAndFlush(user);
		return user;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	


