package com.projet6.Impl;

import com.projet6.contrat.CompteDao;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import javax.persistence.*;
import java.util.List;
import java.util.Optional;

@Entity
//@Table (name = "compte")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Compte  {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "idCompte")
    private Long id;
    private String identifiant;
    private String motDePasse;
    private String email;
    private String pays;
    private String nom;
    private String prenom;
    private String pseudo;




}
