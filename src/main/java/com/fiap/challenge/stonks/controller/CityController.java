package com.fiap.challenge.stonks.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.fiap.challenge.stonks.model.CityModel;
import com.fiap.challenge.stonks.repository.CityRepository;

@RestController
@RequestMapping("/cities")
public class CityController {
	
	@Autowired
	CityRepository cityRepository;

	@GetMapping()
	public ResponseEntity<List<CityModel>> getAll(){
		List<CityModel> CityModel = cityRepository.findAll();

		return ResponseEntity.ok(CityModel);
	}

	@GetMapping("/list")
	public ResponseEntity<List<CityModel>> findById(@RequestParam String name) {
		if(name.isEmpty())
			name = "";
		List<CityModel> CityModel = cityRepository.getAllFilter(name);
		return ResponseEntity.ok(CityModel);
	}

	@GetMapping("/{id}")
	public ResponseEntity<CityModel> findById(@PathVariable("id") int id, Model model) {

		CityModel CityModel =  cityRepository.findById(id).get();

		return ResponseEntity.ok(CityModel);
	}

	@PostMapping()
	public ResponseEntity<String> save(@RequestBody CityModel CityModel, BindingResult bindingResult) {

		if(bindingResult.hasErrors()) {
			return ResponseEntity.badRequest().build();
		}
		
		 CityModel=  cityRepository.save(CityModel);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(CityModel.getcityId()).toUri();
		
		return ResponseEntity.created(location).header("Created").body("City created");
	} 
	
	
	@PutMapping("/{id}")
	public ResponseEntity<String> update(@PathVariable("id") int id, @RequestBody CityModel CityModel, BindingResult bindingResult) {
		
		if(bindingResult.hasErrors()) {
			return ResponseEntity.badRequest().build();
		}
		
		CityModel.setcityId(id);
		cityRepository.save(CityModel);

		return ResponseEntity.ok().header("Updated").body("City updated");
	}
	
}
