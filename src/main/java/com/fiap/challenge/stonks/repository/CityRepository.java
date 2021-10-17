package com.fiap.challenge.stonks.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.fiap.challenge.stonks.model.City;

public interface CityRepository extends JpaRepository<City, Integer> {
	
	@Query(value = "SELECT city FROM City city WHERE (city.name like concat ('%', ?1, '%')) OR ?1 IS NULL ")
    List<City> findByFilter(String name);


    @Query(nativeQuery = true, value = "SELECT * FROM cities AS c " +
            "WHERE (c.name LIKE CONCAT('%', ?1, '%') OR ?1 IS NULL )")
    Page<City> findPaged(String name, Pageable page);

}