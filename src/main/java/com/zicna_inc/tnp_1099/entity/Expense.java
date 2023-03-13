package com.zicna_inc.tnp_1099.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Expense {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    
    @Enumerated(value=EnumType.STRING)
    private ExpenseType type;
    @Column
    private Double amount;
    @Column
    private Date date;
    @Column
    private String description;

    @ManyToOne(optional=false)
    @JoinColumn(name="user_id", referencedColumnName="id")
    private User user;

// TODO  add method to delete Expense


    public Expense() {
    }

    public Expense(Long id, ExpenseType type, Double amount, String description) {
        this.id = id;
        this.type = type;
        this.amount = amount;
        this.date = new Date();
        this.description = description;
    }

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ExpenseType getType() {
        return this.type;
    }

    public void setType(ExpenseType type) {
        this.type = type;
    }

    public Double getAmount() {
        return this.amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate() {
        this.date = new Date();
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Expense id(Long id) {
        setId(id);
        return this;
    }

    public Expense type(ExpenseType type) {
        setType(type);
        return this;
    }

    public Expense amount(Double amount) {
        setAmount(amount);
        return this;
    }

    // public Expense date(Date date) {
    //     setDate(date);
    //     return this;
    // }

}
