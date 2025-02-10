package com.kapu.cinescat.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kapu.cinescat.models.Cinema;
import com.kapu.cinescat.repo.ICinemaRepo;

import jakarta.validation.Valid;

@CrossOrigin(origins = { "http://localhost:5173", "https://1ktzpbmr-5173.brs.devtunnels.ms" })
@RestController
public class CinemaController {
    @Autowired
    private ICinemaRepo ICinemaRepo;

    @GetMapping("/cinemas")
    public List<Cinema> getCinemas() {
        return ICinemaRepo.findAll();
    }

    @PostMapping("/cinemas/create")
    public ResponseEntity<String> addCinema(@Valid @RequestBody Cinema cinema) {
        ICinemaRepo.save(cinema);
        return ResponseEntity.status(201).body("¡Cine creado exitosamente!");
    }

}
