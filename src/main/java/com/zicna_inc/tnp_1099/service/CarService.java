package com.zicna_inc.tnp_1099.service;

import com.zicna_inc.tnp_1099.entity.Car;
public interface CarService {
    public Car saveCar(Car car, Long user_id);
}
