package com.fiap.challenge.stonks.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.fiap.challenge.stonks.model.UserModel;

public interface UserRepository extends JpaRepository<UserModel, Integer> {
	
	@Query("SELECT user FROM UserModel user " +
			"WHERE (user.fullName like concat ('%', ?1, '%') OR ?1 IS NULL) " +
			"AND (user.email like concat ('%', ?2, '%') OR ?2 IS NULL)")
	List<UserModel> getAllFilter(String fullName, String email);

}
