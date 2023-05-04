package com.zicna_inc.tnp_1099.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import com.zicna_inc.tnp_1099.entity.Car;
import com.zicna_inc.tnp_1099.service.CarService;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class CarController {

    @Autowired
    CarService carService;

    @PostMapping(value="/user/{user_id}/car")
    public ResponseEntity<Car> saveCar(@RequestBody Car car, @PathVariable Long user_id) {
        return new ResponseEntity<>(carService.saveCar(car, user_id), HttpStatus.OK);
    }

}
