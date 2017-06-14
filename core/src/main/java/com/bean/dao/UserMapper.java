package com.bean.dao;

import com.bean.model.User;
import com.bean.model.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {

    int insert(User user);

    boolean editUserById(User user);

}