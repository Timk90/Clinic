package main.java.ru.timur.clinic.mapper;

import main.java.ru.timur.clinic.bean.Client;


import java.util.List;

/**
 * Created by Tester on 16/08/2017.
 */

public interface ClientMapper {

    void insertClient(Client client);
    void deleteClientById(long id);
    void updateClient(Client client);
    void updateClientById(long id);
    List<Client> getClienByName(String name);
    List<Client> getClientById(long id);
    List<Client> getAllClients();

}
