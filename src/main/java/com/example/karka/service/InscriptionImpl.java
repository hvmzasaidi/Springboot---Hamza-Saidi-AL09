package com.example.karka.service;
import com.example.karka.entity.Inscription;
import com.example.karka.repository.IInscriptionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class InscriptionImpl implements IInscriptionService {



        @Autowired
        private IInscriptionRepo inscriptionRepository;

        @Autowired
        public InscriptionImpl(IInscriptionRepo inscriptionRepository) {
            this.inscriptionRepository = inscriptionRepository;
        }

        @Override
        public Inscription saveInscription(Inscription inscription) {
            return inscriptionRepository.save(inscription);
        }

        @Override
        public Inscription getInscriptionById(Long id) {
            return inscriptionRepository.findById(id).orElse(null);
        }

        @Override
        public List<Inscription> getAllInscriptions() {
            return inscriptionRepository.findAll();
        }

        @Override
        public void deleteInscription(Long id) {
            inscriptionRepository.deleteById(id);
        }
}


