package com.bean.springboot.controller;

import com.bean.RSTFul.RSTFulBody;
import com.bean.model.Exam;
import com.bean.model.User;
import com.bean.service.ExamService;
import com.bean.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static utils.Utils.MD5;

/**
 * Created by PVer on 2017/7/3.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private ExamService examService;

    //添加用户
    @RequestMapping("/add")
    public RSTFulBody add(User user, HttpServletRequest request) {
        RSTFulBody resObject = new RSTFulBody();
        user.setAddname(request.getSession().getAttribute("userName")+"");
        user.setAddid(Integer.parseInt(request.getSession().getAttribute("userId")+""));
        user.setAddtime(new Date());
        user.setUserPassword(MD5(user.getUserPassword()));
        int i= 0;
        try {
            i = userService.insert(user);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        if(i>0){
            resObject.setCode(1);
        }else{
            resObject.setCode(0);
        }

        return resObject;
    }

    //编辑用户
    @RequestMapping("/edit")
    public RSTFulBody edit(User user,HttpServletRequest request) throws SQLException {
        RSTFulBody resObject = new RSTFulBody();

        user.setEditname(request.getSession().getAttribute("userName")+"");
        user.setEditid(Integer.parseInt(request.getSession().getAttribute("userId")+""));
        user.setEdittime(new Date());
        int i=userService.update(user);
        if(i>0){
            resObject.setCode(1);
        }else{
            resObject.setCode(0);
        }


        return resObject;
    }

    //删除用户
    @RequestMapping("/del")
    public RSTFulBody delete(User user,HttpServletRequest request) throws SQLException {
        RSTFulBody resObject = new RSTFulBody();
        user.setDel(0);
        user.setEditname(request.getSession().getAttribute("userName")+"");
        user.setEditid(Integer.parseInt(request.getSession().getAttribute("userId")+""));
        user.setEdittime(new Date());
        userService.update(user);

        resObject.setCode(1);
        return resObject;
    }

    //获取用户列表
    @RequestMapping("/getAllUser")
    public List<User> getAllUser(User user) throws SQLException {
        //搜索条件
        Map<String, Object> map = new HashMap<>();
        map.put("del",1);
        if(user.getUserUsername()!=null || user.getUserUsername()!="") map.put("userUsername",user.getUserUsername());
        if(user.getUserName()!=null || user.getUserName()!="") map.put("userName",user.getUserName());
        if(user.getUserMobile()!=null || user.getUserMobile()!="") map.put("userMobile",user.getUserMobile());
        if(user.getUserEmail()!=null || user.getUserEmail()!="") map.put("userEmail",user.getUserEmail());
        if(user.getUserClassId()!=null) map.put("userClassId",user.getUserClassId());

        List<User> users = userService.getListByMap(map);

        return users;
    }

    //获取用户考试列表
    @RequestMapping("/getExamByUser")
    public List<Exam> getExamByUser(int userId) throws SQLException {
        Map<String, Object> map = new HashMap<>();
        map.put("userId",userId);
        List<Exam> exams = examService.getListByMap(map);
        return exams;
    }
}
