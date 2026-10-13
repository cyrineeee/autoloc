package org.example.autoloc.service;

import org.example.autoloc.domain.Employe;

import java.util.List;
import java.util.Optional;

public interface EmployeService {
    List<Employe> findAll();
    Optional<Employe> findById(Long id);
    Employe create(Employe employe);
    Employe update(Long id, Employe employe);
    void delete(Long id);
}
