package com.zicna_inc.tnp_1099.service;


import com.zicna_inc.tnp_1099.entity.Rider;

public interface RiderService {
    public Rider saveRider(Rider rider);
    public Rider getRider(Long id);
    public void deleteRider(Long id);
}
