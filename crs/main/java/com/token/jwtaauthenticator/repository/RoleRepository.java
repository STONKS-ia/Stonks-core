package com.token.jwtaauthenticator.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.token.jwtaauthenticator.entities.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{
	
	Optional<Role> findByName(String name);
}