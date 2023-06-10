package com.example.karka.service;

import com.example.karka.entity.Piste;
import com.example.karka.repository.PisteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PisteServiceImpl implements PisteService {
    @Autowired
    private PisteRepo pisteRepository;

    @Autowired
    public PisteServiceImpl(PisteRepo pisteRepository) {
        this.pisteRepository = pisteRepository;
    }

    @Override
    public Piste savePiste(Piste piste) {
        return pisteRepository.save(piste);
    }

    @Override
    public Piste getPisteById(Long id) {
        return pisteRepository.findById(id).orElse(null);
    }

    @Override
    public List<Piste> getAllPistes() {
        return pisteRepository.findAll();
    }

    @Override
    public void deletePiste(Long id) {
        pisteRepository.deleteById(id);
    }
}
