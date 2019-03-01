package com.projet6.Impl;

import com.projet6.contrat.CommentaireDao;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "commentaire")
public class Commentaire implements CommentaireDao{

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "idcommentaire")
    private Long id;
    private String commentaire;

    @Column(name = "statutcommentaire")
    private String statutCommentaire;

    @ManyToOne
    @JoinColumn(name = "idtopo")
    private Topo topo;

    @ManyToOne
    @JoinColumn(name = "idcompte")
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
