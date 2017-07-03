package com.bean.springboot.controller;

import com.bean.model.User;
import com.bean.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by PVer on 2017/7/3.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/add")
    public String add(User user, HttpServletResponse response, HttpServletRequest request) throws SQLException {
        String error="";
        Map<String ,Object> map = new HashMap<>();
        map.put("userUsername",user.getUserUsername());
        User userCheck = userService.getByMap(map);


        return null;
    }
}
