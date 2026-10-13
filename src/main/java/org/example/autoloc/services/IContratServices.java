package org.example.autoloc.services;

import org.example.autoloc.domain.Contrat;
import java.util.List;

public interface IContratServices {
    Contrat add(Contrat contrat);
    Contrat update(Contrat contrat);
    void delete(Long id);
    Contrat findById(Long id);
    List<Contrat> findAll();
}