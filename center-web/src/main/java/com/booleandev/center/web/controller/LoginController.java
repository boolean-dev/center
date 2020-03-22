package com.booleandev.center.web.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;
import java.util.Map;

/**
 * Login Controller
 *
 * @author Jiantao Yan
 * @title: LoginController
 * @date 2020/3/22 21:19
 */
@Slf4j
@Controller
public class LoginController {

    @GetMapping("/index")
    public String index(Model model) {
        Map<String, String> user = new HashMap<>();
        user.put("username", "booleandev");
        user.put("theme", "red");
        user.put("avatar", "20180414165754.jpg");
        user.put("email", "booleandev.yan@gmail.com");
        model.addAttribute("user", user);
        return "index";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/")
    public String main(Model model) {
        Map<String, String> user = new HashMap<>();
        user.put("username", "booleandev");
        user.put("theme", "red");
        user.put("avatar", "20180414165754.jpg");
        user.put("email", "booleandev.yan@gmail.com");
        model.addAttribute("user", user);
        return "index";
    }
}
