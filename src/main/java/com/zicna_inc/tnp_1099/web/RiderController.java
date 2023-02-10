package com.zicna_inc.tnp_1099.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zicna_inc.tnp_1099.entity.Rider;
import com.zicna_inc.tnp_1099.service.RiderService;


// TODO: add custom exception for Rider not found
// TODO: add custom method to handle NoRiderFound exception in AppExceptionHandler


@RestController
public class RiderController {
    
    @Autowired
    RiderService riderService;

    @PostMapping("/rider")
    public ResponseEntity<Rider> addRider(@RequestBody Rider rider){
        return new ResponseEntity<>(riderService.saveRider(rider), HttpStatus.CREATED);
    }
}
