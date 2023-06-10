package com.example.karka.controller;

import com.example.karka.entity.Moniteur;
import com.example.karka.service.MoniteurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/moniteurs")
public class MoniteurController {
    @Autowired
    private  MoniteurService moniteurService;

    @Autowired
    public MoniteurController(MoniteurService moniteurService) {
        this.moniteurService = moniteurService;
    }

    @PostMapping
    public ResponseEntity<Moniteur> createMoniteur(@RequestBody Moniteur moniteur) {
        Moniteur createdMoniteur = moniteurService.saveMoniteur(moniteur);
        return new ResponseEntity<>(createdMoniteur, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Moniteur> getMoniteurById(@PathVariable Long id) {
        Moniteur moniteur = moniteurService.getMoniteurById(id);
        if (moniteur != null) {
            return ResponseEntity.ok(moniteur);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping
    public ResponseEntity<List<Moniteur>> getAllMoniteurs() {
        List<Moniteur> moniteurs = moniteurService.getAllMoniteurs();
        return ResponseEntity.ok(moniteurs);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMoniteur(@PathVariable Long id) {
        moniteurService.deleteMoniteur(id);
        return ResponseEntity.noContent().build();
    }
}
