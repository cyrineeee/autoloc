package org.example.autoloc.service.impl;

import org.example.autoloc.domain.Paiement;
import org.example.autoloc.exception.ResourceNotFoundException;
import org.example.autoloc.repository.PaiementRepository;
import org.example.autoloc.service.PaiementService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PaiementServiceImpl implements PaiementService {

    private final PaiementRepository paiementRepository;

    public PaiementServiceImpl(PaiementRepository paiementRepository) {
        this.paiementRepository = paiementRepository;
    }

    @Override
    public List<Paiement> findAll() {
        return paiementRepository.findAll();
    }

    @Override
    public Optional<Paiement> findById(Long id) {
        return paiementRepository.findById(id);
    }

    @Override
    public Paiement create(Paiement paiement) {
        return paiementRepository.save(paiement);
    }

    @Override
    public Paiement update(Long id, Paiement paiement) {
        Paiement existing = paiementRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Paiement", id));
        BeanUtils.copyProperties(paiement, existing, "idPaiement");
        return paiementRepository.save(existing);
    }

    @Override
    public void delete(Long id) {
        if (!paiementRepository.existsById(id)) {
            throw new ResourceNotFoundException("Paiement", id);
        }
        paiementRepository.deleteById(id);
    }
}
