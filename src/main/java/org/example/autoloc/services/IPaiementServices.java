package org.example.autoloc.services;

import org.example.autoloc.domain.Paiement;
import java.util.List;

public interface IPaiementServices {
    Paiement add(Paiement paiement);
    Paiement update(Paiement paiement);
    void delete(Long id);
    Paiement findById(Long id);
    List<Paiement> findAll();
}