package com.redis.transaction.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by jiangwenping on 17/3/21.
 */
public class RedisClusterServiceTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext(new String[]{"bean/*.xml"});
        RedisClusterService redisClusterService = (RedisClusterService) classPathXmlApplicationContext.getBean("redisClusterService");

        redisClusterService.setString("test", "200");
        System.out.println(redisClusterService.getString("test"));
    }
}
