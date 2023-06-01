package com.zicna_inc.tnp_1099.exceptions;

import java.util.HashMap;
import java.util.Map;

import org.springframework.validation.BindingResult;

public class WrongTripInputExc extends RuntimeException {
    private final BindingResult errors;

    public WrongTripInputExc(BindingResult result){
        this.errors = result;
    }

    public Map<String, String> getValidationMessage(){
        Map<String, String> mapErrors = new HashMap<>();
        errors.getFieldErrors().forEach(err -> {
            mapErrors.put(err.getField(), err.getDefaultMessage());
        });
        return mapErrors;
    }
}
