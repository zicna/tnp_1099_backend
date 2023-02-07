package com.zicna_inc.tnp_1099.exceptions;

public class NoUserException extends RuntimeException{
   public NoUserException(Long id){
    super("No user under id: " + id + ". Please try again!");
   }
}
