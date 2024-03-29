package com.zicna_inc.tnp_1099.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RestController;

import com.zicna_inc.tnp_1099.entity.Car;
import com.zicna_inc.tnp_1099.exceptions.WrongCarInputExc;
import com.zicna_inc.tnp_1099.request.CarRequest;
import com.zicna_inc.tnp_1099.service.CarService;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class CarController {

    @Autowired
    CarService carService;

    @PostMapping(value = "/user/{user_id}/car")
    public ResponseEntity<Car> saveCar(@Valid @RequestBody CarRequest carRequest, BindingResult result,
            @PathVariable Long user_id) {

        if (result.hasErrors())
            throw new WrongCarInputExc((result));
        if (carRequest.getType().equals("LYMO") && !carRequest.getColor().equals("black")) {
            result.rejectValue("color", "crossFieldValidation", "If car type is LYMO color must be black");
            throw new WrongCarInputExc(result);
        }

        return new ResponseEntity<>(carService.saveCar(carRequest, user_id), HttpStatus.OK);
    }

}
