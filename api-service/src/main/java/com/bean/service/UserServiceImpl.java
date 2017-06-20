package com.bean.service;

import com.bean.dao.UserMapper;
import com.bean.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utils.MyLogger;
import java.util.List;
import java.util.Map;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    private MyLogger LOGGER = new MyLogger(UserServiceImpl.class);

    @Override
    public int insertUser(User user) {
        return userMapper.insert(user);
    }

    @Override
    public boolean updateUser(User user) {
        return userMapper.update(user);
    }

    @Override
    public User getUserByInfo(Map<String,String> map) {
        return userMapper.getUserByInfo(map);
    }

    @Override
    public List<User> getUserListByInfo(Map<String, String> map) {
        return userMapper.getUserList(map);
    }

    @Override
    public Integer getUserCountByInfo(Map<String, String> map) {
        return userMapper.getUserCount(map);
    }
}
