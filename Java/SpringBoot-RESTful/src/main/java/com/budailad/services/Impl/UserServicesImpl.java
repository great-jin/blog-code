package com.budailad.services.Impl;

import com.budailad.entity.User;
import com.budailad.mapper.UserMapper;
import com.budailad.services.UserServices;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
@CacheConfig(cacheNames = "users")
public class UserServicesImpl implements UserServices {

    @Autowired
    private UserMapper userMapper;

    @Override
    @Cacheable(key = "#ID")
    public User get(String ID) {
        return userMapper.get(ID);
    }

    @Override
    @Cacheable(key = "#user.ID")
    public int update(User user) {
        return userMapper.update(user);
    }

}