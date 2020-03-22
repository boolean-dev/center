package com.booleandev.center.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.booleandev.center.server.entity.User;
import com.booleandev.center.server.mapper.UserMapper;
import com.booleandev.center.server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * user service 实现类
 *
 * @author Jiantao Yan
 * @title: UserServiceImpl
 * @date 2020/3/22 22:28
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public User findByUsername(String username) {
        User user = userMapper.findByUsername(username);
        return user;
    }

}
