package com.booleandev.center.entity.vo;

import lombok.Data;

import java.math.BigDecimal;

/**
 * 商品 VO
 *
 * @author Jiantao Yan
 * @title: ProductVO
 * @date 2020/3/24 22:59
 */
@Data
public class ProductVO {


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
