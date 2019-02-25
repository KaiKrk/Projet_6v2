package com.projet6.Impl;

import com.projet6.contrat.SecteurDao;
import com.sun.javafx.beans.IDProperty;


import javax.persistence.*;
import java.sql.Blob;
import java.util.List;

@Table (name = "secteur")
public class Secteur implements SecteurDao {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "idSecteur")
    private Long id;
    private String nom;
    private Blob secteurImage;

    @ManyToOne
    @JoinColumn(name = "idTopo")
    private Topo topo;

    @Override
    public void isAvailable(Secteur secteur) {

    }

    @Override
    public List<Secteur> accessibleSecteur(Topo topo) {
        return null;
    }

    @Override
    public void updateSecteur(Secteur secteur) {

    }
}
