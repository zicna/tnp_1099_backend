package com.zicna_inc.tnp_1099.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

// @Inheritance(strategy = InheritanceType.SINGLE_TABLE)
// @DiscriminatorColumn(
    //     name="PLATFORM",
    //     discriminatorType= DiscriminatorType.STRING
    // )
// TODO  add method to alter Trip
// TODO  add method to delete Trip
// TODO  implement many-to-many with new entity

    @Entity
public class Trip {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private  Long distance;
    @Column
    @Enumerated(value = EnumType.STRING)
    private  Platform platform;

    @ManyToOne(optional=false)
    @JoinColumn(name="user_id")
    private User user;

    @ManyToOne(optional=false)
    @JoinColumn(name="rider_id")
    private Rider rider;


    public Trip(Long id, Long distance, Platform platform, User user, Rider rider) {
        this.id = id;
        this.distance = distance;
        this.platform = platform;
        this.user = user;
        this.rider = rider;
    }

    public Trip(){};
    

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Rider getRider() {
        return this.rider;
    }

    public void setRider(Rider rider) {
        this.rider = rider;
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
