package main.java.ru.timur.clinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * Created by Tim on 22.08.2017.
 */
@Controller
public class WelcomeClinicController {
    @RequestMapping(value = {""}, method = GET)
    ModelAndView welcome(){
        return new ModelAndView("doctors");
    }
}
