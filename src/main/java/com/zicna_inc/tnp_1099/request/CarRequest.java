package com.zicna_inc.tnp_1099.request;

import com.zicna_inc.tnp_1099.validation.CustomTypeValidation;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

// TODO: Add custom validation for field "type"


public class CarRequest {
    @NotBlank(message = "make can not be blank")
    private String make;
    @NotBlank(message = "model can not be blank")
    private String model;
    @Min(value = 2000, message = "car must exist and can not be older than 2000")
    @NotNull(message = "car must exist and can not be older than 2000")
    private Integer year;
    @NotBlank(message = "vin can not be blank")
    private String vin;
    @NotBlank(message = "color can not be blank")
    private String color;
    @NotBlank(message = "car must have  tnp type")
    @CustomTypeValidation(acceptedTypes={"X", "XL", "COMFORT", "EL", "LYMO"}, message = "Car Type must be one from the list: X, XL, COMFORT, EL, LYMO")
    private String type;

    public CarRequest(String make, String model, Integer year, String vin, String color, String type) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.vin = vin;
        this.color = color;
        this.type = type;
    }

    public CarRequest() {
    }

    public String getMake() {
        return this.make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYear() {
        return this.year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getVin() {
        return this.vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
