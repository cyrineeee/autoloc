package org.example.autoloc.services;

import org.example.autoloc.domain.Equipement;
import java.util.List;

public interface IEquipementServices {
    Equipement add(Equipement equipement);
    Equipement update(Equipement equipement);
    void delete(Long id);
    Equipement findById(Long id);
    List<Equipement> findAll();
}