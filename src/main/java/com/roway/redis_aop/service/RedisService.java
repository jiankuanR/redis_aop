package com.roway.redis_aop.service;

import com.roway.redis_aop.annotation.AopAction;
import com.roway.redis_aop.dao.BrandDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * ==================================================
 *
 * @author : luowei
 * @fileName: RedisService
 * @create 2020/3/16
 * @since 1.0.0
 * <description>：
 * ==================================================
 */
@Component
public class RedisService {

    @Autowired
    private BrandDao brandDao;

    @AopAction
    public void sayHello() {
        brandDao.select(1);
    }


}
