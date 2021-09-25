package com.token.jwtaauthenticator.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.token.jwtaauthenticator.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	public Optional<User> findUserByLogin(String login);
}