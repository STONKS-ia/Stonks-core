package com.fiap.challenge.stonks;

import com.fiap.challenge.stonks.model.City;
import com.fiap.challenge.stonks.model.User;
import com.fiap.challenge.stonks.repository.UserRepository;
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

//	 @Bean
//	 CommandLineRunner run(UserService userService, CityService cityService) {
//		return args -> {
// 			userService.createUser(new User("admin", "teste@email.com", "admin", "admin123", "91234-1234",null, new ArrayList<>()));
//			userService.createUser(new User("Aline", "aline_satio@ig", "aline", "aline123", "91234-1234",null, new ArrayList<>()));
//			userService.createUser(new User("Matheus", "matheus_sena@yahoo", "mateus", "mateus123", "91234-1234",null, new ArrayList<>()));
//			userService.createUser(new User("Vinicius", "vinicius_scarabelli@outlook", "vinicius", "vini123", "91234-1234",null, new ArrayList<>()));
//			userService.createUser(new User("Pedro", "pedro_chaves@gmail", "pedro", "chaves123", "91234-1234",null, new ArrayList<>()));
//			userService.createUser(new User("José", "jose_ventura@terra", "jose", "jose123", "91234-1234",null, new ArrayList<>()));
//			userService.addRoleToUser("admin", "ROLE_ADMIN");
//			userService.addRoleToUser("aline", "ROLE_ADMIN");
//			userService.addRoleToUser("mateus", "ROLE_ADMIN");
//			userService.addRoleToUser("vinicius", "ROLE_USER");
//			userService.addRoleToUser("pedro", "ROLE_USER");
//			userService.addRoleToUser("jose", "ROLE_USER");
//		};
//	}

}
