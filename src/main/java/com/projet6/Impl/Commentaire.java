package com.projet6.Impl;

import com.projet6.Compte;
import com.projet6.contrat.CommentaireDao;


import javax.persistence.*;
import java.util.List;

@Table(name = "commentaire")
public class Commentaire implements CommentaireDao{

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "idCommentaire")
    private Long id;
    private String commentaire;
    private enum statutCommentaire{valid,deleted,modified}

    @ManyToOne
    @JoinColumn(name = "idTopo")
    private Topo topo;

    @ManyToOne
    @JoinColumn(name = "idCompte")
    private Compte compte;


    @Override
    public List<String> ShowComments(int idTopo) {
        return null;
    }

    @Override
    public String addComments(int idTopo) {
        return null;
    }

    @Override
    public String deleteComments(int idTopo, int idComment) {
        return null;
    }
}
