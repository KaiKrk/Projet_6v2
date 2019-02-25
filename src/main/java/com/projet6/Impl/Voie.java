package com.projet6.Impl;

import com.projet6.contrat.VoieDao;

import javax.persistence.*;
import java.util.List;

@Table(name = "voie")
public class Voie implements VoieDao {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "idVoie")
    private Long id;
    private String nomVoie;
    private enum cotation{}
    private String origineNom;
    private Integer nombrePoint;

    @ManyToOne
    @JoinColumn(name = "idSecteur")
    private Secteur secteur;

    @Override
    public void addVoie() {

    }

    @Override
    public void updateVoie() {

    }

    @Override
    public void deleteVoie() {

    }

    @Override
    public List<Voie> getAllVoie() {
        return null;
    }

    @Override
    public List<Voie> filterVoieByDifficulty(int minDifficulty, int maxDifficulty) {
        return null;
    }
}
