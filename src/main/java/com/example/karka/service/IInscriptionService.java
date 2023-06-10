package com.example.karka.service;
import com.example.karka.entity.Inscription;
import java.util.List;


public interface IInscriptionService {
        Inscription saveInscription(Inscription inscription);

        Inscription getInscriptionById(Long id);

        List<Inscription> getAllInscriptions();

        void deleteInscription(Long id);


}
