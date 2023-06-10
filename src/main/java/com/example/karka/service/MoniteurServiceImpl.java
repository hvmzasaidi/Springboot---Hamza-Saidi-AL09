package com.example.karka.service;

import com.example.karka.entity.Moniteur;
import com.example.karka.repository.IMoniteurRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MoniteurServiceImpl implements MoniteurService {
    @Autowired
    private IMoniteurRepo moniteurRepository;

    @Autowired
    public MoniteurServiceImpl(IMoniteurRepo moniteurRepository) {
        this.moniteurRepository = moniteurRepository;
    }

    @Override
    public Moniteur saveMoniteur(Moniteur moniteur) {
        return moniteurRepository.save(moniteur);
    }

    @Override
    public Moniteur getMoniteurById(Long id) {
        return moniteurRepository.findById(id).orElse(null);
    }

    @Override
    public List<Moniteur> getAllMoniteurs() {
        return moniteurRepository.findAll();
    }

    @Override
    public void deleteMoniteur(Long id) {
        moniteurRepository.deleteById(id);
    }
}
