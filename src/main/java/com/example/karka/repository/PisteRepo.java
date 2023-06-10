package com.example.karka.repository;

import com.example.karka.entity.Piste;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PisteRepo extends JpaRepository<Piste,Long> {
}
