package com.projet6.contrat;

import com.projet6.Impl.Secteur;
import com.projet6.Impl.Topo;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface SecteurDao {


    void isAvailable(Secteur secteur);
    List<Secteur> accessibleSecteur(Topo topo);
    void updateSecteur(Secteur secteur);
}
