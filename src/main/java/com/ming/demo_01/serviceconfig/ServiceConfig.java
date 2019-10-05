package com.ming.demo_01.serviceconfig;

import com.ming.demo_01.service.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

/**
 * @author: xiao ming
 * @create:2019-08-2019/8/22 11:41
 */
//代表的是这是一个spring的配置文件，类似applicationContext.xml
@Configuration
public class ServiceConfig {

    //@Bean("userServiceImpl")
    public UserServiceImpl userServiceImpl(){
        UserServiceImpl userServiceimpl = new UserServiceImpl();
        return userServiceimpl;
    }
}
