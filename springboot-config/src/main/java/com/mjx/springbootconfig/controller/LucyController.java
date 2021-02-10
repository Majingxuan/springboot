package com.mjx.springbootconfig.controller;

import com.mjx.springbootconfig.bean.ConfigBean;
import com.mjx.springbootconfig.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 将配置文件的属性赋给实体类
 */

@RestController
@EnableConfigurationProperties({ConfigBean.class,User.class})
public class LucyController {
    @Autowired
    ConfigBean configBean;
    @Autowired
    User user;

    @RequestMapping(value = "/lucy")
    public String readMe() {
        return configBean.getGreeting()+" >>>>"+configBean.getName()+" >>>>"+ configBean.getUuid()+" >>>>"+configBean.getMax();
    }

    @RequestMapping(value = "/user")
    public String user() {
        return user.getName() + user.getAge();
    }

}
