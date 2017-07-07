package com.bean.service;

import com.bean.dao.UserExamMapper;
import com.bean.model.UserExam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utils.MyLogger;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;


@Service("userExamService")
public class UserExamServiceImpl implements UserExamService {

    @Autowired
    private UserExamMapper userExamMapper;

    private MyLogger LOGGER = new MyLogger(UserExamServiceImpl.class);

    @Override
    public int insertList(List<UserExam> userExam) throws SQLException {
        return userExamMapper.insertList(userExam);
    }

    @Override
    public int insert(UserExam userExam) throws SQLException {
        return userExamMapper.insert(userExam);
    }

    @Override
    public int deleteByUserId(Integer userId) {
        return userExamMapper.deleteByUserId(userId);
    }

    @Override
    public List<UserExam> getListByMap(Map<String,Object> map) throws SQLException {
        return userExamMapper.getListByMap(map);
    }

    @Override
    public int deleteById(Integer id) throws SQLException {
        return userExamMapper.deleteById(id);
    }

    @Override
    public int getCountByMap(Map<String,Object> map) throws SQLException {
        return userExamMapper.getCountByMap(map);
    }
}
