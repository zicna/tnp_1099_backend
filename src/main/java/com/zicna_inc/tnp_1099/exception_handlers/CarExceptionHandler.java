package com.zicna_inc.tnp_1099.exception_handlers;

import java.util.HashMap;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.zicna_inc.tnp_1099.exceptions.WrongCarInputExc;

@ControllerAdvice
public class CarExceptionHandler {

    @ExceptionHandler(WrongCarInputExc.class)
    public ResponseEntity<HashMap<String, String>> handleWrongCarInput(WrongCarInputExc ex){
        // HashMap<String, String> errorMap = ex.getValidationMessage();
        return new ResponseEntity<>(ex.getValidationMessage(), HttpStatus.BAD_REQUEST);
    }
    
}
