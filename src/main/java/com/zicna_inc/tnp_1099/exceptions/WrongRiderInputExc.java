package com.zicna_inc.tnp_1099.exceptions;

import java.util.HashMap;
import java.util.Map;

import org.springframework.validation.BindingResult;

public class WrongRiderInputExc extends RuntimeException {
    private final BindingResult errors;

    public WrongRiderInputExc(BindingResult result) {
        this.errors = result;
    }

    public Map<String, String> getValidationMessage() {
        Map<String, String> response = new HashMap<>();
        errors.getFieldErrors().forEach(err -> {
            response.put(err.getField(), err.getDefaultMessage());
        });
        return response;
    }

}
