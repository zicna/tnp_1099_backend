package com.zicna_inc.tnp_1099.service;


import com.zicna_inc.tnp_1099.entity.Rider;
import com.zicna_inc.tnp_1099.request.RiderRequest;

public interface RiderService {
    public Rider saveRider(RiderRequest riderRequest);
    public Rider getRider(Long id);
    public void deleteRider(Long id);
}
