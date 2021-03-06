package com.budailad.controller;

import com.budailad.entity.User;
import com.budailad.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @Autowired
    private UserServices userServices;

    @GetMapping("/get")
    public User getUser(String ID){
        return userServices.get(ID);
    }

    @PostMapping("/update")
    public int updateUser(@RequestBody User user){
        return userServices.update(user);
    }

}
