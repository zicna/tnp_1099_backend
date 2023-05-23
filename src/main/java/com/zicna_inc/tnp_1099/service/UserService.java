package com.zicna_inc.tnp_1099.service;

import java.util.List;

import com.zicna_inc.tnp_1099.entity.User;
import com.zicna_inc.tnp_1099.request.UserRequest;

public interface UserService {
    public User saveUser(UserRequest userRequest);
    public User getUser(Long id);
    public List<User> getUsers();
    public User updateUser(Long id, User user);
    public void deleteUser(Long id);

}
