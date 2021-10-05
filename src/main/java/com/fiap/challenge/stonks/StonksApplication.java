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
	 CommandLineRunner run(UserService userService, CityService cityService) {
		return args -> {



 			//userService.createUser(new User("joe due", "teste@email.com", "login", "senha123", "1234-4321",null, new ArrayList<>()));

			userService.addRoleToUser("login", "ROLE_USER");
			userService.addRoleToUser("login", "ROLE_ADMIN");

		};
	}


}
