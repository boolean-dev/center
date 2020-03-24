package com.booleandev.center.entity.request;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * product 查询bean
 *
 * @author Jiantao Yan
 * @title: ProductRequest
 * @date 2020/3/24 9:56
 */
@Data
public class ProductRequest {

    private Long id;

    private String name;

    private String timeBy;

    private LocalDateTime startTime;

    private LocalDateTime endTime;

    private String order;

    private String orderBy;
}
