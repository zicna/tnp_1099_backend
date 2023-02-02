package com.zicna_inc.tnp_1099.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.zicna_inc.tnp_1099.entity.User;
@Repository
public interface UserRepository extends CrudRepository<User, Long>{
    
}
