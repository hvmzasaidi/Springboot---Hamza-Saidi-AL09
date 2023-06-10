package com.example.karka.controller;
import com.example.karka.entity.Piste;
import com.example.karka.service.PisteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pistes")
public class PisteController {
    @Autowired
    private  PisteService pisteService;

    @Autowired
    public PisteController(PisteService pisteService) {
        this.pisteService = pisteService;
    }

    @PostMapping
    public ResponseEntity<Piste> createPiste(@RequestBody Piste piste) {
        Piste createdPiste = pisteService.savePiste(piste);
        return new ResponseEntity<>(createdPiste, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Piste> getPisteById(@PathVariable Long id) {
        Piste piste = pisteService.getPisteById(id);
        if (piste != null) {
            return ResponseEntity.ok(piste);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping
    public ResponseEntity<List<Piste>> getAllPistes() {
        List<Piste> pistes = pisteService.getAllPistes();
        return ResponseEntity.ok(pistes);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePiste(@PathVariable Long id) {
        pisteService.deletePiste(id);
        return ResponseEntity.noContent().build();
    }
}
