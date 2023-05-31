package com.zicna_inc.tnp_1099.request;

import java.util.Date;

import com.zicna_inc.tnp_1099.enums.ExpenseType;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class ExpenseRequest {
    private ExpenseType type;
    @Min(value = 0, message = "amount must exist and can not be less then 0")
    @NotNull(message = "amount must exist and can not be less then 0")
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
