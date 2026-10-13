package org.example.autoloc.repository;

import org.example.autoloc.domain.Employe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeRepository extends JpaRepository<Employe, Long> {
}
