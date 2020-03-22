package com.booleandev.center.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.booleandev.center.server.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * User mapper
 *
 * @author Jiantao Yan
 * @title: UserMapper
 * @date 2020/3/22 22:12
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
    /**
     * 根据 username 查找用户名
     * @param username  username
     * @return  user
     */
    User findByUsername(String username);
}
