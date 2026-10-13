package org.example.autoloc.service.impl;

import org.example.autoloc.domain.Contrat;
import org.example.autoloc.exception.ResourceNotFoundException;
import org.example.autoloc.repository.ContratRepository;
import org.example.autoloc.service.ContratService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContratServiceImpl implements ContratService {

    private final ContratRepository contratRepository;

    public ContratServiceImpl(ContratRepository contratRepository) {
        this.contratRepository = contratRepository;
    }

    @Override
    public List<Contrat> findAll() {
        return contratRepository.findAll();
    }

    @Override
    public Optional<Contrat> findById(Long id) {
        return contratRepository.findById(id);
    }

    @Override
    public Contrat create(Contrat contrat) {
        return contratRepository.save(contrat);
    }

    @Override
    public Contrat update(Long id, Contrat contrat) {
        Contrat existing = contratRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Contrat", id));
        BeanUtils.copyProperties(contrat, existing, "idContrat");
        return contratRepository.save(existing);
    }

    @Override
    public void delete(Long id) {
        if (!contratRepository.existsById(id)) {
            throw new ResourceNotFoundException("Contrat", id);
        }
        contratRepository.deleteById(id);
    }
}
