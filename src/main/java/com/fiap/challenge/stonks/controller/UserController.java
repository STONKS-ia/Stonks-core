package com.fiap.challenge.stonks.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.fiap.challenge.stonks.model.UserModel;
import com.fiap.challenge.stonks.repository.UserRepository;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	UserRepository userRepository;

	@GetMapping()
	public ResponseEntity<List<UserModel>> getAll() {
		List<UserModel> UserModel = userRepository.findAll();
		return ResponseEntity.ok(UserModel);
	}

	@GetMapping("/{id}")
	public ResponseEntity<UserModel> findById(@PathVariable("id") Integer id, Model model) {
		UserModel UserModel = userRepository.findById(id).get();
		return ResponseEntity.ok(UserModel);
	}

	@GetMapping("/list")
	public ResponseEntity<List<UserModel>> findById(@RequestParam String fullName, @RequestParam String email) {
		if(fullName.isEmpty())
			fullName = "";
		if(email.isEmpty())
			email = "";
		List<UserModel> UserModel = userRepository.getAllFilter(fullName, email);
		return ResponseEntity.ok(UserModel);
	}

	@PostMapping
	public ResponseEntity<String> save(@RequestBody UserModel UserModel, BindingResult bindingResult){
			if(bindingResult.hasErrors()){
				return ResponseEntity.badRequest().build();
			}
			UserModel = userRepository.save(UserModel);

			URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
					.buildAndExpand(UserModel.getuserId()).toUri();

			return ResponseEntity.created(location).header("Created").body("User created");
	}


	@PutMapping("/{id}")
	public ResponseEntity<String> update(@PathVariable("id") Integer id, @RequestBody UserModel UserModel, BindingResult bindingResult) {

		if(bindingResult.hasErrors()) {
			return ResponseEntity.badRequest().build();
		}

		UserModel.setuserId(id);
		userRepository.save(UserModel);

		return ResponseEntity.ok().header("Updated").body("User updated");
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteById(@PathVariable("id") int id) {
		userRepository.deleteById(id);
		return ResponseEntity.ok().header("Deleted").body("User deleted");
	}
	
	
}