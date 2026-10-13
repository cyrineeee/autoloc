package org.example.autoloc.service.impl;

import org.example.autoloc.domain.Maintenance;
import org.example.autoloc.exception.ResourceNotFoundException;
import org.example.autoloc.repository.MaintenanceRepository;
import org.example.autoloc.service.MaintenanceService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MaintenanceServiceImpl implements MaintenanceService {

    private final MaintenanceRepository maintenanceRepository;

    public MaintenanceServiceImpl(MaintenanceRepository maintenanceRepository) {
        this.maintenanceRepository = maintenanceRepository;
    }

    @Override
    public List<Maintenance> findAll() {
        return maintenanceRepository.findAll();
    }

    @Override
    public Optional<Maintenance> findById(Long id) {
        return maintenanceRepository.findById(id);
    }

    @Override
    public Maintenance create(Maintenance maintenance) {
        return maintenanceRepository.save(maintenance);
    }

    @Override
    public Maintenance update(Long id, Maintenance maintenance) {
        Maintenance existing = maintenanceRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Maintenance", id));
        BeanUtils.copyProperties(maintenance, existing, "idMaintenance");
        return maintenanceRepository.save(existing);
    }

    @Override
    public void delete(Long id) {
        if (!maintenanceRepository.existsById(id)) {
            throw new ResourceNotFoundException("Maintenance", id);
        }
        maintenanceRepository.deleteById(id);
    }
}
