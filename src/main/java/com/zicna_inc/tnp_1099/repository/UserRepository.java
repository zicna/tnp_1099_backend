package com.zicna_inc.tnp_1099.repository;

import org.springframework.data.repository.CrudRepository;

import com.zicna_inc.tnp_1099.entity.User;
public interface UserRepository extends CrudRepository<User, Long>{
    
}
