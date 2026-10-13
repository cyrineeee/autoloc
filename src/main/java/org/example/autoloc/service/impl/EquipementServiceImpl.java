package org.example.autoloc.service.impl;

import org.example.autoloc.domain.Equipement;
import org.example.autoloc.exception.ResourceNotFoundException;
import org.example.autoloc.repository.EquipementRepository;
import org.example.autoloc.service.EquipementService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EquipementServiceImpl implements EquipementService {

    private final EquipementRepository equipementRepository;

    public EquipementServiceImpl(EquipementRepository equipementRepository) {
        this.equipementRepository = equipementRepository;
    }

    @Override
    public List<Equipement> findAll() {
        return equipementRepository.findAll();
    }

    @Override
    public Optional<Equipement> findById(Long id) {
        return equipementRepository.findById(id);
    }

    @Override
    public Equipement create(Equipement equipement) {
        return equipementRepository.save(equipement);
    }

    @Override
    public Equipement update(Long id, Equipement equipement) {
        Equipement existing = equipementRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Equipement", id));
        BeanUtils.copyProperties(equipement, existing, "idEquipement");
        return equipementRepository.save(existing);
    }

    @Override
    public void delete(Long id) {
        if (!equipementRepository.existsById(id)) {
            throw new ResourceNotFoundException("Equipement", id);
        }
        equipementRepository.deleteById(id);
    }
}
