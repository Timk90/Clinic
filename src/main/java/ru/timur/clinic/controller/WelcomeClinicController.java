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
        String name = auth.getName();
        ModelAndView model = new ModelAndView();
        model.addObject("name", name);
        model.setViewName("welcome");
        if(authorities.contains(new SimpleGrantedAuthority("ROLE_ADMIN"))){
            model.addObject("role", "admin");
        }else{
            model.addObject("role", "doctor");
        }
        return model;
    }

    @RequestMapping(value = {"/403"}, method = GET)
    ModelAndView noAccess(){
        ModelAndView model = new ModelAndView();
        model.setViewName("403");
        return model;
    }
}
