package com.bean.springboot.controller;

import com.bean.model.ResultJson;
import com.bean.model.User;
import com.bean.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.SQLException;
import java.util.*;

/**
 * Created by PVer on 2017/7/3.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/add")
    public ResultJson add(User user) throws SQLException {
        ResultJson resultJson = new ResultJson();
        Map<String, Object> errorMap = new HashMap<>();

        User userCheck = new User();

        //用户名为空验证
        if(user.getUserUsername()==null || user.getUserUsername()==""){
            resultJson.setState(0);
            errorMap.put("empty_username","用户名不能为空");
        }else{
            //用户名重复验证
            userCheck.setUserUsername(user.getUserUsername());
            User checkUsername = userService.getByObj(userCheck);
            if(checkUsername!=null){
                resultJson.setState(0);
                errorMap.put("repeat_username","该用户名已被使用");
            }
        }
        //手机号码为空验证
        if(user.getUserMobile()==null || user.getUserMobile()==""){
            resultJson.setState(0);
            errorMap.put("empty_username","手机号码不能为空");
        }else {
            //手机号码重复验证
            userCheck.setUserMobile(user.getUserMobile());
            User checkMobile = userService.getByObj(userCheck);
            if(checkMobile!=null){
                resultJson.setState(0);
                errorMap.put("repeat_mobile","该手机号码已被使用");
            }
        }
        //邮箱为空验证
        if(user.getUserEmail()==null || user.getUserEmail()==""){
            resultJson.setState(0);
            errorMap.put("empty_username","邮箱不能为空");
        }else {
            //邮箱重复验证
            userCheck.setUserMobile(null);
            userCheck.setUserEmail(user.getUserMobile());
            User checkEmail = userService.getByObj(userCheck);
            if(checkEmail!=null){
                resultJson.setState(0);
                errorMap.put("repeat_email","该邮箱已被使用");
            }
        }
        //密码为空验证
        if(user.getUserPassword()=="" || user.getUserPassword1()=="" || user.getUserPassword()==null || user.getUserPassword1()==null){
            resultJson.setState(0);
            errorMap.put("empty_password","密码不能为空");
        }else {
            //密码不一致验证
            if(!user.getUserPassword().equals(user.getUserPassword1())){
                resultJson.setState(0);
                errorMap.put("wrong_password","两次密码不一致");
            }
        }
        if(errorMap.size()>0) resultJson.setErrorMap(errorMap);
        else {
            user.setAddname("zhaoyan");
            user.setAddid(1);
            user.setAddtime(new Date());
//            user.setUserPassword(MD5());
            userService.insert(user);
            resultJson.setState(1);
        }

        return resultJson;
    }

    @RequestMapping("/edit")
    public ResultJson edit(User user) throws SQLException {
        ResultJson resultJson = new ResultJson();
        Map<String, Object> errorMap = new HashMap<>();

        User userCheck = new User();

        //手机号码为空验证
        if(user.getUserMobile()==null || user.getUserMobile()==""){
            resultJson.setState(0);
            errorMap.put("empty_username","手机号码不能为空");
        }else {
            //手机号码重复验证
            userCheck.setUserMobile(user.getUserMobile());
            User checkMobile = userService.getByObj(userCheck);
            if(checkMobile!=null && checkMobile.getUserId()!=user.getUserId()){
                resultJson.setState(0);
                errorMap.put("repeat_mobile","该手机号码已被使用");
            }
        }
        //邮箱为空验证
        if(user.getUserEmail()==null || user.getUserEmail()==""){
            resultJson.setState(0);
            errorMap.put("empty_username","邮箱不能为空");
        }else {
            //邮箱重复验证
            userCheck.setUserMobile(null);
            userCheck.setUserEmail(user.getUserEmail());
            User checkEmail = userService.getByObj(userCheck);
            if(checkEmail!=null && checkEmail.getUserId()!=user.getUserId()){
                resultJson.setState(0);
                errorMap.put("repeat_email","该邮箱已被使用");
            }
        }
        //密码为空不修改
        if(user.getUserPassword()==""  || user.getUserPassword()==null){
            user.setUserPassword(null);
        }else {
            //密码不一致验证
            if(!user.getUserPassword().equals(user.getUserPassword1())){
                resultJson.setState(0);
                errorMap.put("wrong_password","两次密码不一致");
            }
        }
        if(errorMap.size()>0) resultJson.setErrorMap(errorMap);
        else {
            user.setEditname("zhaoyan");
            user.setEditid(1);
            user.setEdittime(new Date());
            userService.update(user);
            resultJson.setState(1);
        }

        return resultJson;
    }

    @RequestMapping("/del")
    public ResultJson delete(User user) throws SQLException {
        ResultJson resultJson = new ResultJson();
        user.setDel(0);
        user.setEditname("zhaoyan");
        user.setEditid(1);
        user.setEdittime(new Date());

        userService.update(user);

        resultJson.setState(1);
        return resultJson;
    }

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
}
