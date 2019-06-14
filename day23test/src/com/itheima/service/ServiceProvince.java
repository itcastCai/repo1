package com.itheima.service;

import com.itheima.domain.Province;

import java.util.List;

public interface ServiceProvince {
    List<Province> findAll();
    String findAllJson();

}
