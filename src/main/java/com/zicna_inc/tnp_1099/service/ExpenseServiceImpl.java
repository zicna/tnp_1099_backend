package com.zicna_inc.tnp_1099.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zicna_inc.tnp_1099.entity.Expense;
import com.zicna_inc.tnp_1099.entity.User;
import com.zicna_inc.tnp_1099.repository.ExpenseRepository;
import com.zicna_inc.tnp_1099.repository.UserRepository;
import com.zicna_inc.tnp_1099.exceptions.NoExpenseException;;

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

    public Expense getExpense(Long user_id, Long id){
        // ! guard clause to trigger NoUserException in case user_id is non existing
        userService.getUser(user_id);
        // ! Do not thing we need to instantiated new user 
        // User user = userService.getUser(user_id);
        Optional<Expense> wrappedExpense = expenseRepo.findById(id);
        return unwrapExpense(wrappedExpense, id);
    }

    private Expense unwrapExpense(Optional<Expense> wrappedExpense, Long id){
        if(wrappedExpense.isPresent()) return wrappedExpense.get();
        else throw new NoExpenseException(id);
    }
    
}
