package com.zicna_inc.tnp_1099.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
// import jakarta.persistence.DiscriminatorType;
// import jakarta.persistence.DiscriminatorColumn;
// import jakarta.persistence.Inheritance;
// import jakarta.persistence.InheritanceType;

// @Inheritance(strategy = InheritanceType.SINGLE_TABLE)
// @DiscriminatorColumn(
    //     name="PLATFORM",
    //     discriminatorType= DiscriminatorType.STRING
    // )
// TODO  add method to alter Trip
// TODO  add method to delete Trip

    @Entity
public class Trip {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private final Long id;

    @Column
    private  final Long distance;
    @Column
    @Enumerated(value = EnumType.STRING)
    private  final Platform platform;

    public Trip(Long id, Long distance, Platform platform) {
        this.id = id;
        this.distance = distance;
        this.platform = platform;
    }

    public Long getId() {
        return this.id;
    }

    public Long getDistance() {
        return this.distance;
    }

    public Platform getPlatform(){
        return this.platform;
    }

}
