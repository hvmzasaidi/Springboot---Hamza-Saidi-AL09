package com.example.karka.repository;


import com.example.karka.entity.Skieur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkieurRepo extends JpaRepository<Skieur,Long> {
}
