package org.example.autoloc.services;

import org.example.autoloc.domain.Employe;
import java.util.List;

public interface IEmployeServices {
    Employe add(Employe employe);
    Employe update(Employe employe);
    void delete(Long id);
    Employe findById(Long id);
    List<Employe> findAll();
}