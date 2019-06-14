package com.itheima.dao.impl;

import com.itheima.dao.FindProvince;
import com.itheima.domain.Province;
import com.itheima.util.JDBCUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class FindProvinceImpl implements FindProvince {
    private JdbcTemplate template =new JdbcTemplate(JDBCUtils.getDataSource());
    @Override
    public List<Province> findAll() {
        //1.定义sql
        String sql = "select * from province";
        List<Province> list = template.query(sql, new BeanPropertyRowMapper<Province>(Province.class));
        return list;
    }
}
