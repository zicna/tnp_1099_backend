package com.zicna_inc.tnp_1099.request;

import com.zicna_inc.tnp_1099.enums.UberType;

import jakarta.validation.constraints.NotBlank;

public class CarRequest {
    @NotBlank(message = "make can not be blank")
    private String make;
    @NotBlank(message = "model can not be blank")
    private String model;
    @NotBlank(message = "year can not be blank")
    private Integer year;
    @NotBlank(message = "vin can not be blank")
    private String vin;
    @NotBlank(message = "color can not be blank")
    private String color;
    private UberType type;

    public CarRequest(String make, String model, Integer year, String vin, String color, UberType type) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.vin = vin;
        this.color = color;
        this.type = type;
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

    public UberType getType() {
        return this.type;
    }

    public void setType(UberType type) {
        this.type = type;
    }

}
