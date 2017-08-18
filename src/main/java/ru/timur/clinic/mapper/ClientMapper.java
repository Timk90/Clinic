package main.java.ru.timur.clinic.mapper;

import main.java.ru.timur.clinic.bean.Client;


import java.util.List;

/**
 * Created by Tester on 16/08/2017.
 */

public interface ClientMapper {

    void insertClient(Client client);
    List<Client> getClienByName(String name);
    List<Client> getClientById(long id);
    void deleteClientById(long id);
    List<Client> getAllClients();

}
