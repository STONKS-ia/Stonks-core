package com.fiap.challenge.stonks.controller;

import java.net.URI;
import java.util.List;

import com.fiap.challenge.stonks.dto.RequestAddRoleDto;
import com.fiap.challenge.stonks.dto.UserDto;
import com.fiap.challenge.stonks.model.ApiResponse;
import com.fiap.challenge.stonks.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.fiap.challenge.stonks.model.User;
import com.fiap.challenge.stonks.repository.UserRepository;

@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private UserService userService;

	@GetMapping()
	public ApiResponse<List<UserDto>> getAll(){
		return new ApiResponse<>(HttpStatus.OK.value(), "User fetched sucessfully", userService.getAll());
	}
	@GetMapping("/list")
	public ApiResponse<List<UserDto>> findByFilter(@RequestParam String fullName, @RequestParam String email) {
		return new ApiResponse<>(HttpStatus.OK.value(), "User fetched sucessfully", userService.getAllFilterDto(fullName, email));
	}
	@GetMapping("/{id}")
	public ApiResponse<List<UserDto>> findById(@PathVariable("id") int id) {
		return new ApiResponse<>(HttpStatus.OK.value(), "User fetched sucessfully", userService.getAllByIdDto(id));
	}

	@PostMapping(path = "/save", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ApiResponse<User> create(@RequestParam String roles, @RequestBody User user) {
		userService.createUser(user);
		userService.addRoleToUser(user.getLogin(), roles);
		return new ApiResponse<>(HttpStatus.OK.value(), "User Created sucessfully", user);
	}

	@PutMapping("/{id}")
	public ResponseEntity<String> update(@PathVariable("id") Integer id, @RequestBody User UserModel, BindingResult bindingResult) {

		if(bindingResult.hasErrors()) {
			return ResponseEntity.badRequest().build();
		}

		userRepository.save(UserModel);

		return ResponseEntity.ok().header("Updated").body("User updated");
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteById(@PathVariable("id") int id) {
		userRepository.deleteById(id);
		return ResponseEntity.ok().header("Deleted").body("User deleted");
	}

	@PostMapping("/addRole")
	public ApiResponse<Void> addRoleToUser(@RequestBody RequestAddRoleDto request){
		return new ApiResponse<>(HttpStatus.OK.value(), "Role added to user sucessfully", userService.addRoleToUser(request.getLogin(), request.getRole()));
	}

}