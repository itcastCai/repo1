package com.itheima.dao.impl;

import com.itheima.dao.UserDao;
import com.itheima.domain.User;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class UserDaoImpl implements UserDao {
    private String username;
    private int age;
    private List<String> list ;
    private Map<String,User> map;
    private Properties properties;

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMap(Map<String, User> map) {
        this.map = map;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public UserDaoImpl() {
        System.out.println("UserDaoImpl被创建了");
    }
    public void init(){
        System.out.println("方法初始化");
    }

    public void destroy(){
        System.out.println("方法销毁");
    }
    public void save() {
        System.out.println(username+":"+age);
        System.out.println(list);
        System.out.println(map);
        System.out.println(properties);

        System.out.println("save,running");
    }
}
