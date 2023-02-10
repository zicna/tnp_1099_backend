package com.zicna_inc.tnp_1099.exceptions;

public class NoRiderException extends RuntimeException{
    public NoRiderException(Long id){
        super("No user under id: " + id + ". Please try again!");
    }
}
