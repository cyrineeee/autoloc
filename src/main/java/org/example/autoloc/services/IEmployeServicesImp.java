package org.example.autoloc.services;

import org.example.autoloc.domain.Employe;
import org.example.autoloc.repositories.EmployeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@AllArgsConstructor
public class IEmployeServicesImp implements IEmployeServices {

    private final EmployeRepository employeRepository;

    @Override
    public Employe add(Employe employe) {
        return employeRepository.save(employe);
    }

    @Override
    public Employe update(Employe employe) {
        return employeRepository.save(employe);
    }

    @Override
    public void delete(Long id) {
        employeRepository.deleteById(id);
    }

    @Override
    public Employe findById(Long id) {
        return employeRepository.findById(id).orElse(null);
    }

    @Override
    public List<Employe> findAll() {
        return employeRepository.findAll();
    }
}