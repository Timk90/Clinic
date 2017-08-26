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
        return Doctor.class.equals(aClass);
    }

    @Override
    public void validate(Object o, Errors errors) {
        Doctor doctor = (Doctor)o;

        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "firstname", "check.empty");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "lastname", "check.empty");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "check.empty");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "passwordConfirmation", "check.empty");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "speciality", "check.empty");
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "cabinet", "check.empty");

        if(doctor.getPatronymic().trim().length()==0 && doctor.getPatronymic().length()>0){
            errors.rejectValue("patronymic", "check.patronymic");
        }

        if(doctor.getFirstname().length()<2 || doctor.getFirstname().length()>20){
            errors.rejectValue("firstname", "check.name.length");
        }

        if(doctor.getLastname().length()<2 || doctor.getLastname().length()>20){
            errors.rejectValue("lastname", "check.name.length");
        }

        if(doctor.getCabinet()>999){
            errors.rejectValue("cabinet", "check.cabinet");
        }

        if(!doctor.getPassword().equals(doctor.getPasswordConfirmation())){
            errors.rejectValue("passwordConfirmation", "confirmation.incorrect");
        }

        if(doctor.getPassword().length()<4 || doctor.getPassword().length()>32){
            errors.rejectValue("password", "password.length");
        }

        if(doctor.getPasswordConfirmation().length()<4 || doctor.getPassword().length()>32){
            errors.rejectValue("passwordConfirmation", "password.length");
        }
    }
}
