package com.example.karka.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.*;

import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Cours implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cours")
    private Long idCours;

    @Column(name = "num_cours")
    private Long numCours;

    @Column(name = "niveau")
    private int niveau;

    @Enumerated(EnumType.STRING)
    @Column(name = "type_cours")
    private TypeCours typeCours;

    @Enumerated(EnumType.STRING)
    @Column(name = "support")
    private Support support;

    @Column(name = "prix")
    private Float prix;

    @Column(name = "creneau")
    private int creneau;


    @OneToMany(mappedBy = "cours")
    private List<Inscription> inscriptions;


}
