package com.projet6.Impl;

import com.projet6.contrat.TopoDao;
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
@Table (name = "topo")
public class Topo implements TopoDao {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "idtopo")
    private Long id;

    @Column ( name = "nomtopo")
    private String nom;
    private String region;
    private String pays;

    @Column(name = "statuttopo")
    private String statutTopo;
    @Column(name = "topofile")
    private byte[] topoFile;

    @ManyToOne
    @JoinColumn(name = "idcompte")
    private Compte compte;

    @Override
    public void addTopo() {

    }

    @Override
    public void updateTopo() {

    }

    @Override
    public void deleteTopo() {

    }

    @Override
    public List<Topo> getlistAvailableTopo() {
        return null;
    }

    @Override
    public List<Topo> getlistAllTopo() {
        return null;
    }
}
