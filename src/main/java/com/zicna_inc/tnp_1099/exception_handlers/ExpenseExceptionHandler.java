package com.zicna_inc.tnp_1099.exception_handlers;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.zicna_inc.tnp_1099.exceptions.WrongExpenseInputExc;

@ControllerAdvice
public class ExpenseExceptionHandler {

    @ExceptionHandler(WrongExpenseInputExc.class)
    public ResponseEntity<Map<String, String>> handleWrongExpenseInput(WrongExpenseInputExc ex){
        return new ResponseEntity<>(ex.getValidationMessage(), HttpStatus.BAD_REQUEST);
    }
    
}
