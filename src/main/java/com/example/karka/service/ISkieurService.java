package com.example.karka.service;
import com.example.karka.entity.Skieur;

import java.util.List;


public interface ISkieurService {
        Skieur saveSkieur(Skieur skieur);

        Skieur getSkieurById(Long id);

        List<Skieur> getAllSkieurs();

        void deleteSkieur(Long id);


}
