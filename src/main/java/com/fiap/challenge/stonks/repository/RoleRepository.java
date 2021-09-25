package com.fiap.challenge.stonks.repository;

import java.util.Optional;

import com.fiap.challenge.stonks.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;


public interface RoleRepository extends JpaRepository<Role, Long>{
	
	Optional<Role> findByName(String name);
}