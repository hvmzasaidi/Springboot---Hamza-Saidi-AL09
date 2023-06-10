package com.example.karka.controller;

import com.example.karka.entity.Skieur;
import com.example.karka.service.ISkieurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/skieurs")
public class SkieurController {
    @Autowired
    private  ISkieurService skieurService;

    @Autowired
    public SkieurController(ISkieurService skieurService) {
        this.skieurService = skieurService;
    }

    @PostMapping
    public ResponseEntity<Skieur> createSkieur(@RequestBody Skieur skieur) {
        Skieur createdSkieur = skieurService.saveSkieur(skieur);
        return new ResponseEntity<>(createdSkieur, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Skieur> getSkieurById(@PathVariable Long id) {
        Skieur skieur = skieurService.getSkieurById(id);
        if (skieur != null) {
            return ResponseEntity.ok(skieur);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping
    public ResponseEntity<List<Skieur>> getAllSkieurs() {
        List<Skieur> skieurs = skieurService.getAllSkieurs();
        return ResponseEntity.ok(skieurs);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSkieur(@PathVariable Long id) {
        skieurService.deleteSkieur(id);
        return ResponseEntity.noContent().build();
    }
}
