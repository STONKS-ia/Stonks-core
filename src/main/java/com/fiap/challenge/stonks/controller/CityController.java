package com.fiap.challenge.stonks.controller;

import java.net.URI;
import java.util.List;

import com.fiap.challenge.stonks.dto.CityDto;
import com.fiap.challenge.stonks.dto.UserDto;
import com.fiap.challenge.stonks.model.ApiResponse;
import com.fiap.challenge.stonks.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.fiap.challenge.stonks.model.City;
import com.fiap.challenge.stonks.repository.CityRepository;

import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
@RestController
@RequestMapping("/cities")
public class CityController {
	
	@Autowired
	private CityRepository cityRepository;

	@Autowired
	private CityService cityService;

	@GetMapping()
	public ApiResponse<List<CityDto>> getAll(){
		return new ApiResponse<>(HttpStatus.OK.value(), "City fetched sucessfully", cityService.getAllDto());
	}
	@GetMapping("/list")
	public ApiResponse<List<CityDto>> findByFilter(@RequestParam String name) {
		return new ApiResponse<>(HttpStatus.OK.value(), "City fetched sucessfully", cityService.getAllFilterDto(name));
	}
	@GetMapping("/{id}")
	public ApiResponse<List<CityDto>> findById(@PathVariable("id") Integer id) {
		return new ApiResponse<>(HttpStatus.OK.value(), "City fetched sucessfully", cityService.getAllByIdDto(id));
	}

	@PostMapping()
	public ResponseEntity<String> save(@RequestBody City CityModel, BindingResult bindingResult) {

		if(bindingResult.hasErrors()) {
			return ResponseEntity.badRequest().build();
		}
		
		 CityModel=  cityRepository.save(CityModel);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(CityModel.getCityId()).toUri();
		
		return ResponseEntity.created(location).header("Created").body("City created");
	} 
	
	
	@PutMapping("/{id}")
	public ResponseEntity<String> update(@PathVariable("id") int id, @RequestBody City CityModel, BindingResult bindingResult) {
		
		if(bindingResult.hasErrors()) {
			return ResponseEntity.badRequest().build();
		}
		
		CityModel.setCityId(id);
		cityRepository.save(CityModel);

		return ResponseEntity.ok().header("Updated").body("City updated");
	}
	
}
