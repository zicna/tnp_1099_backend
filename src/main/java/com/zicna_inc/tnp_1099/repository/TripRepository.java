package com.zicna_inc.tnp_1099.repository;
import org.springframework.data.repository.CrudRepository;

import com.zicna_inc.tnp_1099.entity.Trip;
import java.lang.Long;


public interface TripRepository extends CrudRepository<Trip, Long>{
    
}
