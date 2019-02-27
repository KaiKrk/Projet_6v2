package com.projet6.Impl;

import com.projet6.contrat.TopoDao;

import javax.persistence.*;
import java.sql.Blob;
import java.util.List;

@Table (name = "topo")
public class Topo implements TopoDao {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "idTopo")
    private Long id;
    private enum region{}
    private enum pays{}
    private enum statutTopo{}
    private Blob topoFile;

    @ManyToOne
    @JoinColumn(name = "idCompte")
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
