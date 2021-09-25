package com.token.jwtaauthenticator.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.token.jwtaauthenticator.entities.User;

public interface UserService {
	ResponseEntity<List<User>> listAll();
	ResponseEntity<User> createUser(User user);
	ResponseEntity<Boolean> validatePassword(String login, String password);
	ResponseEntity<Void> addRoleToUser(String username, String roleName);
}