package com.itheima.demo;

import com.itheima.dao.UserServiceDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserService {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserServiceDao userService = (UserServiceDao) app.getBean("userService");
        userService.save();
    }
}
