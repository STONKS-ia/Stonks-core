package com.fiap.challenge.stonks;

import com.fiap.challenge.stonks.model.City;
import com.fiap.challenge.stonks.model.User;
import com.fiap.challenge.stonks.repository.CityRepository;
import com.fiap.challenge.stonks.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class DatabaseTest {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private CityRepository cityRepository;

    @Test
    public void successTest_createUser() {
        userRepository.save(new User("fullname", "teste@email.com", "40028322", "login", "senha", null, new ArrayList<>()));
        assertEquals(1, userRepository.findAll().size());
    }

    @Test
    public void successTest_createCity() {
        cityRepository.save(new City("Itapevi", "portalURL", "imagemURL"));
        assertEquals(1, cityRepository.findAll().size());
    }

    @Test
    public void successTest_findCityById() {
        cityRepository.save(new City("Campinas", "portalURL", "imagemURL"));
        assertEquals("Campinas", cityRepository.findById(5).get().getName());
    }

    @Test
    public void successTest_findCityByName() {
        cityRepository.save(new City("Guarulhos", "portalURL", "imagemURL"));
        assertEquals("portalURL", cityRepository.findByFilter("Guarulhos").get(0).getOriginalPortalUrl());
    }

    @Test
    public void successTest_findAllCities() {
        cityRepository.save(new City("Guarulhos", "portalURL", "imagemURL"));
        cityRepository.save(new City("Osasco", "portalURL", "imagemURL"));
        assertTrue(cityRepository.findAll().size() >= 2);
    }



}