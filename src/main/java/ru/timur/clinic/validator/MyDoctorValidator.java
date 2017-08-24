package main.java.ru.timur.clinic.validator;

import main.java.ru.timur.clinic.bean.Doctor;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import org.springframework.validation.annotation.Validated;

/**
 * Created by Tester on 21/08/2017.
 */

public class MyDoctorValidator implements Validator {



    @Override
    public boolean supports(Class<?> aClass) {
        return false;
    }

    @Override
    public void validate(Object o, Errors errors) {
        Doctor doctor = (Doctor)o;

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "firstname", "check.name.empty");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "lastname", "check.name.empty");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "check.name.empty");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "passwordConfirmation", "check.name.empty");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "speciality", "check.name.empty");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "cabinet", "check.name.empty");

        if(doctor.getPatronymic().trim().length()==0 && doctor.getPatronymic().length()>0){
            errors.rejectValue("patronymic", "check.patronymic");
        }

        if(doctor.getFirstname().length()<3 || doctor.getFirstname().length()>20){
            errors.rejectValue("firstname", "check.name.length");
        }

        if(doctor.getLastname().length()<3 || doctor.getLastname().length()>20){
            errors.rejectValue("lastname", "check.name.length");
        }

        if(doctor.getCabinet()>3){
            errors.rejectValue("cabinet", "check.cabinet");
        }

        if(!doctor.getPassword().equals(doctor.getPasswordConfirmation())){
            errors.rejectValue("passwordConfirmation", "confirmation.incorrect");
        }

        if(doctor.getPassword().length()<4){
            errors.rejectValue("password", "password.short");
        }

        if(doctor.getPasswordConfirmation().length()<4){
            errors.rejectValue("passwordConfirmation", "password.short");
        }
    }
}