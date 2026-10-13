package org.example.autoloc.services;

import org.example.autoloc.domain.Equipement;
import org.example.autoloc.repositories.EquipementRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@AllArgsConstructor
public class IEquipementServicesImp implements IEquipementServices {

    private final EquipementRepository equipementRepository;

    @Override
    public Equipement add(Equipement equipement) {
        return equipementRepository.save(equipement);
    }

    @Override
    public Equipement update(Equipement equipement) {
        return equipementRepository.save(equipement);
    }

    @Override
    public void delete(Long id) {
        equipementRepository.deleteById(id);
    }

    @Override
    public Equipement findById(Long id) {
        return equipementRepository.findById(id).orElse(null);
    }

    @Override
    public List<Equipement> findAll() {
        return equipementRepository.findAll();
    }
}