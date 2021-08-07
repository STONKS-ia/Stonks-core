package com.fiap.challenge.stonks.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.fiap.challenge.stonks.storage.Disk;

@RestController
@RequestMapping("/files")
public class FileController {

    @Autowired
    private Disk disk;

    @PostMapping
    public void upload(@RequestParam MultipartFile file){
        disk.saveFile(file);
        System.out.println("Size:" + file.getSize());
        System.out.println("toString:" + file.toString());
        System.out.println("Name:" + file.getName());
        System.out.println("Filename:" + file.getOriginalFilename());
        System.out.println("ContenType:" + file.getContentType());
    }
}
