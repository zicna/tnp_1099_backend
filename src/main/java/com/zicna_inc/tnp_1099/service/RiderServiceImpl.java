package com.zicna_inc.tnp_1099.service;
import  com.zicna_inc.tnp_1099.exceptions.NoRiderException;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zicna_inc.tnp_1099.entity.Rider;
import com.zicna_inc.tnp_1099.repository.RiderRepository;
import com.zicna_inc.tnp_1099.request.RiderRequest;
@Service
public class RiderServiceImpl implements RiderService{

    @Autowired
    RiderRepository riderRepo;

    public Rider saveRider(RiderRequest riderRequest){
        Rider rider = new Rider(riderRequest);
        return riderRepo.save(rider);
    }

    @Override
    public Rider getRider(Long id) {
        Optional<Rider> wrapedRider = riderRepo.findById(id);
        return unwrapedRider(wrapedRider, id);
    }

    public void deleteRider(Long id){
        Optional<Rider> wrapedRider = riderRepo.findById(id);
        if(wrapedRider.isPresent()) riderRepo.deleteById(id);
        else throw new NoRiderException(id);
    }

    private Rider unwrapedRider(Optional<Rider> optional, Long id){
        if(optional.isPresent()) return optional.get();
        else throw new NoRiderException(id);
    }
}
