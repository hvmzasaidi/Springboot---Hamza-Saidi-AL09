package com.example.karka.entity;

import java.io.Serializable;
import javax.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Inscription implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_inscription")
    private Long idInscription;

    @Column(name = "num_inscription")
    private Long numInscription;

    @Column(name = "num_semaine")
    private int numSemaine;


    @ManyToOne
    @JoinColumn(name = "id_skieur")
    private Skieur skieur;
    // Constructors, additional methods, etc.

    @ManyToOne
    @JoinColumn(name = "id_cours")
    private Cours cours;
}
