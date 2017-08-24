package main.java.ru.timur.clinic.controller;

import main.java.ru.timur.clinic.bean.Doctor;
import main.java.ru.timur.clinic.service.ClinicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created by Tim on 23.08.2017.
 */
@Controller
public class DoctorsController {

    @Autowired
    ClinicService clinicService;

    @RequestMapping(value={"/doctors"}, method = GET)
    ModelAndView showDoctorsPage(){
        ModelAndView model = new ModelAndView();
        List<Doctor> doctors = clinicService.getAllDoctors();
        model.addObject("doctors", doctors);
        model.setViewName("doctors");
        return model;
    }

    @RequestMapping(value="/doctors/{id}", method = GET)
    ModelAndView showDoctorPersonalPage(
                    @PathVariable("id") long id
            ){
        List<Doctor> doctor = clinicService.getDoctorById(id);
        ModelAndView model = new ModelAndView();
        model.addObject("selectedDoctor", doctor);
        model.setViewName("doctorinfo");
        return model;
    }

    @RequestMapping(value="/doctors/{id}/delete", method = GET)
    ModelAndView deleteDoctor(
            @PathVariable("id") long id
    ){
        clinicService.deleteDoctorById(id);
        ModelAndView model = new ModelAndView();
        model.setViewName("redirect:/doctors");
        return model;
    }

    @RequestMapping(value="/doctors/{id}/update", method = GET)
    ModelAndView updateDoctor(
            @PathVariable("id") long id
    ){
        List<Doctor> doctors = clinicService.getDoctorById(id);
        Doctor doctor = doctors.get(0);
        ModelAndView model = new ModelAndView();
        model.addObject("doctor", doctor);
        model.addObject("message", "Update");
        model.setViewName("doctorform");
        return model;
    }

    @RequestMapping(value="/doctors/add", method = GET)
    ModelAndView addDoctor(){
        Doctor doctor = new Doctor();
        ModelAndView model = new ModelAndView();
        model.addObject("doctor", doctor);
        model.addObject("message", "Add");
        model.setViewName("doctorform");
        return model;
    }
}
