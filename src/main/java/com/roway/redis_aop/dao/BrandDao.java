package com.roway.redis_aop.dao;

import com.roway.redis_aop.entity.BrandEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

/**
 * ==================================================
 *
 * @author : luowei
 * @fileName: BrandDao
 * @create 2020/3/16
 * @since 1.0.0
 * <description>：
 * ==================================================
 */
public interface BrandDao {

    public BrandEntity select(@Param("id") Integer id);

}
