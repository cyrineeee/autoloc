package org.example.autoloc.services;

import org.example.autoloc.domain.Reservation;
import java.util.List;

public interface IReservationServices {
    Reservation add(Reservation reservation);
    Reservation update(Reservation reservation);
    void delete(Long id);
    Reservation findById(Long id);
    List<Reservation> findAll();
}