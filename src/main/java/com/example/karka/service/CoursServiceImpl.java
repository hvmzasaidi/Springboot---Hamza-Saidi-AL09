package com.example.karka.service;

import com.example.karka.entity.Cours;
import com.example.karka.repository.ICoursRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoursServiceImpl implements CoursService {
    private final ICoursRepo coursRepository;

    @Autowired
    public CoursServiceImpl(ICoursRepo coursRepository) {
        this.coursRepository = coursRepository;
    }

    @Override
    public Cours saveCours(Cours cours) {
        return coursRepository.save(cours);
    }

    @Override
    public Cours getCoursById(Long id) {
        return coursRepository.findById(id).orElse(null);
    }

    @Override
    public List<Cours> getAllCours() {
        return coursRepository.findAll();
    }

    @Override
    public void deleteCours(Long id) {
        coursRepository.deleteById(id);
    }
}
