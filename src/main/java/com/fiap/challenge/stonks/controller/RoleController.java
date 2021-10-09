package com.fiap.challenge.stonks.controller;

import java.util.List;

import javax.management.relation.RoleNotFoundException;

import com.fiap.challenge.stonks.model.Role;
import com.fiap.challenge.stonks.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
@RestController
@RequestMapping(path = "/role", produces = MediaType.APPLICATION_JSON_VALUE)
public class RoleController {
	
	@Autowired
	RoleService roleService;
	
	@PostMapping(path = "/save", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Void> saveRole(@RequestBody String rolename){
		
		return roleService.createRole(rolename);
	}
	
	@GetMapping(path = "/listall", consumes = MediaType.ALL_VALUE)
	public ResponseEntity<List<Role>> findAllRoles(){
		
		return roleService.findAllRoles();
	}
	
	@DeleteMapping(path = "/delete", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Void> deleteRole(@RequestBody String role) throws RoleNotFoundException{
		
		return roleService.deleteRole(role);
	}
	
	@PatchMapping(path = "/update", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Void> updateRole(@RequestBody String rolename, @RequestBody String oldRolename) throws RoleNotFoundException{
		
		return roleService.updateRole(rolename, oldRolename);
	}
}