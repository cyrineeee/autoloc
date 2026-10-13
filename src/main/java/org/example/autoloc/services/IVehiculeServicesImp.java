package org.example.autoloc.services;

import org.example.autoloc.domain.Vehicule;
import org.example.autoloc.repositories.VehiculeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@AllArgsConstructor
public class IVehiculeServicesImp implements IVehiculeServices {

    private final VehiculeRepository vehiculeRepository;

    @Override
    public Vehicule add(Vehicule vehicule) {
        return vehiculeRepository.save(vehicule);
    }

    @Override
    public Vehicule update(Vehicule vehicule) {
        return vehiculeRepository.save(vehicule);
    }

    @Override
    public void delete(Long id) {
        vehiculeRepository.deleteById(id);
    }

    @Override
    public Vehicule findById(Long id) {
        return vehiculeRepository.findById(id).orElse(null);
    }

    @Override
    public List<Vehicule> findAll() {
        return vehiculeRepository.findAll();
    }
}