package com.zicna_inc.tnp_1099.request;

import java.util.Date;

import com.zicna_inc.tnp_1099.validation.CustomTypeValidation;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

// TODO: Add custom validation for field "type"
// TODO: add custom exception for wrong expense input

public class ExpenseRequest {
    @CustomTypeValidation(acceptedTypes = { "GAS", "WASH", "TOLL", "REPAIR", "MISCELLANEOUS",
            "TICKET" }, message = "Expense type must be one of: GAS, WASH, TOLL, REPAIR, MISCELLANEOUS, TICKET")
    private String type;
    @Min(value = 0, message = "amount must exist and can not be less then 0")
    @NotNull(message = "amount must exist and can not be less then 0")
    private Double amount;
    private Date date;
    @NotBlank(message = "description can not be blank")
    private String description;

    public ExpenseRequest() {
    }

    public ExpenseRequest(String type, Double amount, Date date, String description) {
        this.type = type;
        this.amount = amount;
        this.date = date;
        this.description = description;
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
