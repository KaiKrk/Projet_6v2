package com.projet6;

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
@Table (name = "compte")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Compte  {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "idCompte")
    private Long id;

    @Column(name = "identifiant")
    private String identifiant;

    @Column(name = "motdepasse")
    private String motDePasse;

    @Column(name = "email")
    private String email;

    @Column(name = "pays")
    private String pays;

    @Column(name = "nom")
    private String nom;

    @Column(name = "prenom")
    private String prenom;

    @Column(name = "pseudo")
    private String pseudo;





}
