package com.zicna_inc.tnp_1099.service;
import com.zicna_inc.tnp_1099.entity.Trip;

public interface TripService {
    public Trip getTrip(Long id);
    public Trip saveTrip(Trip trip);
}
