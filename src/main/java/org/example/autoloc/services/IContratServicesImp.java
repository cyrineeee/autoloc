package org.example.autoloc.services;

import org.example.autoloc.domain.Contrat;
import org.example.autoloc.repositories.ContratRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@AllArgsConstructor
public class IContratServicesImp implements IContratServices {

    private final ContratRepository contratRepository;

    @Override
    public Contrat add(Contrat contrat) {
        return contratRepository.save(contrat);
    }

    @Override
    public Contrat update(Contrat contrat) {
        return contratRepository.save(contrat);
    }

    @Override
    public void delete(Long id) {
        contratRepository.deleteById(id);
    }

    @Override
    public Contrat findById(Long id) {
        return contratRepository.findById(id).orElse(null);
    }

    @Override
    public List<Contrat> findAll() {
        return contratRepository.findAll();
    }
}