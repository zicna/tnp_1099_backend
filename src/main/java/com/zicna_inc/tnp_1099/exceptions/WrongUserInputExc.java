package com.zicna_inc.tnp_1099.exceptions;

import java.util.*;

import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;

public class WrongUserInputExc extends RuntimeException {

    private List<ObjectError> errors;

    public WrongUserInputExc() {
        super("Wrong User Input");
    }
    public WrongUserInputExc(List<ObjectError> errors) {
       this.errors = errors;
    }

    public Map<String, String> getErrors() {
        Map<String, String> errorsMap = new HashMap<>();
        errors.forEach(err-> {
            errorsMap.put(err.getObjectName(), err.getDefaultMessage());
        });

        return errorsMap;
    }
}
