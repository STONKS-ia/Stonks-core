package com.fiap.challenge.stonks.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class AuthenticationReponseDto {
    @JsonProperty("token")
    private String accessToken;
    @JsonProperty("name")
    private String name;
    @JsonProperty("roles")
    private List<String> roles;

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }
}
