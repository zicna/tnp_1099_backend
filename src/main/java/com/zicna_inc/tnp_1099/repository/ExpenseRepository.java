package com.zicna_inc.tnp_1099.repository;

import java.util.*;

import com.zicna_inc.tnp_1099.entity.Expense;

import org.springframework.data.repository.CrudRepository;

public interface ExpenseRepository extends CrudRepository<Expense, Long>{
    List<Expense> findByUserId(Long user_id);
}
