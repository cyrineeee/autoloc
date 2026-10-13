package org.example.autoloc.services;

import org.example.autoloc.domain.Client;
import java.util.List;

public interface IClientServices {
    Client add(Client client);
    Client update(Client client);
    void delete(Long id);
    Client findById(Long id);
    List<Client> findAll();
}