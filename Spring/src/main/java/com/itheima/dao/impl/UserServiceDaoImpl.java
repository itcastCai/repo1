package com.itheima.dao.impl;

import com.itheima.dao.UserDao;
import com.itheima.dao.UserServiceDao;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceDaoImpl implements UserServiceDao {

    private UserDao userDao;

    /*public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }*/

    public UserServiceDaoImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    public void save() {
        userDao.save();

    }
}
