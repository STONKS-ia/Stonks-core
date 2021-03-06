package com.fiap.challenge.stonks.service;


import com.fiap.challenge.stonks.dto.ListUsersDto;
import com.fiap.challenge.stonks.dto.UserDto;
import com.fiap.challenge.stonks.model.User;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface UserService {

    ResponseEntity<User> createUser(User user);

    List<User> getAll();
    List<ListUsersDto> getAllDto();

    List<User> getAllFilter(String fullName, String email);
    List<UserDto> getAllFilterDto(String fullName, String email);

    Optional<User> getAllById(int id);
    List<UserDto> getAllByIdDto(int id);

    ResponseEntity<Boolean> validatePassword(String login, String password);
    ResponseEntity<Void> addRoleToUser(String username, String roleName);
}
