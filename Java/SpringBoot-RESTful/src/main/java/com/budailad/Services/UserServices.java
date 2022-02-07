package com.budailad.Services;

import com.budailad.Entity.User;

public interface UserServices {

    User get(String ID);

    int update(User user);
}
