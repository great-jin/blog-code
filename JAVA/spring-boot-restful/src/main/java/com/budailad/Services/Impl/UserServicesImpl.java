package com.budailad.Services.Impl;

import com.budailad.Entity.User;
import com.budailad.Mapper.UserMapper;
import com.budailad.Services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServicesImpl implements UserServices {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User get(String ID) {
        return userMapper.get(ID);
    }

    @Override
    public int update(User user) {
        return userMapper.update(user);
    }

}