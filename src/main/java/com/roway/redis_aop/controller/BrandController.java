package com.roway.redis_aop.controller;

import com.roway.redis_aop.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ==================================================
 *
 * @author : luowei
 * @fileName: BrandController
 * @create 2020/3/16
 * @since 1.0.0
 * <description>：
 * ==================================================
 */
@RestController
public class BrandController {

    @Autowired
    private RedisService redisService;

    @RequestMapping("/get")
    public String select() {
        redisService.sayHello();
        return "jajajajajaj";
    }

}
