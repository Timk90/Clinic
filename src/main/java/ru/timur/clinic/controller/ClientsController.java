package main.java.ru.timur.clinic.controller;

import main.java.ru.timur.clinic.service.ClinicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created by Tim on 23.08.2017.
 */
@Controller
public class ClientsController {

    @Autowired
    ClinicService clinicService;

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
