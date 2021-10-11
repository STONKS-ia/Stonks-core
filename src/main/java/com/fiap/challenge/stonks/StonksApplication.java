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
// 			userService.createUser(new User("admin", "teste@email.com", "admin", "admin123", "91234-1234",null, new ArrayList<>()));
//			userService.createUser(new User("linesk", "linesk@ig", "esposa", "gatinha123", "91234-1234",null, new ArrayList<>()));
//			userService.createUser(new User("theus", "mefio@yahoo", "rico", "chefia123", "91234-1234",null, new ArrayList<>()));
//			userService.createUser(new User("soneska", "soneca@outlook", "soneka", "soneka123", "91234-1234",null, new ArrayList<>()));
//			userService.createUser(new User("chaves", "pedro@gmail", "chav", "chav123", "91234-1234",null, new ArrayList<>()));
//			userService.createUser(new User("josao", "zao@terra", "zao", "zevolution", "91234-1234",null, new ArrayList<>()));
//			userService.addRoleToUser("admin", "ROLE_ADMIN");
//			userService.addRoleToUser("esposa", "ROLE_ADMIN");
//			userService.addRoleToUser("rico", "ROLE_ADMIN");
//			userService.addRoleToUser("soneka", "ROLE_USER");
//			userService.addRoleToUser("chav", "ROLE_USER");
//			userService.addRoleToUser("zao", "ROLE_USER");

		};
	}


}
