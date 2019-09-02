package com.example.redis.demo.controller;

import com.example.redis.demo.sender.RedisSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/redis")
@RestController
public class RedisController {
    @Autowired
    private RedisSender redisSender;

    @GetMapping
    public String sendDataToRedisQueue(@RequestParam("redis") String input) {
        redisSender.sendDataToRedisQueue(input);
        return "Sent Successfully!!!";
    }
}
