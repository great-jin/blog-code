package com.budailad.Mapper;

import com.budailad.Entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    User get(String ID);

    int update(User user);

}
