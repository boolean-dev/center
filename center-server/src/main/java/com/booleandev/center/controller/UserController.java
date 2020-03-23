package com.booleandev.center.controller;

import com.booleandev.center.entity.User;
import com.booleandev.center.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * User Controller
 *
 * @author Jiantao Yan
 * @title: UserController
 * @date 2020/3/22 22:52
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user/{username}")
    public User findByUsername(@PathVariable("username") String username) {
        return userService.findByUsername(username);
    }

}
