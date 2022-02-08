package com.budailad.services.Impl;

import com.budailad.entity.User;
import com.budailad.mapper.UserMapper;
import com.budailad.services.UserServices;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

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