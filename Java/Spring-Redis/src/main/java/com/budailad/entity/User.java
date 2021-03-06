package com.budailad.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    /**
     *  标识数据表主键
     */
    @Id
    @GeneratedValue
    private String ID;

    private String userName;

    private String password;
}