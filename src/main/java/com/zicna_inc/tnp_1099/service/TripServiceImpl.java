package com.zicna_inc.tnp_1099.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zicna_inc.tnp_1099.entity.Trip;
import com.zicna_inc.tnp_1099.repository.TripRepository;

@Service
public class TripServiceImpl implements TripService{

    @Autowired
    TripRepository tripRepo;

    @Override
    public Trip getTrip(Long id) {
        Optional<Trip> op = tripRepo.findById(id);
        if(op.isPresent()){
            return op.get();
        }else{
            throw new RuntimeException();
        }
    }

    @Override
    public Trip saveTrip(Trip trip) {
       return  tripRepo.save(trip);
    }


}
