package org.example.autoloc.services;

import org.example.autoloc.domain.Agence;
import java.util.List;

public interface IAgenceServices {
    Agence add(Agence agence);
    Agence update(Agence agence);
    void delete(Long id);
    Agence findById(Long id);
    List<Agence> findAll();
}