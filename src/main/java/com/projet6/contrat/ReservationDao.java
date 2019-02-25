package com.projet6.contrat;

import com.projet6.Impl.Reservation;
import com.projet6.Impl.Topo;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface ReservationDao {


    void addReservation (int idTopo, String date);
    void deleteReservation (Reservation reservation );
    void updateReservation (Reservation reservation);
    boolean isAvailable (Topo topo);
    List<Reservation> getListAvailableTopo (int idCompte);
    List<Reservation> getBookedTopo (int idCompte);
}
