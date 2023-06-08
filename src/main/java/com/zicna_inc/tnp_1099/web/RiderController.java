package com.zicna_inc.tnp_1099.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.zicna_inc.tnp_1099.entity.Rider;
import com.zicna_inc.tnp_1099.exceptions.WrongRiderInputExc;
import com.zicna_inc.tnp_1099.request.RiderRequest;
import com.zicna_inc.tnp_1099.service.RiderService;

import jakarta.validation.Valid;


@RestController
public class RiderController {

    @Autowired
    RiderService riderService;

    @PostMapping("/rider")
    public ResponseEntity<Rider> addRider(@RequestBody @Valid RiderRequest riderRequest, BindingResult result) {
        if (result.hasErrors())
            throw new WrongRiderInputExc(result);
        return new ResponseEntity<>(riderService.saveRider(riderRequest), HttpStatus.CREATED);
    }

    @GetMapping("/rider/{id}")
    public ResponseEntity<Rider> getRider(@PathVariable Long id) {
        return new ResponseEntity<>(riderService.getRider(id), HttpStatus.OK);
    }

    @DeleteMapping("/rider/{id}")
    public ResponseEntity<HttpStatus> deleteRider(@PathVariable Long id) {
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
