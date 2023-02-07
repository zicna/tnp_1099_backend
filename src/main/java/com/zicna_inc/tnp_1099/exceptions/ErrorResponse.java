package com.zicna_inc.tnp_1099.exceptions;

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
