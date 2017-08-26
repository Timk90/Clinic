package main.java.ru.timur.clinic.controller;

import main.java.ru.timur.clinic.bean.Doctor;
import main.java.ru.timur.clinic.service.ClinicService;
import main.java.ru.timur.clinic.validator.MyDoctorValidator;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Tim on 24.08.2017.
 */
@Controller
public class ValidationUserFormController {

    @Autowired
    @Qualifier("myValidator")
    MyDoctorValidator validator;

    @Autowired
    ClinicService clinicService;

    @InitBinder
    private void initBinder(WebDataBinder binder) {
        binder.setValidator(validator);
    }

    @RequestMapping(value = {"/checkDoctorForm**"}, method = RequestMethod.POST)
    ModelAndView checkForm(
            @Param("message") String message,
            @Validated @ModelAttribute("doctor") Doctor doctor,
            BindingResult result
            ){
        ModelAndView modelAndView = new ModelAndView();

        if(result.hasErrors()){
            //model.addObject("doctor", doctor);
            modelAndView.addObject("message", message);
            modelAndView.setViewName("doctorform");

            return modelAndView;
        }else{
            if(message.equals("Update")){
                clinicService.updateDoctor(doctor);
            }else if(message.equals("Add")){
                clinicService.insertDoctor(doctor);
            }
            modelAndView.addObject("doctors", clinicService.getAllDoctors());
            modelAndView.setViewName("redirect:/doctors");
            return modelAndView;
        }


    }

}
