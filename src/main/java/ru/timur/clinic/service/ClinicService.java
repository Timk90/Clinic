package main.java.ru.timur.clinic.service;

import main.java.ru.timur.clinic.bean.Client;
import main.java.ru.timur.clinic.bean.Doctor;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by Tester on 16/08/2017.
 */
public interface ClinicService {

    List<Client> getClientById(long id);
    List<Client> getClientByName(String name);
    List<Client> getAllClients();
    void deleteClientById(long id);
    void updateClient(Client client);
    void insertClientToDB(Client client);
    void updateClientById(long id);

    void insertDoctor(Doctor doctor);
    void deleteDoctorById(Short id);
    void updateDoctor(Doctor doctor);
    List<Doctor> getDoctorByName(String firstname);
    List<Doctor> getDoctorById(Short id);
    List<Doctor> getAllDoctors();

}
