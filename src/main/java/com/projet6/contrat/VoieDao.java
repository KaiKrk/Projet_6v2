package com.projet6.contrat;

import com.projet6.Impl.Voie;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface VoieDao {

    void addVoie();
    void updateVoie();
    void deleteVoie();
    List<Voie> getAllVoie();
    List<Voie> filterVoieByDifficulty (int minDifficulty , int maxDifficulty);
}
