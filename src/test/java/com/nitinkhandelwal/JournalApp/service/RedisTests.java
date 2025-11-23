package com.nitinkhandelwal.JournalApp.service;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.lettuce.LettuceConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootTest
public class RedisTests {
    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    RedisConnectionFactory factory;

    @Autowired
    private org.springframework.core.env.Environment env;

    @Disabled
    @Test
    void testSendMail(){
        redisTemplate.opsForValue().set("email","justesehi@gmail.com");
        Object email = redisTemplate.opsForValue().get("name");
        int a=1;
    }

//    @Test
//    void testSendMail() {
//        System.out.println(factory.getConnection().getClientName());
//    }




//    @Test
//    void checkFactory() {
//        LettuceConnectionFactory lf = (LettuceConnectionFactory) factory;
//        System.out.println("Factory host = " + lf.getHostName());
//        System.out.println("Factory port = " + lf.getPort());
//        System.out.println("SSL enabled = " + lf.isUseSsl());
//
//        System.out.println(factory.getClass());
//    }
//
//
//    @Test
//    void checkRedisConfig() {
//        System.out.println("HOST = " + env.getProperty("spring.redis.host"));
//        System.out.println("PORT = " + env.getProperty("spring.redis.port"));
//        System.out.println("PASS = " + env.getProperty("spring.redis.password"));
//    }



}
