package com.projet6.contrat;

import com.projet6.Impl.Compte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
public interface CompteDao  {
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
