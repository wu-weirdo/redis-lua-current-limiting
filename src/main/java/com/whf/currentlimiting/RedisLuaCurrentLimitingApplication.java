package com.whf.currentlimiting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RedisLuaCurrentLimitingApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedisLuaCurrentLimitingApplication.class, args);
    }

}
