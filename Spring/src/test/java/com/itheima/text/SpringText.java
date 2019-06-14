package com.itheima.text;

import com.itheima.dao.UserServiceDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringText {
    public static void main(String[] args) {
        ApplicationContext app = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserServiceDao userService = (UserServiceDao) app.getBean("userService");
        userService.save();
    }
}
