package com.fiap.challenge.stonks.dto;

import com.fiap.challenge.stonks.model.Files;

import java.util.UUID;

public class FilesDto {
    private UUID id;
    private String name;
    private String size;
    private String contentType;

    public static FilesDto from (Files file){
        FilesDto dto = new FilesDto();
        dto.setId(file.getId());
        dto.setName(file.getName());
        dto.setSize(file.getSize());
        dto.setContentType(file.getContentType());
        return dto;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }
}
