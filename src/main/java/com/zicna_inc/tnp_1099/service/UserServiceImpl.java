package com.zicna_inc.tnp_1099.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zicna_inc.tnp_1099.entity.User;
import com.zicna_inc.tnp_1099.repository.UserRepository;
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }
}
