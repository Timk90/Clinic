package main.java.ru.timur.clinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Tester on 16/08/2017.
 */
@Controller
public class WelcomeClinicController {

    @RequestMapping(value = {"/","/welcome"}, method = RequestMethod.GET)
    String welcome(){
        return "welcome";
    }

}
