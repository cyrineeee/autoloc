package org.example.autoloc.services;

import org.example.autoloc.domain.Maintenance;
import java.util.List;

public interface IMaintenanceServices {
    Maintenance add(Maintenance maintenance);
    Maintenance update(Maintenance maintenance);
    void delete(Long id);
    Maintenance findById(Long id);
    List<Maintenance> findAll();
}