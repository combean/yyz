package com.bean.dao;

import com.bean.model.User;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    int insert(User user);

    Integer update(User user);

    User getUserByInfo(Map<String,String> map);

    List<User> getUserList(Map<String,String> map);

    Integer getUserCount(Map<String,String> map);

}