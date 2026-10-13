package org.example.autoloc.services;

import org.example.autoloc.domain.Paiement;
import org.example.autoloc.repositories.PaiementRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@AllArgsConstructor
public class IPaiementServicesImp implements IPaiementServices {

    private final PaiementRepository paiementRepository;

    @Override
    public Paiement add(Paiement paiement) {
        return paiementRepository.save(paiement);
    }

    @Override
    public Paiement update(Paiement paiement) {
        return paiementRepository.save(paiement);
    }

    @Override
    public void delete(Long id) {
        paiementRepository.deleteById(id);
    }

    @Override
    public Paiement findById(Long id) {
        return paiementRepository.findById(id).orElse(null);
    }

    @Override
    public List<Paiement> findAll() {
        return paiementRepository.findAll();
    }
}