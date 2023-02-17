package com.zicna_inc.tnp_1099.service;
import com.zicna_inc.tnp_1099.entity.Trip;

public interface TripService {
    public Trip getTrip(Long id);
    // * option 1. for saveTrip service
    //*  public Trip saveTrip(Long id, Long rider_id, Trip trip);
    // * option 2. for saveTrip service
    public Trip saveTrip(Trip trip, Long user_id);
}
