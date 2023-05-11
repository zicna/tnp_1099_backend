package com.zicna_inc.tnp_1099.web;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.zicna_inc.tnp_1099.entity.User;
import com.zicna_inc.tnp_1099.exceptions.WrongUserInputExc;
import com.zicna_inc.tnp_1099.service.ExpenseService;
import com.zicna_inc.tnp_1099.service.UserService;

import jakarta.validation.Valid;

@RestController
@CrossOrigin
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    ExpenseService expenseService;

// TODO: alter WrongUserInputExc.java to get specific error message based of field that failed validation
    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/user")
    public ResponseEntity<User> saveUser(@Valid @RequestBody User user, BindingResult result) {
        if(result.hasErrors()) throw new WrongUserInputExc();
        return new ResponseEntity<>(userService.saveUser(user), HttpStatus.CREATED);
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<Object> getUser(@PathVariable Long id) {
        Map<String, Object> map = new HashMap<>();
        map.put("user", userService.getUser(id));
        map.put("expenses", expenseService.getAllUserExpenses(id));
        return new ResponseEntity<>(map, HttpStatus.OK);
    }

    @GetMapping("/users")
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> users = userService.getUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @PutMapping("/user/{id}")
    public ResponseEntity<User> updateUser(@PathVariable Long id, @RequestBody User user) {
        return new ResponseEntity<>(userService.updateUser(id, user), HttpStatus.OK);
    }

    @DeleteMapping("/user/{id}")
    public ResponseEntity<HttpStatus> deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
