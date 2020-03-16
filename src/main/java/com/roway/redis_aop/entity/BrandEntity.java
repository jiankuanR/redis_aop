package com.roway.redis_aop.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.persistence.Column;

import java.io.Serializable;

/**
 * ==================================================
 *
 * @author : luowei
 * @fileName: BrandEntity
 * @create 2020/3/16
 * @since 1.0.0
 * <description>：
 * ==================================================
 */
@Data
public class BrandEntity implements Serializable {

    @Id
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "logo")
    private String logo;

    @Column(name = "brandHTML")
    private String brandHTML;

}
