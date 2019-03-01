package com.projet6.Impl;

import com.projet6.contrat.ReservationDao;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;
import java.sql.Time;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table (name = "reservation")
public class Reservation implements ReservationDao {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    @Column(name = "idreservation")
    private Long id;

    @Column(name = "debutreservation")
    private Time debutReservation;

    @Column(name = "finreservation")
    private Time finReservation;

    @Column(name = "statutreservation")
    private String statutReservation;

    @ManyToOne
    @JoinColumn(name = "idtopo")
    private Topo topo;

    @ManyToOne
    @JoinColumn(name = "idcompte")
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
