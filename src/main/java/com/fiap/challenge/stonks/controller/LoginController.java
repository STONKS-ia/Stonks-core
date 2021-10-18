package com.fiap.challenge.stonks.controller;

import com.fiap.challenge.stonks.model.ApiResponse;
import com.fiap.challenge.stonks.repository.UserRepository;
import com.fiap.challenge.stonks.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

//@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
@CrossOrigin(origins = "https://stonks-59b6f.web.app/", maxAge = 3600)
@RestController
public class LoginController {

    @Autowired
    private UserService userService;

    @GetMapping(path = "/login", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.ALL_VALUE)
    public ApiResponse<Boolean> validatePassword(@RequestParam String login, @RequestParam String password) {
        return new ApiResponse<>(HttpStatus.OK.value(), "Access authorized", userService.validatePassword(login, password));
    }

}