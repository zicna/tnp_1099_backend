package com.zicna_inc.tnp_1099.entity;

import java.util.Set;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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
    @Enumerated(value= EnumType.STRING)
    private Gender gender;

    @JsonIgnore
    @OneToMany(mappedBy="rider", cascade=CascadeType.ALL)
    Set<Trip> trips;


    public Rider() {
    }

    public Rider(String email, Gender gender) {
        this.email = email;
        this.gender = gender;
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

    public Gender getGender() {
        return this.gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }


}
