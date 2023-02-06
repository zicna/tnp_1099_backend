package com.zicna_inc.tnp_1099.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zicna_inc.tnp_1099.entity.Rider;
import com.zicna_inc.tnp_1099.repository.RiderRepository;
@Service
public class RiderServiceImpl implements RiderService{

    @Autowired
    RiderRepository riderRepo;

    public Rider saveRider(Rider rider){
        return riderRepo.save(rider);
    }
    
}
