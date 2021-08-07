package com.fiap.challenge.stonks.model;

import org.springframework.context.annotation.Primary;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "file")
public class filesDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;
    private String name;
    private String size;
    private String contentType;

    public filesDTO(UUID id, String name, String size, String contentType){
        this.id = id;
        this.name = name;
        this.size = size;
        this.contentType = contentType;
    }
    public filesDTO(){
    }

    public UUID getId() {
        return id;
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
