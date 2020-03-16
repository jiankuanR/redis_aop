package com.roway.redis_aop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
public class RedisAopApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedisAopApplication.class, args);
    }

}
