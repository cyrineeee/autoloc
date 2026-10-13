package org.example.autoloc.services;

import org.example.autoloc.domain.Maintenance;
import org.example.autoloc.repositories.MaintenanceRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@AllArgsConstructor
public class IMaintenanceServicesImp implements IMaintenanceServices {

    private final MaintenanceRepository maintenanceRepository;

    @Override
    public Maintenance add(Maintenance maintenance) {
        return maintenanceRepository.save(maintenance);
    }

    @Override
    public Maintenance update(Maintenance maintenance) {
        return maintenanceRepository.save(maintenance);
    }

    @Override
    public void delete(Long id) {
        maintenanceRepository.deleteById(id);
    }

    @Override
    public Maintenance findById(Long id) {
        return maintenanceRepository.findById(id).orElse(null);
    }

    @Override
    public List<Maintenance> findAll() {
        return maintenanceRepository.findAll();
    }
}