package com.fiap.challenge.stonks.storage;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Component
public class Disk {
    @Value("${path.raiz}")
    private String raiz;

    @Value("files")
    private String directoryFile;

    public void saveFile(MultipartFile file) {
        this.save(this.directoryFile, file);
    }
    public void save(String directory, MultipartFile file) {
        Path directoryPath = Paths.get(this.raiz, directory);
        Path filePath = directoryPath.resolve(file.getOriginalFilename());
        System.out.println(filePath);
        System.out.println(directoryPath);
        try {
            Files.createDirectories(directoryPath);
            file.transferTo(filePath.toFile());
        } catch (IOException e) {
            throw new RuntimeException("Problemas na tentativa de salvar arquivo.", e);
        }
    }
}
