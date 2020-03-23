package com.booleandev.center.entity;

import lombok.Data;

import java.math.BigDecimal;

/**
 * Product
 *
 * @author Jiantao Yan
 * @title: Product
 * @date 2020/3/23 22:43
 */

@Data
public class Product extends BaseEntity{

    /**
     * id
     */
    private Long id;

    /**
     * 标题
     */
    private String title;

    /**
     * 名称
     */
    private String name;

    /**
     * 价格
     */
    private BigDecimal price;

    /**
     * 图片
     */
    private String image;

    /**
     * 数量
     */
    private Integer number;

    /**
     * 状态
     */
    private String status;

}
