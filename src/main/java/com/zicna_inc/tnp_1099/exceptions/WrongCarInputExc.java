package com.zicna_inc.tnp_1099.exceptions;

import java.util.HashMap;
import java.util.Map;

import org.springframework.validation.BindingResult;


public class WrongCarInputExc extends RuntimeException {
    public final  BindingResult errors;
    // public WrongCarInputExc(){
    // super("Wrong Car entity input");
    // }

    public WrongCarInputExc(BindingResult errors) {
        this.errors = errors;
    }

    public  Map<String, String> getValidationMessage() {
        Map<String, String> errorsMap = new HashMap<String, String>();
        errors.getFieldErrors().forEach(err -> {
            errorsMap.put(err.getField(), err.getDefaultMessage());
        });
        return errorsMap;
    }

}
