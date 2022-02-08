package com.budailad.services;

import com.budailad.entity.User;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;

@CacheConfig(cacheNames = "users")
public interface UserServices {

    @Cacheable
    User get(String ID);

    int update(User user);
}
