package com.booleandev.center.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.booleandev.center.server.entity.User;

/**
 * User service
 *
 * @author Jiantao Yan
 * @title: UserService
 * @date 2020/3/22 22:12
 */
public interface UserService extends IService<User> {

    /**
     * 通过用户名查找用户信息
     * @param username  username
     * @return  user
     */
    User findByUsername(String username);
}
