package com.itheima.test;

import org.junit.Test;
import redis.clients.jedis.Jedis;

public class RedisTest {

    /**
     * String操作
     *
     * */
    @Test
    public void test1(){
        Jedis jedis = new Jedis();
        jedis.set("name","陈明");
        String name = jedis.get("name");
        System.out.println(name);
        jedis.close();
    }

    /**
     *hash操作
     *
     * */
    @Test
    public void test2(){
        Jedis jedis = new Jedis();
        jedis.hset("user","username","陈明傻逼");
        String name = jedis.hget("user","username");
        System.out.println(name);
        jedis.close();
    }




}
