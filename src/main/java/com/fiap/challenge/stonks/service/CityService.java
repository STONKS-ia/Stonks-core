package com.fiap.challenge.stonks.service;

import com.fiap.challenge.stonks.dto.CityDto;
import com.fiap.challenge.stonks.model.City;
import com.fiap.challenge.stonks.model.User;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface CityService {

    ResponseEntity<City> createCity(City city);

    List<City> getAll();
    List<CityDto> getAllDto();

    Page<City> getPaged(String name, Integer page);
    Page<CityDto> getPagedDto(String name, Integer page);

    List<City> getAllFilter(String name);
    List<CityDto> getAllFilterDto(String name);

    Optional<City> getAllById(Integer id);
    List<CityDto> getAllByIdDto(Integer id);
}


