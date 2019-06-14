package com.itheima.jedis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class JedisPoolUtils {

    private static JedisPool jedisPool;

    //1.读取配置文件
    static {
        InputStream is = JedisPoolUtils.class.getClassLoader().getResourceAsStream("jedis.properties");
        Properties prop = new Properties();
        try {
            prop.load(is);

        } catch (IOException e) {
            e.printStackTrace();
        }
        JedisPoolConfig config = new JedisPoolConfig();
        config.setMaxIdle(Integer.parseInt(prop.getProperty("maxIdle")));
        config.setMaxTotal(Integer.parseInt(prop.getProperty("maxTotal")));

        jedisPool = new JedisPool(config, prop.getProperty("host"), Integer.parseInt(prop.getProperty("port")));
    }

    public static Jedis getjedis() {

        return jedisPool.getResource();
    }


}
