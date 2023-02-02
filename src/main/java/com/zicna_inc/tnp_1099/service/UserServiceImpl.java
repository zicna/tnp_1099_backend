package com.zicna_inc.tnp_1099.service;

import java.util.List;
import java.util.Optional;


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

    @Override
    public User getUser(Long id) {
        Optional<User> optUser = userRepository.findById(id);
        if(optUser.isPresent()){
            return optUser.get();
        }else{
            throw new RuntimeException();
        }
    }

    @Override
    public List<User> getUsers() {
        return (List)userRepository.findAll();
    }


    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    // private User findUserById(Long id){
    //     Optional<User> optionalUser = userRepository.findById(id);
    //     if(optionalUser.isPresent()){
    //         return optionalUser.get();
    //     }else{
    //         throw new RuntimeException();
    //     }
    // }


}
