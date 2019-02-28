package com.projet6.repository;

import com.projet6.Impl.Compte;
import com.projet6.Impl.Secteur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SecteurRepository extends JpaRepository<Secteur, Long> {
}
