package main.java.ru.timur.clinic.controller;

import main.java.ru.timur.clinic.bean.Client;
import main.java.ru.timur.clinic.bean.Doctor;
import main.java.ru.timur.clinic.service.ClinicService;
import main.java.ru.timur.clinic.service.ClinicServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


/**
 * Created by Tester on 16/08/2017.
 */
@Controller
public class LoginClinicController {

//    @Autowired
//    ClinicServiceImp clinicService;

    @RequestMapping(value = "/login**", method = RequestMethod.GET)
    ModelAndView loginGet(){
        ModelAndView model = new ModelAndView();
        model.addObject("doctor", new Doctor());
        model.setViewName("login");
        return model;
    }

    @RequestMapping(value = "/login**", method = RequestMethod.POST)
    ModelAndView loginPost(
            @RequestParam(value = "error", required = false) String error,
            @RequestParam(value = "logout", required = false) String logout){
        ModelAndView model = new ModelAndView();
        model.addObject("doctor", new Doctor());

        if(error != null){
            model.addObject("error", "Неправильное имя пользователя или пароль!");
        }

        if(logout != null){
            model.addObject("logout", "Вы вышли из системы!");
        }

        model.setViewName("login");
        return model;
    }


}
