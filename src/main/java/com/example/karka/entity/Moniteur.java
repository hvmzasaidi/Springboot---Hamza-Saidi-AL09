package com.example.karka.entity;

import java.io.Serializable;
import javax.persistence.*;
import lombok.*;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Moniteur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_moniteur")
    private Long idMoniteur;

    @Column(name = "nom_m")
    private String nomM;

    @Column(name = "prenom_m")
    private String prenomM;

    @Column(name = "date_recu")
    private Date dateRecu;

    @OneToMany
    private List<Cours> cours;

    // Constructors, additional methods, etc.
}
