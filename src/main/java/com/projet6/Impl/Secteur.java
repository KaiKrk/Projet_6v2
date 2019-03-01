package com.projet6.Impl;

import com.projet6.contrat.SecteurDao;
import com.sun.javafx.beans.IDProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import java.sql.Blob;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table (name = "secteur")
public class Secteur implements SecteurDao {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "idsecteur")
    private Long id;
    private String nom;

    @Column(name = "secteurimage")
    private byte[] secteurImage;

    @ManyToOne
    @JoinColumn(name = "idtopo")
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
