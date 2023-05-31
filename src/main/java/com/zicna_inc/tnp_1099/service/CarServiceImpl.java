package com.zicna_inc.tnp_1099.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zicna_inc.tnp_1099.entity.Car;
import com.zicna_inc.tnp_1099.entity.User;
import com.zicna_inc.tnp_1099.repository.CarRepository;
import com.zicna_inc.tnp_1099.request.CarRequest;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    UserService userService;

    @Autowired
    CarRepository carRepository;

    @Override
    public Car saveCar(CarRequest carRequest, Long user_id) {
        Car car = new Car(carRequest);
        User user = userService.getUser(user_id);
        car.setUser(user);
        return carRepository.save(car);
    }

}
