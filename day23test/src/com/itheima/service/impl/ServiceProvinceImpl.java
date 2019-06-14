package com.itheima.service.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.itheima.dao.impl.FindProvinceImpl;
import com.itheima.domain.Province;
import com.itheima.jedis.JedisPoolUtils;
import com.itheima.service.ServiceProvince;
import redis.clients.jedis.Jedis;

import java.util.List;

public class ServiceProvinceImpl implements ServiceProvince {
    private FindProvinceImpl dao = new FindProvinceImpl();

    @Override
    public List<Province> findAll() {
        return dao.findAll();
    }

    @Override
    public String findAllJson() {
        Jedis jedis = JedisPoolUtils.getjedis();
        String province_json = jedis.get("province");
        if (province_json == null || province_json.length() == 0) {
            List<Province> list = dao.findAll();
            ObjectMapper mapper = new ObjectMapper();
            try {
                System.out.println("从数据库查询");
                province_json = mapper.writeValueAsString(list);
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }
            jedis.set("province", province_json);
        } else {
            System.out.println("从缓存查询");
        }


        return province_json;
    }
}
