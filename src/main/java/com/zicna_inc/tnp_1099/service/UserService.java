package com.zicna_inc.tnp_1099.service;

import java.util.List;

import com.zicna_inc.tnp_1099.entity.User;

public interface UserService {
    public User saveUser(User user);
    public User getUser(Long id);
    public List<User> getUsers();
    // public User updateUser(String id, User user);
    public void deleteUser(Long id);

}
