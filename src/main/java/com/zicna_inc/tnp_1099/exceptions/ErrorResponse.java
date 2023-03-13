package com.zicna_inc.tnp_1099.exceptions;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;


public class ErrorResponse {
    private String message;
    @JsonFormat(pattern = "MM/dd/YYYY; HH:mm:ss")
    private Date timestamp;


    public ErrorResponse(String message) {
        this.message = message;
        this.timestamp = new Date();
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    
}
