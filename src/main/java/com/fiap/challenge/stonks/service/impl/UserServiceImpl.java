package com.fiap.challenge.stonks.service.impl;

import com.fiap.challenge.stonks.dto.UserDto;
import com.fiap.challenge.stonks.model.User;
import com.fiap.challenge.stonks.repository.UserRepository;
import com.fiap.challenge.stonks.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service("UserService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }
    @Override
    public List<UserDto> getAllDto() {
        return getAll().stream().map(UserDto::from).collect(Collectors.toList());
    }

    @Override
    public List<User> getAllFilter(String fullName, String email) {
        if(fullName.isEmpty())
            fullName = "";
        if(email.isEmpty())
            email = "";
        return userRepository.findByFilter(fullName, email);
    }
    @Override
    public List<UserDto> getAllFilterDto(String fullName, String email) {
        return getAllFilter(fullName, email).stream().map(UserDto::from).collect(Collectors.toList());
    }

    public Optional<User> getAllById(Integer id) {
        return userRepository.findById(id);
    }
    public List<UserDto> getAllByIdDto(Integer id) {
        return getAllById(id).stream().map(UserDto::from).collect(Collectors.toList());
    }
}
