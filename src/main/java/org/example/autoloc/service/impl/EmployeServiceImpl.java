package org.example.autoloc.service.impl;

import org.example.autoloc.domain.Employe;
import org.example.autoloc.exception.ResourceNotFoundException;
import org.example.autoloc.repository.EmployeRepository;
import org.example.autoloc.service.EmployeService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeServiceImpl implements EmployeService {

    private final EmployeRepository employeRepository;

    public EmployeServiceImpl(EmployeRepository employeRepository) {
        this.employeRepository = employeRepository;
    }

    @Override
    public List<Employe> findAll() {
        return employeRepository.findAll();
    }

    @Override
    public Optional<Employe> findById(Long id) {
        return employeRepository.findById(id);
    }

    @Override
    public Employe create(Employe employe) {
        return employeRepository.save(employe);
    }

    @Override
    public Employe update(Long id, Employe employe) {
        Employe existing = employeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employe", id));
        BeanUtils.copyProperties(employe, existing, "idEmploye");
        return employeRepository.save(existing);
    }

    @Override
    public void delete(Long id) {
        if (!employeRepository.existsById(id)) {
            throw new ResourceNotFoundException("Employe", id);
        }
        employeRepository.deleteById(id);
    }
}
