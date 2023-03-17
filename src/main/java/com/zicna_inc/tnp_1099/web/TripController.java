package com.zicna_inc.tnp_1099.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zicna_inc.tnp_1099.entity.Trip;
import com.zicna_inc.tnp_1099.service.TripService;


@RestController
public class TripController {

    @Autowired
    TripService tripService;


    @GetMapping("/trip/{id}")
    public ResponseEntity<Trip> getTrip(@PathVariable Long id){
        Trip trip = tripService.getTrip(id);
        return new ResponseEntity<>(trip, HttpStatus.OK);
    }

    // ? this method might go to user controller
    @PostMapping("/user/{id}/trip")
    public ResponseEntity<Trip> addTrip(@RequestBody Trip trip, @PathVariable Long id){
        return new ResponseEntity<>(tripService.saveTrip(trip, id), HttpStatus.CREATED);
    }
    
}
