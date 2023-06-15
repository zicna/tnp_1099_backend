package com.zicna_inc.tnp_1099;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.sql.Date;
import java.util.List;
import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import com.zicna_inc.tnp_1099.entity.User;
import com.zicna_inc.tnp_1099.repository.UserRepository;
import com.zicna_inc.tnp_1099.service.UserServiceImpl;


@RunWith(MockitoJUnitRunner.class)
public class TestUserService {
    @Mock
    UserRepository userRepo;

    @InjectMocks
    UserServiceImpl userServiceImpl;

    @Test
    public void testGetUsers() {

        when(userServiceImpl.getUsers()).thenReturn(
                (Arrays.asList(new User("zivkovic@gmail.com", new Date(1987, 9, 25), "MALE"),
                        new User("zivkovic@gmail.com", new Date(1987, 9, 25), "MALE"))));
        List<User> result = userServiceImpl.getUsers();

        assertEquals("zivkovic@gmail.com", result.get(0).getEmail());
    }

}
