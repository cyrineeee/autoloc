package org.example.autoloc.services;

import org.example.autoloc.domain.Agence;
import org.example.autoloc.repositories.AgenceRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@AllArgsConstructor
public class IAgenceServicesImp implements IAgenceServices {

    private final AgenceRepository agenceRepository;

    @Override
    public Agence add(Agence agence) {
        return agenceRepository.save(agence);
    }

    @Override
    public Agence update(Agence agence) {
        return agenceRepository.save(agence);
    }

    @Override
    public void delete(Long id) {
        agenceRepository.deleteById(id);
    }

    @Override
    public Agence findById(Long id) {
        return agenceRepository.findById(id).orElse(null);
    }

    @Override
    public List<Agence> findAll() {
        return agenceRepository.findAll();
    }
}