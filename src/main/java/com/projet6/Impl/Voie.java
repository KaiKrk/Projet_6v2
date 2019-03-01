package com.projet6.Impl;

import com.projet6.contrat.VoieDao;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "voie")
public class Voie implements VoieDao {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "idvoie")
    private Long id;

    @Column(name = "nomvoie")
    private String nomVoie;
    private String cotation;

    @Column(name = "originenom")
    private String origineNom;
    @Column(name = "nombrepoint")
    private Integer nombrePoint;

    @ManyToOne
    @JoinColumn(name = "idsecteur")
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
