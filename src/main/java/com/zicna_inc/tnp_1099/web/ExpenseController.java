package com.zicna_inc.tnp_1099.web;

import com.zicna_inc.tnp_1099.entity.Expense;
import com.zicna_inc.tnp_1099.exceptions.WrongExpenseInputExc;
import com.zicna_inc.tnp_1099.request.ExpenseRequest;
import com.zicna_inc.tnp_1099.service.ExpenseService;

import jakarta.validation.Valid;

import java.util.*;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class ExpenseController {

    @Autowired
    ExpenseService expenseService;

    @PostMapping("/user/{user_id}/expense")
    public ResponseEntity<Expense> saveExpense(@RequestBody @Valid ExpenseRequest expenseRequest, BindingResult result, @PathVariable Long user_id){
        if(result.hasErrors()) throw new WrongExpenseInputExc(result);
        return new ResponseEntity<>(expenseService.saveExpense(expenseRequest, user_id), HttpStatus.CREATED);
    }

    @GetMapping("user/{user_id}/expense/all")
    public ResponseEntity<List<Expense>> getAllUserExpenses(@PathVariable Long user_id) {
        return new ResponseEntity<>(expenseService.getAllUserExpenses(user_id), HttpStatus.OK);
    }

    @GetMapping("user/{user_id}/expense/{id}")
    public ResponseEntity<Expense> getExpense(@PathVariable Long user_id, @PathVariable Long id) {
        return new ResponseEntity<>(expenseService.getExpense(user_id, id), HttpStatus.OK);
    }

    @PutMapping("user/{user_id}/expense/{id}")
    public ResponseEntity<Object> updateExpense(@PathVariable Long user_id, @PathVariable Long id,
            @RequestBody Expense expense) {
        return new ResponseEntity<>(expenseService.updateExpense(user_id, id, expense), HttpStatus.OK);
    }

    @DeleteMapping("user/{user_id}/expense/{id}")
    public ResponseEntity<HttpStatus> deleteExpense(@PathVariable Long user_id, @PathVariable Long id) {
        expenseService.deleteExpense(user_id, id);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
}
