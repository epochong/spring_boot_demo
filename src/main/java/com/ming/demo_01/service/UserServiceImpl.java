package com.ming.demo_01.service;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author: xiao ming
 * @create:2019-08-2019/8/22 11:32
 */

@Component
public class UserServiceImpl implements UserService {
    @Override
    public void addUser() {
        System.out.println("--------UserServiceImpl.addUser()------------");
    }
}
