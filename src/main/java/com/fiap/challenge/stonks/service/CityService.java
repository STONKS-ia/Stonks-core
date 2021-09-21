package com.fiap.challenge.stonks.service;

import com.fiap.challenge.stonks.dto.CityDto;
import com.fiap.challenge.stonks.model.City;

import java.util.List;
import java.util.Optional;

public interface CityService {

    List<City> getAll();
    List<CityDto> getAllDto();

    List<City> getAllFilter(String name);
    List<CityDto> getAllFilterDto(String name);

    Optional<City> getAllById(Integer id);
    List<CityDto> getAllByIdDto(Integer id);
}


