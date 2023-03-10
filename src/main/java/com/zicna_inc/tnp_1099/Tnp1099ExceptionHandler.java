package com.zicna_inc.tnp_1099;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.zicna_inc.tnp_1099.exceptions.NoUserException;
import com.zicna_inc.tnp_1099.exceptions.NoRiderException;
import com.zicna_inc.tnp_1099.exceptions.NoTripException;
import com.zicna_inc.tnp_1099.exceptions.NoExpenseException;
import com.zicna_inc.tnp_1099.exceptions.ErrorResponse;

@ControllerAdvice
public class Tnp1099ExceptionHandler {

    @ExceptionHandler(NoUserException.class)
    public ResponseEntity<Object> noUserFound(NoUserException ex){
        ErrorResponse error = new ErrorResponse(ex.getLocalizedMessage());
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(NoRiderException.class)
    public ResponseEntity<Object> noRiderFound(NoRiderException ex){
        ErrorResponse error = new ErrorResponse(ex.getLocalizedMessage());
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(NoExpenseException.class)
    public ResponseEntity<Object> noExpenseFound(NoExpenseException ex){
        ErrorResponse error = new ErrorResponse(ex.getLocalizedMessage());
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(NoTripException.class)
    public ResponseEntity<Object> noTripFound(NoTripException ex){
        ErrorResponse error = new ErrorResponse(ex.getLocalizedMessage());
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }
    
}
