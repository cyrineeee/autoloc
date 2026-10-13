package org.example.autoloc.service;

import org.example.autoloc.domain.Client;

import java.util.List;
import java.util.Optional;

public interface ClientService {
    List<Client> findAll();
    Optional<Client> findById(Long id);
    Client create(Client client);
    Client update(Long id, Client client);
    void delete(Long id);
}
