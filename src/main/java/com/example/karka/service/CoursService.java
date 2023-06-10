package com.example.karka.service;

import com.example.karka.entity.Cours;

import java.util.List;

public interface CoursService {
    Cours saveCours(Cours cours);

    Cours getCoursById(Long id);

    List<Cours> getAllCours();

    void deleteCours(Long id);
}
