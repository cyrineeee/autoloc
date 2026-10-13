package org.example.autoloc.service;

import org.example.autoloc.domain.Agence;

import java.util.List;
import java.util.Optional;

public interface AgenceService {
    List<Agence> findAll();
    Optional<Agence> findById(Long id);
    Agence create(Agence agence);
    Agence update(Long id, Agence agence);
    void delete(Long id);
}
