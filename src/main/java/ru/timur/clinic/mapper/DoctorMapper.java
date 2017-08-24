package main.java.ru.timur.clinic.mapper;

import main.java.ru.timur.clinic.bean.Doctor;

import java.util.List;

/**
 * Created by Tester on 21/08/2017.
 */
public interface DoctorMapper {

    void insertDoctor(Doctor doctor);
    void deleteDoctorById(long id);
    void updateDoctor(Doctor doctor);
    List<Doctor> getDoctorByName(String firstname);
    List<Doctor> getDoctorById(long id);
    List<Doctor> getAllDoctors();

}
