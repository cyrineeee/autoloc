package org.example.autoloc.service;

import org.example.autoloc.domain.Paiement;

import java.util.List;
import java.util.Optional;

public interface PaiementService {
    List<Paiement> findAll();
    Optional<Paiement> findById(Long id);
    Paiement create(Paiement paiement);
    Paiement update(Long id, Paiement paiement);
    void delete(Long id);
}
