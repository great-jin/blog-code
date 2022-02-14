package com.budailad.services;

import com.budailad.entity.User;

import java.util.List;

public interface UserServices {

    List<User> list();

    User get(String ID);

    int update(User user);
}
