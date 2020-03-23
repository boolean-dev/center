package com.booleandev.center.entity;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * Base entity
 *
 * @author Jiantao Yan
 * @title: BaseEntity
 * @date 2020/3/23 23:13
 */
@Data
public class BaseEntity {

    private LocalDateTime createTime;
    private String createBy;
    private LocalDateTime updateTime;
    private String updateBy;
}
