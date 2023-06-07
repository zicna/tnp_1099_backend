package com.zicna_inc.tnp_1099.entity;

import java.util.Date;

import com.zicna_inc.tnp_1099.request.ExpenseRequest;

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
// TODO: Add new field, 'milage'
public class Expense {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(value = EnumType.STRING)
    private String type;
    @Column
    private Double amount;
    @Column
    private Date date;
    @Column
    private String description;

    @ManyToOne(optional = false)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    public Expense() {
    }

    public Expense(Long id, String type, Double amount, String description) {
        this.id = id;
        this.type = type;
        this.amount = amount;
        this.date = new Date();
        this.description = description;
    }

    public Expense(ExpenseRequest source) {
        this.type = source.getType();
        this.amount = source.getAmount();
        this.date = new Date();
        this.description = source.getDescription();
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

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
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

    public Expense type(String type) {
        setType(type);
        return this;
    }

    public Expense amount(Double amount) {
        setAmount(amount);
        return this;
    }

    // public Expense date(Date date) {
    // setDate(date);
    // return this;
    // }

}
