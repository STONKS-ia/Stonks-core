package com.fiap.challenge.stonks.service;


import com.fiap.challenge.stonks.dto.UserDto;
import com.fiap.challenge.stonks.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> getAll();
    List<UserDto> getAllDto();

    List<User> getAllFilter(String fullName, String email);
    List<UserDto> getAllFilterDto(String fullName, String email);

    Optional<User> getAllById(Integer id);
    List<UserDto> getAllByIdDto(Integer id);
}
