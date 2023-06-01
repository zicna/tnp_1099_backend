package com.zicna_inc.tnp_1099.exception_handlers;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.zicna_inc.tnp_1099.exceptions.WrongTripInputExc;

@ControllerAdvice
public class TripExceptionHandler {

    @ExceptionHandler(WrongTripInputExc.class)
    public ResponseEntity<Map<String, String>> wrongTripInputExcHandler(WrongTripInputExc ex) {
        return new ResponseEntity<>(ex.getValidationMessage(), HttpStatus.BAD_REQUEST);
    }

}
