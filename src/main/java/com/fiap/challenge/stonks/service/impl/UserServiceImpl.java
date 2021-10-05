package com.fiap.challenge.stonks.service.impl;

import com.fiap.challenge.stonks.dto.UserDto;
import com.fiap.challenge.stonks.model.Role;
import com.fiap.challenge.stonks.model.User;
import com.fiap.challenge.stonks.repository.RoleRepository;
import com.fiap.challenge.stonks.repository.UserRepository;
import com.fiap.challenge.stonks.service.UserService;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service("UserService")
@Transactional
public class UserServiceImpl implements UserService {

    Logger logger = Logger.getLogger(this.getClass());

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    PasswordEncoder encoder;

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

    public Optional<User> getAllById(int id) {
        return userRepository.findById(id);
    }

    public List<UserDto> getAllByIdDto(int id) {
        return getAllById(id).stream().map(UserDto::from).collect(Collectors.toList());
    }


    public ResponseEntity<User> createUser(User user) {

        logger.info(String.format("Saving new user: %s on database", user.getLogin()));

        user.setPassword(encoder.encode(user.getPassword()));

        userRepository.save(user);
        return ResponseEntity.created(null).body(userRepository.save(user));
    }

    public ResponseEntity<Boolean> validatePassword(String login, String password) {

        logger.info(String.format("Validating user: %s", login));

        Optional<User> optUser = userRepository.findUserByLogin(login);

        if (optUser.isEmpty()) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(false);
        }

        Boolean valid = encoder.matches(password, optUser.get().getPassword());
        HttpStatus status = (valid) ? HttpStatus.OK : HttpStatus.UNAUTHORIZED;

        return ResponseEntity.status(status).body(valid);
    }

    public ResponseEntity<Void> addRoleToUser(String username, String roleName) {

        logger.info(String.format("Adding role %s to user %s", roleName, username));

        Optional<User> optUser = userRepository.findUserByLogin(username);
        Optional<Role> optRole = roleRepository.findByName(roleName);

        if (optUser.isEmpty() || optRole.isEmpty()) {
            throw new UsernameNotFoundException("usuário ou permissão não encontrado!");
        }

        User user = optUser.get();
        Role role = optRole.get();

        user.getRoles().add(role);

        return ResponseEntity.created(null).build();
    }
}
