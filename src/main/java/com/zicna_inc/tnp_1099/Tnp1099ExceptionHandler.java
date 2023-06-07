package com.zicna_inc.tnp_1099;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.zicna_inc.tnp_1099.exceptions.NoUserException;
import com.zicna_inc.tnp_1099.exceptions.WrongUserInputExc;
import com.zicna_inc.tnp_1099.exceptions.NoRiderException;
import com.zicna_inc.tnp_1099.exceptions.NoTripException;
import com.zicna_inc.tnp_1099.exceptions.NoExpenseException;
import com.zicna_inc.tnp_1099.exceptions.ErrorResponse;

// TODO: Move exception handler methods in specific controller adice classes  

@ControllerAdvice
public class Tnp1099ExceptionHandler {

    @ExceptionHandler(NoUserException.class)
    public ResponseEntity<Object> noUserFound(NoUserException ex) {
        ErrorResponse error = new ErrorResponse(ex.getLocalizedMessage());
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }

    // ! Old method for handling wrong user Input
    @ExceptionHandler(WrongUserInputExc.class)
    public ResponseEntity<Map<String, String>> wrongInput(WrongUserInputExc ex) {
    // ErrorResponse error = new ErrorResponse(ex.getLocalizedMessage());
    return new ResponseEntity<>(ex.getErrors(), HttpStatus.BAD_REQUEST);
    }

    // ! New method for handling wrong user Input by handling MethodArgumentNotValidException exception
    // @ExceptionHandler(MethodArgumentNotValidException.class)
    // public ResponseEntity<Map<String, String>> handleWrongUserInput(MethodArgumentNotValidException ex) {
    //     Map<String, String> errorsMap = new HashMap<>();
    //     ex.getBindingResult().getFieldErrors().forEach(err -> {
    //         errorsMap.put(err.getField(), err.getDefaultMessage());
    //     });
    //     return new ResponseEntity<>(errorsMap, HttpStatus.BAD_REQUEST);
    // }

    @ExceptionHandler(NoRiderException.class)
    public ResponseEntity<Object> noRiderFound(NoRiderException ex) {
        ErrorResponse error = new ErrorResponse(ex.getLocalizedMessage());
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(NoExpenseException.class)
    public ResponseEntity<Object> noExpenseFound(NoExpenseException ex) {
        ErrorResponse error = new ErrorResponse(ex.getLocalizedMessage());
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(NoTripException.class)
    public ResponseEntity<Object> noTripFound(NoTripException ex) {
        ErrorResponse error = new ErrorResponse(ex.getLocalizedMessage());
        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    }

    // @ExceptionHandler(WrongCarInputExc.class)
    // public ResponseEntity<Object> wrongCarInput(WrongCarInputExc ex) {
    //     ErrorResponse error = new ErrorResponse(ex.getLocalizedMessage());
    //     return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
    // }

}
