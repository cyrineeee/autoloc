package org.example.autoloc.services;

import org.example.autoloc.domain.Vehicule;
import java.util.List;

public interface IVehiculeServices {
    Vehicule add(Vehicule vehicule);
    Vehicule update(Vehicule vehicule);
    void delete(Long id);
    Vehicule findById(Long id);
    List<Vehicule> findAll();
}