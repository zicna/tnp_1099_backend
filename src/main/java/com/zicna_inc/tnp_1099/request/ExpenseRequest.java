package com.zicna_inc.tnp_1099.request;

import java.util.Date;

import com.zicna_inc.tnp_1099.entity.ExpenseType;

import jakarta.validation.constraints.NotBlank;

public class ExpenseRequest {
    private ExpenseType type;
    @NotBlank(message = "amount can not be blank")
    private Double amount;
    private Date date;
    @NotBlank(message = "description can not be blank")
    private String description;

    public ExpenseRequest() {
    }

    public ExpenseRequest(ExpenseType type, Double amount, Date date, String description) {
        this.type = type;
        this.amount = amount;
        this.date = date;
        this.description = description;
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

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}