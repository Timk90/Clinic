package main.java.ru.timur.clinic.service;

import main.java.ru.timur.clinic.bean.Client;
import main.java.ru.timur.clinic.bean.Doctor;
import main.java.ru.timur.clinic.mapper.ClientMapper;
import main.java.ru.timur.clinic.mapper.DoctorMapper;
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

    @Autowired
    DoctorMapper doctorMapper;

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
        clientMapper.updateClient(client);
    }

    @Override
    public void updateClientById(long id) {
        List<Client> client = clientMapper.getClientById(id);
        clientMapper.updateClient(client.get(0));
    }

    @Override
    public void insertClientToDB(Client client) {
            clientMapper.insertClient(client);
    }

    @Override
    public void insertDoctor(Doctor doctor) {
        doctorMapper.insertDoctor(doctor);
    }

    @Override
    public void deleteDoctorById(Short id) {
        doctorMapper.deleteDoctorById(id);
    }

    @Override
    public void updateDoctor(Doctor doctor) {
        doctorMapper.updateDoctor(doctor);
    }

    @Override
    public List<Doctor> getDoctorByName(String firstname) {
        return doctorMapper.getDoctorByName(firstname);
    }

    @Override
    public List<Doctor> getDoctorById(Short id) {

        return doctorMapper.getDoctorById(id);
    }

    @Override
    public List<Doctor> getAllDoctors() {
        return doctorMapper.getAllDoctors();
    }
}
