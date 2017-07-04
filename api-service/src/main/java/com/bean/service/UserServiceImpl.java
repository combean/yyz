package com.bean.service;

import com.bean.dao.UserMapper;
import com.bean.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utils.MyLogger;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    private MyLogger LOGGER = new MyLogger(UserServiceImpl.class);

    @Override
    public int insert(User user) throws SQLException {
        return userMapper.insert(user);
    }

    @Override
    public int update(User user) throws SQLException {
        return userMapper.update(user);
    }

    @Override
    public User getByMap(Map<String,Object> map) throws SQLException {
        return userMapper.getByMap(map);
    }

    @Override
    public List<User> getListByMap(Map<String, Object> map) throws SQLException {
        return userMapper.getListByMap(map);
    }

    @Override
    public int getCountByMap(Map<String, Object> map) throws SQLException {
        return userMapper.getCountByMap(map);
    }

    @Override
    public User getById(int id) throws SQLException{
        return userMapper.getById(id);
    }

    @Override
    public User getByParameter(String str) throws SQLException {
        return userMapper.getByParameter(str);
    }

    @Override
    public User getByObj(User user) throws SQLException {
        return userMapper.getByObj(user);
    }
}
