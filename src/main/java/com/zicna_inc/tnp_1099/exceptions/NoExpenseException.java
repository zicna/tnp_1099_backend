package com.zicna_inc.tnp_1099.exceptions;

import com.zicna_inc.tnp_1099.entity.Expense;

public class NoExpenseException extends RuntimeException {
    public NoExpenseException(Long id){
        super("No Expense under id:" + id + " in our database. Please try again.");
    }

    public NoExpenseException(Long id, Expense expense){
        super("Expense from URL (" + id + ") and expense id from payload are not match. Please try again");
    }
}
