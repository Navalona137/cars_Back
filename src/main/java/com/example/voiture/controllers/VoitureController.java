package com.example.voiture.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.voiture.model.Voiture;
import com.example.voiture.repository.VoitureRepository;

@RestController
public class VoitureController {

    @Autowired
    private VoitureRepository mp;

    @GetMapping("/listVoiture")
    @CrossOrigin(origins = "http://localhost:3000")
    public List<Voiture> listVoiture() {
        return mp.findAll();
    }
}
