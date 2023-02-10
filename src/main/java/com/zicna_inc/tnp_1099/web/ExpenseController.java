package com.zicna_inc.tnp_1099.web;

import com.zicna_inc.tnp_1099.entity.Expense;
import com.zicna_inc.tnp_1099.service.ExpenseService;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;;

@RestController
public class ExpenseController {

    @Autowired
    ExpenseService expenseService;

    @PostMapping("/user/{user_id}/expense")
    public ResponseEntity<Expense> saveExpense(@RequestBody Expense expense, @PathVariable Long user_id){
        return new ResponseEntity<>(expenseService.saveExpense(expense, user_id), HttpStatus.CREATED);
    }
    
}
 