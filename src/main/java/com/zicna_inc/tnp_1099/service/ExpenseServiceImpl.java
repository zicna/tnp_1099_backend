package com.zicna_inc.tnp_1099.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zicna_inc.tnp_1099.entity.Expense;
import com.zicna_inc.tnp_1099.entity.User;
import com.zicna_inc.tnp_1099.repository.ExpenseRepository;
import com.zicna_inc.tnp_1099.repository.UserRepository;

@Service
public class ExpenseServiceImpl implements ExpenseService{

    @Autowired
    ExpenseRepository expenseRepo;
    @Autowired
    UserRepository userRepo;
    @Autowired
    UserService userService;

    public Expense saveExpense(Expense expense, Long user_id){
        User user = userService.getUser(user_id);
        expense.setUser(user);
        return expenseRepo.save(expense);
    }
    
    public List<Expense> getAllUserExpenses(Long user_id){
        userService.getUser(user_id);
        return new ArrayList<Expense>(expenseRepo.findByUserId(user_id));
    }
    
}
