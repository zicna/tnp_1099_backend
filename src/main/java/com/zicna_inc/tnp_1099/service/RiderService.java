package com.zicna_inc.tnp_1099.service;
import java.util.Optional;



import com.zicna_inc.tnp_1099.entity.Rider;

public interface RiderService {
    public Rider saveRider(Rider rider);
    public Rider getRider(Long id);
}
