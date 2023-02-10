package com.zicna_inc.tnp_1099.service;

import com.zicna_inc.tnp_1099.entity.Expense;

import java.util.*;

public interface ExpenseService {
    public Expense saveExpense(Expense expense, Long user_id);
    public List<Expense> getAllUserExpenses(Long user_id);
    
}
