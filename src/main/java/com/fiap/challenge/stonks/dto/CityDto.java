package com.fiap.challenge.stonks.dto;

import com.fiap.challenge.stonks.model.City;

import javax.persistence.Column;

public class CityDto {
    private Long cityId;
    private String name;
    private String originalPortalUrl;
    private String imgUrl;

    public static CityDto from (City city){
        CityDto dto = new CityDto();
        dto.setCityId(city.getCityId());
        dto.setName(city.getName());
        dto.setOriginalPortalUrl(city.getOriginalPortalUrl());
        dto.setImgUrl(city.getImgUrl());
        return dto;
    }

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOriginalPortalUrl() {
        return originalPortalUrl;
    }

    public void setOriginalPortalUrl(String originalPortalUrl) {
        this.originalPortalUrl = originalPortalUrl;
    }

    public String getImgUrl() { return imgUrl; }

    public void setImgUrl(String imgUrl) { this.imgUrl = imgUrl; }

}
