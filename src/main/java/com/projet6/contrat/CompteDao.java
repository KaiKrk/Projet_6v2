package com.projet6.contrat;

import com.projet6.projet6.Compte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
@Repository
@Transactional
public interface CompteDao extends JpaRepository {
    /*
       add account into database
        */
    void addCompte(Compte compte);
    /*
    delete selected account
     */
    void deleteCompte (Compte compte);
    /*
    update selected account
     */
    void updateCompte (Compte compte);


}
