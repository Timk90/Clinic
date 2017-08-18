package main.java.ru.timur.clinic.service;

import main.java.ru.timur.clinic.bean.Client;
import main.java.ru.timur.clinic.mapper.ClientMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Tester on 16/08/2017.
 */
@Service("service")
public class ClinicServiceImp implements ClinicService{

    @Autowired
    ClientMapper clientMapper;

    @Override
    public List<Client> getClientById(long id) {
        return clientMapper.getClientById(id);
    }

    @Override
    public List<Client> getClientByName(String name) {
        return clientMapper.getClienByName(name);
    }

    @Override
    public List<Client> getAllClients() {
        return clientMapper.getAllClients();
    }

    @Override
    public void deleteClientById(long id) {
        clientMapper.deleteClientById(id);
    }

    @Override
    public void updateClient(Client client) {

    }

    @Override
    public void insertClientToDB(Client client) {
            clientMapper.insertClient(client);
    }
}
