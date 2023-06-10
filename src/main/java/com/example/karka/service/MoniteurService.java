package com.example.karka.service;

import com.example.karka.entity.Moniteur;

import java.util.List;

public interface MoniteurService {
    Moniteur saveMoniteur(Moniteur moniteur);

    Moniteur getMoniteurById(Long id);

    List<Moniteur> getAllMoniteurs();

    void deleteMoniteur(Long id);
}
