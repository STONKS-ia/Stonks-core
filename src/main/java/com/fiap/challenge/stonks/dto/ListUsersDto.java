package com.fiap.challenge.stonks.dto;

import com.fiap.challenge.stonks.model.User;

public class ListUsersDto {

    private int userId;
    private String fullName;
    private String email;
    private String login;
    private String phone;
    private String cityName;
    private String role;


    public static ListUsersDto from (User user){
        ListUsersDto dto = new ListUsersDto();
        dto.setUserId(user.getUserId());
        dto.setFullName(user.getFullName());
        dto.setEmail(user.getEmail());
        dto.setLogin(user.getLogin());
        dto.setPhone(user.getPhone());

        if (user.getCity() != null){
            dto.setCity(user.getCity().getName());
        } else {
            dto.setCity("NA");
        }

        if (user.getRoles().stream().findFirst().get().getName().equals("ROLE_ADMIN")) {
            dto.setRoles("Administrador");
        } else {
            dto.setRoles("Usuário");
        }

        return dto;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCity() {
        return cityName;
    }

    public void setCity(String city) {
        this.cityName = city;
    }

    public String getRoles() {
        return role;
    }

    public void setRoles(String role) {
        this.role = role;
    }
}

