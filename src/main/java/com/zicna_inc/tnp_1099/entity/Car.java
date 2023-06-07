package com.zicna_inc.tnp_1099.entity;

import com.zicna_inc.tnp_1099.request.CarRequest;

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
// @Table(name = "cars")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String make;

    @Column
    private String model;

    @Column(name = "year")
    private Integer year;

    @Column
    private String vin;

    @Column
    private String color;

    @Column(name = "tnp_type")
    private  String type;

    @ManyToOne(optional = false)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

    public Car() {
    }

    public Car(String make, String model, Integer year, String vin, String color, String type) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.vin = vin;
        this.color = color;
        this.type = type;
    }

    public Car(CarRequest source) {
        this.make = source.getMake();
        this.model = source.getModel();
        this.year = source.getYear();
        this.vin = source.getVin();
        this.color = source.getColor();
        this.type = source.getType();
    }

    public Long getId() {
        return id;
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

    public Car type(String type) {
        setType(type);
        return this;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }
}
