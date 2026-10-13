package org.example.autoloc.service;

import org.example.autoloc.domain.Equipement;

import java.util.List;
import java.util.Optional;

public interface EquipementService {
    List<Equipement> findAll();
    Optional<Equipement> findById(Long id);
    Equipement create(Equipement equipement);
    Equipement update(Long id, Equipement equipement);
    void delete(Long id);
}
