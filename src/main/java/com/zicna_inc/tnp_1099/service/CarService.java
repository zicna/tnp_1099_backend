package com.zicna_inc.tnp_1099.service;

import com.zicna_inc.tnp_1099.entity.Car;
import com.zicna_inc.tnp_1099.request.CarRequest;
public interface CarService {
    public Car saveCar(CarRequest carRequest, Long user_id);
}
