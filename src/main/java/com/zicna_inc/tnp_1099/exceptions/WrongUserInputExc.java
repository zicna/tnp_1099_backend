package com.zicna_inc.tnp_1099.exceptions;

import java.util.*;

import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;

public class WrongUserInputExc extends RuntimeException {

    private BindingResult errors;

    public WrongUserInputExc() {
        super("Wrong User Input");
    }
    public WrongUserInputExc(BindingResult errors) {
       this.errors = errors;
    }

    public Map<String, String> getErrors() {
        Map<String, String> errorsMap = new HashMap<>();
        errors.getFieldErrors().forEach(err-> {
            errorsMap.put(err.getObjectName(), err.getDefaultMessage());
        });

        return errorsMap;
    }
}
