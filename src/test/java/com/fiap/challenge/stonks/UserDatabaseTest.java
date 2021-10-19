package com.fiap.challenge.stonks;

import com.fiap.challenge.stonks.model.User;
import com.fiap.challenge.stonks.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@DataJpaTest
public class UserDatabaseTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void successTest_createUser() {
        userRepository.save(new User("fullname", "teste@email.com", "login", "senha", "40028322", null, new ArrayList<>()));
        assertEquals(1, userRepository.findAll().size());
    }

    @Test
    public void successTest_findUserById() {
        userRepository.save(new User("Jose", "ze@email.com", "joseph", "senha", "phone", null, new ArrayList<>()));
        System.out.println(userRepository.findAll().stream().findFirst().get().getUserId());
        assertEquals("joseph", userRepository.findById(4).get().getLogin());
    }

    @Test
    public void successTest_findUserByLogin() {
        userRepository.save(new User("Aline", "alinesk@email.com", "alinesk", "senha", "phone", null, new ArrayList<>()));
        assertEquals("alinesk@email.com", userRepository.findUserByLogin("alinesk").get().getEmail());
    }

    @Test
    public void successTest_findAllCities() {
        userRepository.save(new User("Matheus", "theus@email.com", "matheusss", "senha", "senha", null, new ArrayList<>()));
        userRepository.save(new User("Pedro", "chav@email.com", "chaves", "senha", "senha", null, new ArrayList<>()));
        assertTrue(userRepository.findAll().size() >= 2);
    }

}
