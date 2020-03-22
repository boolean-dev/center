package com.booleandev.center.server.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * User entity
 *
 * @author Jiantao Yan
 * @title: User
 * @date 2020/3/22 22:12
 */
@Data
@TableName("t_user")
public class User {

    @TableId(value = "USER_ID", type = IdType.AUTO)
    private Long userId;

    private String username;

    private String password;

    private Long deptId;

    private String deptName;

    private String email;

    private String mobile;

    private String status;

    private Date crateTime;

    private Date modifyTime;

    private Date lastLoginTime;

    private String ssex;

    private String theme;

    private String avatar;

    private String description;

    private String roleName;
}
