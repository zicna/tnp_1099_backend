package com.zicna_inc.tnp_1099.service;

import com.zicna_inc.tnp_1099.entity.Expense;

import java.util.*;

public interface ExpenseService {
    public Expense saveExpense(Expense expense, Long user_id);
    public List<Expense> getAllUserExpenses(Long user_id);
    public Expense getExpense(Long user_id, Long id);
    public Expense updateExpense(Long user_id, Long id, Expense expense);
    
}
