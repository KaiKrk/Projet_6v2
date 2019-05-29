package com.projet6.classes;

import com.projet6.Impl.Compte;

import javax.persistence.Column;


public class TopoAPI {

    private Integer id;

    private String nomTopo;
    private String region;
    private String pays;

    private String statutTopo;
    @Column(name = "topofile")

    private String fichierTopo;

    public Integer getId() {
        return id;
    }

    public String getNomTopo() {
        return nomTopo;
    }

    public String getRegion() {
        return region;
    }

    public String getPays() {
        return pays;
    }

    public String getStatutTopo() {
        return statutTopo;
    }

    public Long getIdCompte() {
        return idCompte;
    }

    public String getFichierTopo() { return fichierTopo;};
    private Long idCompte;

}
