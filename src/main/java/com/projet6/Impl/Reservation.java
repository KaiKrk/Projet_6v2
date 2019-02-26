package com.projet6.Impl;

import com.projet6.Compte;
import com.projet6.contrat.ReservationDao;


import javax.persistence.*;
import java.sql.Time;
import java.util.List;

@Table (name = "reservation")
public class Reservation implements ReservationDao {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "idReservation")
    private Long id;
    private Time debutReservation;
    private Time finReservation;
    private enum statutReservation{}

    @ManyToOne
    @JoinColumn(name = "idTopo")
    private Topo topo;

    @ManyToOne
    @JoinColumn(name = "idCompte")
    private Compte compte;


    @Override
    public void addReservation(int idTopo, String date) {

    }

    @Override
    public void deleteReservation(Reservation reservation) {

    }

    @Override
    public void updateReservation(Reservation reservation) {

    }

    @Override
    public boolean isAvailable(Topo topo) {
        return false;
    }

    @Override
    public List<Reservation> getListAvailableTopo(int idCompte) {
        return null;
    }

    @Override
    public List<Reservation> getBookedTopo(int idCompte) {
        return null;
    }
}
