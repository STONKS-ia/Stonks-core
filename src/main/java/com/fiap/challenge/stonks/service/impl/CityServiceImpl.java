package com.fiap.challenge.stonks.service.impl;

import com.fiap.challenge.stonks.dto.CityDto;
import com.fiap.challenge.stonks.model.City;
import com.fiap.challenge.stonks.model.Role;
import com.fiap.challenge.stonks.model.User;
import com.fiap.challenge.stonks.repository.CityRepository;
import com.fiap.challenge.stonks.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service("CityService")
public class CityServiceImpl implements CityService {

    @Autowired
    private CityRepository cityRepository;

    @Override
    public ResponseEntity<City> createCity(City city) {

        cityRepository.save(city);

        return ResponseEntity.created(null).build();
    }

    @Override
    public List<City> getAll() {
        return cityRepository.findAll();
    }

    @Override
    public List<CityDto> getAllDto() {
        return getAll().stream().map(CityDto::from).collect(Collectors.toList());
    }

    @Override
    public Page<City> getPaged(String name, Integer page) {
        Pageable paging = PageRequest.of(page, 40);
        return cityRepository.findPaged(name, paging);
    }
    @Override
    public Page<CityDto> getPagedDto(String name, Integer page) {
        return getPaged(name, page).map(CityDto::from);
    }

    @Override
    public List<City> getAllFilter(String name) {
        if(name.isEmpty()) { name = ""; }
        return cityRepository.findByFilter(name);
    }
    @Override
    public List<CityDto> getAllFilterDto(String name) {
        return getAllFilter(name).stream().map(CityDto::from).collect(Collectors.toList());
    }

    public Optional<City> getAllById(Integer id) {
        return cityRepository.findById(id);
    }
    public List<CityDto> getAllByIdDto(Integer id) {
        return getAllById(id).stream().map(CityDto::from).collect(Collectors.toList());
    }
}
