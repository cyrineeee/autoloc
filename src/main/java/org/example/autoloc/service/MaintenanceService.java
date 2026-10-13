package org.example.autoloc.service;

import org.example.autoloc.domain.Maintenance;

import java.util.List;
import java.util.Optional;

public interface MaintenanceService {
    List<Maintenance> findAll();
    Optional<Maintenance> findById(Long id);
    Maintenance create(Maintenance maintenance);
    Maintenance update(Long id, Maintenance maintenance);
    void delete(Long id);
}
