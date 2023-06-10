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
public class Skieur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_skieur")
    private Long idSkieur;

    @Column(name = "nom_s")
    private String nomS;

    @Column(name = "prenom_s")
    private String prenomS;

    @Temporal(TemporalType.DATE)
    @Column(name = "date_naissance")
    private Date dateNaissance;

    @Column(name = "ville")
    private String ville;

    // Constructors, additional methods, etc.

    @ManyToMany(mappedBy = "skieurs")
    private List<Piste> pistes;

    @OneToMany(mappedBy = "skieur")
    private List<Inscription> inscriptions;

    @OneToOne
    private Abonnement abonnement;
}
