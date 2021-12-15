package com.app.microservice_userservice.service;

import com.app.microservice_userservice.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    List<User> list = List.of(
            new User(1311L, "Pranshul Singh", "989842934"),
            new User(1312L, "Rohan Singh", "989842454"),
            new User(1313L, "Ravi Singh", "9898426544")
    );

    @Override
    public User getUser(Long id) {
        return list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
    }
}
