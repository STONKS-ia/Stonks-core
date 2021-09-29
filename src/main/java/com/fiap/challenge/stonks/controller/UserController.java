package com.fiap.challenge.stonks.controller;

import java.net.URI;
import java.util.List;

import com.fiap.challenge.stonks.dto.UserDto;
import com.fiap.challenge.stonks.model.ApiResponse;
import com.fiap.challenge.stonks.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

import com.fiap.challenge.stonks.model.User;
import com.fiap.challenge.stonks.repository.UserRepository;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserRepository userRepository;
	@Autowired
	private UserService userService;

	@GetMapping()
	public ApiResponse<List<UserDto>> getAll(){
		return new ApiResponse<>(HttpStatus.OK.value(), "User fetched sucessfully", userService.getAllDto());
	}
	@GetMapping("/list")
	public ApiResponse<List<UserDto>> findByFilter(@RequestParam String fullName, @RequestParam String email) {
		return new ApiResponse<>(HttpStatus.OK.value(), "User fetched sucessfully", userService.getAllFilterDto(fullName, email));
	}
	@GetMapping("/{id}")
	public ApiResponse<List<UserDto>> findById(@PathVariable("id") Integer id) {
		return new ApiResponse<>(HttpStatus.OK.value(), "User fetched sucessfully", userService.getAllByIdDto(id));
	}

	@PostMapping
	public ResponseEntity<String> save(@RequestBody User UserModel, BindingResult bindingResult){
			if(bindingResult.hasErrors()){
				return ResponseEntity.badRequest().build();
			}
			UserModel = userRepository.save(UserModel);

			URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
					.buildAndExpand(UserModel.getUserId()).toUri();

			return ResponseEntity.created(location).header("Created").body("User created");
	}


	@PutMapping("/{id}")
	public ResponseEntity<String> update(@PathVariable("id") Integer id, @RequestBody User UserModel, BindingResult bindingResult) {

		if(bindingResult.hasErrors()) {
			return ResponseEntity.badRequest().build();
		}

		UserModel.setUserId(id);
		userRepository.save(UserModel);

		return ResponseEntity.ok().header("Updated").body("User updated");
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteById(@PathVariable("id") int id) {
		userRepository.deleteById(id);
		return ResponseEntity.ok().header("Deleted").body("User deleted");
	}
	
}