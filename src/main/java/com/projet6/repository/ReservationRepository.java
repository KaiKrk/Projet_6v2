package com.projet6.repository;

import com.projet6.Impl.Compte;
import com.projet6.Impl.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
