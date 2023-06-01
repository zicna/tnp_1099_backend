package com.zicna_inc.tnp_1099.exception_handlers;

import java.util.HashMap;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.zicna_inc.tnp_1099.exceptions.WrongRiderInputExc;

@ControllerAdvice
public class RiderExceptionHandler {

    @ExceptionHandler(WrongRiderInputExc.class)
    public ResponseEntity<HashMap<String, String>> handleWrongRiderInput(WrongRiderInputExc ex) {
        return new ResponseEntity<>(ex.getValidationMessage(), HttpStatus.BAD_REQUEST);
    }

}
