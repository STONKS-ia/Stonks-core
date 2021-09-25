package com.fiap.challenge.stonks.service;

import java.util.List;

import javax.management.relation.RoleNotFoundException;

import com.fiap.challenge.stonks.model.Role;
import org.springframework.http.ResponseEntity;

public interface RoleService {
	
	ResponseEntity<Void> createRole(String roleName);
	ResponseEntity<Void> deleteRole(String roleName) throws RoleNotFoundException;
	ResponseEntity<Void> updateRole(String roleName, String oldRoleName) throws RoleNotFoundException;
	ResponseEntity<List<Role>> findAllRoles();
}