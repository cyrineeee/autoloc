package org.example.autoloc.service;

import org.example.autoloc.domain.Reservation;

import java.util.List;
import java.util.Optional;

public interface ReservationService {
    List<Reservation> findAll();
    Optional<Reservation> findById(Long id);
    Reservation create(Reservation reservation);
    Reservation update(Long id, Reservation reservation);
    void delete(Long id);
}
