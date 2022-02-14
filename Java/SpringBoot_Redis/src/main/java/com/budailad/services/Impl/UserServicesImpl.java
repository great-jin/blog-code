package com.budailad.services.Impl;

import com.budailad.entity.User;
import com.budailad.mapper.UserMapper;
import com.budailad.services.UserServices;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.Caching;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
@CacheConfig(cacheNames = "users")
public class UserServicesImpl implements UserServices {

    @Autowired
    private UserMapper userMapper;

    @Override
    @Cacheable(key = "'list'")
    public List<User> list() {
        return userMapper.list();
    }

    @Override
    @Cacheable(key = "#ID")
    public User get(String ID) {
        return userMapper.get(ID);
    }

    @Override
    @Cacheable(key = "#user.ID")
    @Caching(evict = {
            @CacheEvict(key = "'list'"),
            @CacheEvict(key = "#ID")
    })
    public int update(User user) {
        return userMapper.update(user);
    }

}