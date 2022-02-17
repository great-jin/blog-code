package com.budailad.controller;

import com.budailad.entity.User;
import com.budailad.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserServices userServices;

    @GetMapping("/list")
    public List<User> list(String ID){
        return userServices.list();
    }

    @GetMapping("/get")
    public User get(String ID){
        return userServices.get(ID);
    }

    @PostMapping("/update")
    public int updateUser(@RequestBody User user){
        return userServices.update(user);
    }

}
