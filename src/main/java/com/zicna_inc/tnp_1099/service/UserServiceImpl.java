package com.zicna_inc.tnp_1099.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zicna_inc.tnp_1099.entity.User;
import com.zicna_inc.tnp_1099.repository.UserRepository;
import com.zicna_inc.tnp_1099.exceptions.NoUserException;

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
       return unwrapUser(optUser, id);
    }

    @Override
    public List<User> getUsers() {
        return (List<User>)userRepository.findAll();
    }


    @Override
    public void deleteUser(Long id) {
        Optional<User> optUser = userRepository.findById(id);
       if(optUser.isPresent())userRepository.deleteById(id);
       else throw new NoUserException(id);
    }

    @Override
    public User updateUser(Long id, User user) {
        Optional<User> optUser = userRepository.findById(id);
        User oldUser = unwrapUser(optUser, id);
        return userRepository.save(user);
    }

    private User unwrapUser(Optional<User> wrapedUser, Long id){
        if(wrapedUser.isPresent()) return wrapedUser.get();
        else throw new NoUserException(id);
    }

}
