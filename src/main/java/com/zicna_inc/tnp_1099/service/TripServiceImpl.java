package com.zicna_inc.tnp_1099.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zicna_inc.tnp_1099.entity.Trip;
import com.zicna_inc.tnp_1099.entity.User;
import com.zicna_inc.tnp_1099.exceptions.NoTripException;
import com.zicna_inc.tnp_1099.entity.Gender;
import com.zicna_inc.tnp_1099.entity.Rider;
import com.zicna_inc.tnp_1099.repository.TripRepository;
import com.zicna_inc.tnp_1099.repository.UserRepository;
import com.zicna_inc.tnp_1099.request.TripRequest;
import com.zicna_inc.tnp_1099.repository.RiderRepository;
// import com.zicna_inc.tnp_1099.service.RiderService;

@Service
public class TripServiceImpl implements TripService{

    @Autowired
    TripRepository tripRepo;

    @Autowired
    UserRepository userRepo;

    @Autowired
    RiderRepository riderRepo;

    @Autowired
    UserService userService;

    @Autowired
    RiderService riderService;

    @Override
    public Trip getTrip(Long id) {
        Optional<Trip> op = tripRepo.findById(id);
        if(op.isPresent()){
            return op.get();
        }else{
            throw new NoTripException(id);
        }
    }

    @Override
    public Trip saveTrip(TripRequest tripRequest, Long user_id) {
        // ! place to come back and fix 
        // ! with every new trip we are creating new rider
        Rider rider = new Rider("riderOne@example.com",Gender.MALE);
        User user = userService.getUser(user_id);

        Trip trip = new Trip(tripRequest);

        trip.setRider(riderService.saveRider(rider));
        
        trip.setUser(user);
       return  tripRepo.save(trip);
    }


}
