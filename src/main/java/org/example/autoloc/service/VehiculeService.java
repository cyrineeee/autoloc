package org.example.autoloc.service;

import org.example.autoloc.domain.Vehicule;

import java.util.List;
import java.util.Optional;

public interface VehiculeService {
    List<Vehicule> findAll();
    Optional<Vehicule> findById(Long id);
    Vehicule create(Vehicule vehicule);
    Vehicule update(Long id, Vehicule vehicule);
    void delete(Long id);
}
