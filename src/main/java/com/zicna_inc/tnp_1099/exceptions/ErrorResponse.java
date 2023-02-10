package com.zicna_inc.tnp_1099.exceptions;

// TODO: add timestamp private field
// TODO: format timestamp field to: MM-dd-YYYY hh:mm

public class ErrorResponse {
    private String message;


    public ErrorResponse(String message) {
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    
}
