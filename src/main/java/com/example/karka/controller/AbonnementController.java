package com.example.karka.controller;

import com.example.karka.entity.Abonnement;
import com.example.karka.service.IAbonnementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/abonnements")
public class AbonnementController {
    @Autowired
    private  IAbonnementService abonnementService;

    @Autowired
    public AbonnementController(IAbonnementService abonnementService) {
        this.abonnementService = abonnementService;
    }

    @PostMapping
    public ResponseEntity<Abonnement> createAbonnement(@RequestBody Abonnement abonnement) {
        Abonnement createdAbonnement = abonnementService.saveAbonnement(abonnement);
        return new ResponseEntity<>(createdAbonnement, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Abonnement> getAbonnementById(@PathVariable Long id) {
        Abonnement abonnement = abonnementService.getAbonnementById(id);
        if (abonnement != null) {
            return ResponseEntity.ok(abonnement);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping
    public ResponseEntity<List<Abonnement>> getAllAbonnements() {
        List<Abonnement> abonnements = abonnementService.getAllAbonnements();
        return ResponseEntity.ok(abonnements);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAbonnement(@PathVariable Long id) {
        abonnementService.deleteAbonnement(id);
        return ResponseEntity.noContent().build();
    }
}
