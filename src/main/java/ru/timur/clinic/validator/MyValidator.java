package main.java.ru.timur.clinic.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/**
 * Created by Tester on 21/08/2017.
 */
public class MyValidator implements Validator {

    @Override
    public boolean supports(Class<?> aClass) {
        return false;
    }

    @Override
    public void validate(Object o, Errors errors) {

    }
}
