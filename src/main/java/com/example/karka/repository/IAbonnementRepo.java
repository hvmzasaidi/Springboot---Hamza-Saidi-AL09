package com.example.karka.repository;

import com.example.karka.entity.Abonnement;
import com.example.karka.entity.Inscription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface IAbonnementRepo extends JpaRepository<Abonnement ,Long > {
    @Query("SELECT s FROM Abonnement s WHERE s.typeAbon = ?1 ORDER BY s.dateDebut")
    List<Inscription> findByTypeOrderByStartDate(String subscriptionType);
    @Query("SELECT s FROM Abonnement s WHERE s.dateDebut BETWEEN ?1 AND ?2")
    List<Inscription> findByCreationDateBetween(LocalDate startDate, LocalDate endDate);
}
