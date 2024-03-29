package com.zicna_inc.tnp_1099.entity;

import com.zicna_inc.tnp_1099.request.TripRequest;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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

// TODO: Posible new fields: 1.AR(account Receivable), 2. AP(account payable)

@Entity
public class Trip {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Double distance;
    @Column
    private String platform;

    @ManyToOne(optional = false)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(optional = false)
    @JoinColumn(name = "rider_id")
    private Rider rider;

    public Trip(Double distance, String platform, User user, Rider rider) {
        this.distance = distance;
        this.platform = platform;
        this.user = user;
        this.rider = rider;
    }

    public Trip() {
    };

    public Trip(TripRequest source) {
        this.distance = source.getDistance();
        this.platform = source.getPlatform();
    }

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

    public Double getDistance() {
        return this.distance;
    }

    public String getPlatform() {
        return this.platform;
    }

}
