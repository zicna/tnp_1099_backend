package com.zicna_inc.tnp_1099.exceptions;

public class NoExpenseException extends RuntimeException {
    public NoExpenseException(Long id){
        super("No Expense under id:" + id + " in our database. Please try again.");
    }
}
