package main.java.ru.timur.clinic.controller;

import main.java.ru.timur.clinic.bean.Client;
import main.java.ru.timur.clinic.bean.Doctor;
import main.java.ru.timur.clinic.service.ClinicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created by Tim on 22.08.2017.
 */

@Controller
public class WelcomeClinicController {

    @Autowired
    ClinicService clinicService;

    @RequestMapping(value = {"/welcome**"}, method = GET)
    ModelAndView welcome(){
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        Collection<? extends GrantedAuthority> authorities = auth.getAuthorities();
        if(authorities.contains(new SimpleGrantedAuthority("ROLE_ADMIN"))){
        return new ModelAndView("redirect:/doctors");
        }else{
            return new ModelAndView("redirect:/clients");
        }
    }

    @RequestMapping(value={"/doctors"}, method = GET)
    ModelAndView showDoctorsPage(){
        ModelAndView model = new ModelAndView();
        List<Doctor> doctors = clinicService.getAllDoctors();
        model.addObject("doctors", doctors);
        model.setViewName("doctors");
        return model;
    }

    @RequestMapping(value={"/clients"}, method = GET)
    ModelAndView showClintsPage(){
        ModelAndView model = new ModelAndView();
        //List<Client> clients = clinicService.getAllClients();
        List<Map<String,String>> clients = clinicService.getAllClientsWithDoctors();
        model.addObject("clients", clients);
        model.setViewName("clients");
        return model;
    }

    @RequestMapping(value={"/clients/{id}"}, method = GET)
    ModelAndView showClintPersonalPage(
            @PathVariable(value="id", required = false) long id){
        List<Map<String, String>> client = clinicService.getClientWithDoctorsById(id);
        ModelAndView model = new ModelAndView();
        model.addObject("selectedClient", client);
        model.setViewName("clientinfo");
        return model;
    }

}
