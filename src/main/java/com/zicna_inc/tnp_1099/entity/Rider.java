package com.zicna_inc.tnp_1099.entity;

import java.util.Set;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.zicna_inc.tnp_1099.request.RiderRequest;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

// TODO  add method(controller, service, serviceImpl, repo) to alter Rider

@Entity
public class Rider {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Column
    private String email;
    @Column
    private String gender;

    @JsonIgnore
    @OneToMany(mappedBy="rider", cascade=CascadeType.ALL)
    Set<Trip> trips;


    public Rider() {
    }

    public Rider(String email, String gender) {
        this.email = email;
        this.gender = gender;
    }
    public Rider(RiderRequest source) {
        this.email = source.getEmail();
        this.gender = source.getGender();
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return this.gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }


}
