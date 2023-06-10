package com.example.karka.service;


import com.example.karka.entity.Abonnement;

import java.util.List;

public interface IAbonnementService {
    Abonnement saveAbonnement(Abonnement abonnement);

    Abonnement getAbonnementById(Long id);

    List<Abonnement> getAllAbonnements();

    void deleteAbonnement(Long id);
}
