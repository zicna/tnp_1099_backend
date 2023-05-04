package com.zicna_inc.tnp_1099.entity;

import java.util.Objects;

public class Car {
    private String make;
    private String model;
    private Integer year;
    private String vin;
    private String color;
    private UberType type;

    public Car() {
    }

    public Car(String make, String model, Integer year, String vin, String color, UberType type) {
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

    public Car make(String make) {
        setMake(make);
        return this;
    }

    public Car model(String model) {
        setModel(model);
        return this;
    }

    public Car year(Integer year) {
        setYear(year);
        return this;
    }

    public Car vin(String vin) {
        setVin(vin);
        return this;
    }

    public Car color(String color) {
        setColor(color);
        return this;
    }

    public Car type(UberType type) {
        setType(type);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Car)) {
            return false;
        }
        Car car = (Car) o;
        return Objects.equals(make, car.make) && Objects.equals(model, car.model) && Objects.equals(year, car.year)
                && Objects.equals(vin, car.vin) && Objects.equals(color, car.color) && Objects.equals(type, car.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(make, model, year, vin, color, type);
    }

    @Override
    public String toString() {
        return "{" +
                " make='" + getMake() + "'" +
                ", model='" + getModel() + "'" +
                ", year='" + getYear() + "'" +
                ", vin='" + getVin() + "'" +
                ", color='" + getColor() + "'" +
                ", type='" + getType() + "'" +
                "}";
    }

}
