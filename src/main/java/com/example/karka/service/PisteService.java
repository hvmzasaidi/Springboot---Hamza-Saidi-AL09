package com.example.karka.service;

import com.example.karka.entity.Piste;

import java.util.List;

public interface PisteService {
    Piste savePiste(Piste piste);

    Piste getPisteById(Long id);

    List<Piste> getAllPistes();

    void deletePiste(Long id);
}
