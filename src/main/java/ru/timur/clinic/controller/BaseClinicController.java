package main.java.ru.timur.clinic.controller;

import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Tester on 16/08/2017.
 */
@Controller
public class BaseClinicController {

    @RequestMapping(value = {"/"}, method = RequestMethod.GET)
    String welcome() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();

        if (SecurityContextHolder.getContext().getAuthentication() != null &&
                SecurityContextHolder.getContext().getAuthentication().isAuthenticated() &&
                !SecurityContextHolder.getContext().getAuthentication().getName().equals("") &&
                //when Anonymous Authentication is enabled
                !(SecurityContextHolder.getContext().getAuthentication()
                        instanceof AnonymousAuthenticationToken)) {
            return "redirect:/welcome";
        }else
        return "redirect:/login";
    }

}
