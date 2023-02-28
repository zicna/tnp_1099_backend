package com.zicna_inc.tnp_1099.exceptions;

public class NoTripException extends RuntimeException {
    public NoTripException(Long id){
        super("No trip under id: " + id + ". Please try again!");
    }
}
