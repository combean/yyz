package com.bean.service;

import com.bean.dao.UserMapper;
import com.bean.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utils.MyLogger;

/**
 * Created by bean on 2016/6/22.
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    private MyLogger LOGGER = new MyLogger(UserServiceImpl.class);

    @Override
    public int insertUser(User user) {
        return userMapper.insert(user);
    }
}
