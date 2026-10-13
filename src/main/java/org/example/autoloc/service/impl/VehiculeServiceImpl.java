package org.example.autoloc.service.impl;

import org.example.autoloc.domain.Vehicule;
import org.example.autoloc.exception.ResourceNotFoundException;
import org.example.autoloc.repository.VehiculeRepository;
import org.example.autoloc.service.VehiculeService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehiculeServiceImpl implements VehiculeService {

    private final VehiculeRepository vehiculeRepository;

    public VehiculeServiceImpl(VehiculeRepository vehiculeRepository) {
        this.vehiculeRepository = vehiculeRepository;
    }

    @Override
    public List<Vehicule> findAll() {
        return vehiculeRepository.findAll();
    }

    @Override
    public Optional<Vehicule> findById(Long id) {
        return vehiculeRepository.findById(id);
    }

    @Override
    public Vehicule create(Vehicule vehicule) {
        return vehiculeRepository.save(vehicule);
    }

    @Override
    public Vehicule update(Long id, Vehicule vehicule) {
        Vehicule existing = vehiculeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Vehicule", id));
        BeanUtils.copyProperties(vehicule, existing, "idVehicule");
        return vehiculeRepository.save(existing);
    }

    @Override
    public void delete(Long id) {
        if (!vehiculeRepository.existsById(id)) {
            throw new ResourceNotFoundException("Vehicule", id);
        }
        vehiculeRepository.deleteById(id);
    }
}
