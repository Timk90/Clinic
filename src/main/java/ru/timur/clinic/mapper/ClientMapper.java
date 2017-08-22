package main.java.ru.timur.clinic.mapper;

import main.java.ru.timur.clinic.bean.Client;
import org.apache.ibatis.annotations.Param;


import java.util.List;
import java.util.Map;

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
    List<Map<String, String>> getAllClientsWithDoctors();
    List<Map<String, String>> getClientWithDoctorsById(@Param("id") long id);

}
