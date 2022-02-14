package com.budailad.mapper;

import com.budailad.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    User get(String ID);

    int update(User user);

}
