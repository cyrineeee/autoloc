package org.example.autoloc.service.impl;

import org.example.autoloc.domain.Agence;
import org.example.autoloc.exception.ResourceNotFoundException;
import org.example.autoloc.repository.AgenceRepository;
import org.example.autoloc.service.AgenceService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AgenceServiceImpl implements AgenceService {

    private final AgenceRepository agenceRepository;

    public AgenceServiceImpl(AgenceRepository agenceRepository) {
        this.agenceRepository = agenceRepository;
    }

    @Override
    public List<Agence> findAll() {
        return agenceRepository.findAll();
    }

    @Override
    public Optional<Agence> findById(Long id) {
        return agenceRepository.findById(id);
    }

    @Override
    public Agence create(Agence agence) {
        return agenceRepository.save(agence);
    }

    @Override
    public Agence update(Long id, Agence agence) {
        Agence existing = agenceRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Agence", id));
        BeanUtils.copyProperties(agence, existing, "idAgence");
        return agenceRepository.save(existing);
    }

    @Override
    public void delete(Long id) {
        if (!agenceRepository.existsById(id)) {
            throw new ResourceNotFoundException("Agence", id);
        }
        agenceRepository.deleteById(id);
    }
}
