package com.example.karka.service;

import com.example.karka.entity.Skieur;
import com.example.karka.repository.SkieurRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkieurServiceImpl implements ISkieurService {
    private final SkieurRepo skieurRepository;

    @Autowired
    public SkieurServiceImpl(SkieurRepo skieurRepository) {
        this.skieurRepository = skieurRepository;
    }

    @Override
    public Skieur saveSkieur(Skieur skieur) {
        return skieurRepository.save(skieur);
    }

    @Override
    public Skieur getSkieurById(Long id) {
        return skieurRepository.findById(id).orElse(null);
    }

    @Override
    public List<Skieur> getAllSkieurs() {
        return skieurRepository.findAll();
    }

    @Override
    public void deleteSkieur(Long id) {
        skieurRepository.deleteById(id);
    }
}
