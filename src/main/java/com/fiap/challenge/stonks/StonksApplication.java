package com.fiap.challenge.stonks;

import com.fiap.challenge.stonks.model.City;
import com.fiap.challenge.stonks.model.User;
import com.fiap.challenge.stonks.service.CityService;
import com.fiap.challenge.stonks.service.RoleService;
import com.fiap.challenge.stonks.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import java.util.ArrayList;
@SpringBootApplication
public class StonksApplication {

	public static void main(String[] args) {
		SpringApplication.run(StonksApplication.class, args);
	}

	@Bean
	public PasswordEncoder getPasswordEncoder() {

		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

		return encoder;
	}

	 @Bean
	 CommandLineRunner run(UserService userService, RoleService roleService, CityService cityService) {
		return args -> {
			roleService.createRole("ROLE_USER");
			roleService.createRole("ROLE_MANAGER");
			roleService.createRole("ROLE_ADMIN");
			roleService.createRole("ROLE_SUPER_ADMIN");

			userService.createUser(new User("Nome completo exemplo", "teste@email.com", "login", "senha123", "1234-4321", userService.getAllById(1L), new ArrayList<>());

			userService.addRoleToUser("login", "ROLE_USER");
			userService.addRoleToUser("login", "ROLE_MANAGER");
			userService.addRoleToUser("login", "ROLE_ADMIN");
			userService.addRoleToUser("login", "ROLE_SUPER_ADMIN");
		}
	}

}
