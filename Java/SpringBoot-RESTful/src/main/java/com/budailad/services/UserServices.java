package com.budailad.services;

import com.budailad.entity.User;

public interface UserServices {

    User get(String ID);

    int update(User user);
}
