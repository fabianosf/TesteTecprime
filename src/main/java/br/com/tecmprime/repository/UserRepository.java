package br.com.tecmprime.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.tecmprime.entity.User;


public interface UserRepository extends JpaRepository<User, Integer>{

}
