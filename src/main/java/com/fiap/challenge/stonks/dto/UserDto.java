package com.fiap.challenge.stonks.dto;

import com.fiap.challenge.stonks.model.User;
import com.sun.istack.Nullable;

public class UserDto {
    private int userId;
    private String fullName;
    private String email;
    private String password;
    private String phone;
    @Nullable
    private CityDto city;

    public static UserDto from (User user){
        UserDto dto = new UserDto();
        dto.setUserId(user.getUserId());
        dto.setFullName(user.getFullName());
        dto.setEmail(user.getEmail());
        dto.setPassword(user.getPassword());
        dto.setPhone(user.getPhone());
        if (user.getCity() != null){
            dto.setCity(CityDto.from(user.getCity()));
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public CityDto getCity() {
        return city;
    }

    public void setCity(CityDto city) {
        this.city = city;
    }
}
