package org.example.autoloc.service;

import org.example.autoloc.domain.Contrat;

import java.util.List;
import java.util.Optional;

public interface ContratService {
    List<Contrat> findAll();
    Optional<Contrat> findById(Long id);
    Contrat create(Contrat contrat);
    Contrat update(Long id, Contrat contrat);
    void delete(Long id);
}
