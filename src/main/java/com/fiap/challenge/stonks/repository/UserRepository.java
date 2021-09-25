package com.fiap.challenge.stonks.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.fiap.challenge.stonks.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	public Optional<User> findUserByLogin(String login);
	
	@Query("SELECT user FROM User user " +
			"WHERE (user.fullName like concat ('%', ?1, '%') OR ?1 IS NULL) " +
			"AND (user.email like concat ('%', ?2, '%') OR ?2 IS NULL)")
	List<User> findByFilter(String fullName, String email);
}
