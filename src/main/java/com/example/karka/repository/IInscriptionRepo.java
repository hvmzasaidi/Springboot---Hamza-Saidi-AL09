package com.example.karka.repository;

import com.example.karka.entity.Inscription;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface IInscriptionRepo extends JpaRepository<Inscription,Long> {

}
