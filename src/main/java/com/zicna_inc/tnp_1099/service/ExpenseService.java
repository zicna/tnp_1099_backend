package com.zicna_inc.tnp_1099.service;

import com.zicna_inc.tnp_1099.entity.Expense;

public interface ExpenseService {
    public Expense saveExpense(Expense expense, Long user_id);
    
}
