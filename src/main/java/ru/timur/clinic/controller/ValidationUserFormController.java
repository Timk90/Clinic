package main.java.ru.timur.clinic.controller;

import main.java.ru.timur.clinic.bean.Doctor;
import main.java.ru.timur.clinic.service.ClinicService;
import main.java.ru.timur.clinic.validator.MyDoctorValidator;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
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


    MyDoctorValidator validator;

    @Autowired
    ClinicService clinicService;

    @InitBinder
    private void initBinder(WebDataBinder binder) {
        binder.setValidator(validator);
    }

    @RequestMapping(value = {"/checkDoctorForm**"}, method = RequestMethod.POST)
    ModelAndView checkForm(
            @ModelAttribute("doctor") @Validated Doctor doctor,
            @Param("message") String message,
            BindingResult result
            ){


        ModelAndView model = new ModelAndView();
        if(result.hasErrors()){
            model.setViewName("doctorform");
        }else{
            if(message.equals("update")){
                clinicService.updateDoctor(doctor);
            }else if(message.equals("add")){
                clinicService.insertDoctor(doctor);
            }

            model.setViewName("doctors");
        }

        return model;
    }

}
