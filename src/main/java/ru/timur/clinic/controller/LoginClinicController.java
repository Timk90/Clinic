package main.java.ru.timur.clinic.controller;

import main.java.ru.timur.clinic.bean.Client;
import main.java.ru.timur.clinic.service.ClinicService;
import main.java.ru.timur.clinic.service.ClinicServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


/**
 * Created by Tester on 16/08/2017.
 */
@Controller
public class LoginClinicController {

//    @Autowired
//    ClinicServiceImp clinicService;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    ModelAndView login(){
        ModelAndView model = new ModelAndView();
        //model.addObject("User", new Client());
        model.setViewName("login");
        return model;
    }
}
