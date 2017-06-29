package com.bean.service;

import com.bean.dao.UserExamAnswerMapper;
import com.bean.dao.UserExamMapper;
import com.bean.model.UserExam;
import com.bean.model.UserExamAnswer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utils.MyLogger;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;


@Service("userExamAnswerService")
public class UserExamAnswerServiceImpl implements UserExamAnswerService {

    @Autowired
    private UserExamAnswerMapper userExamAnswerMapper;

    private MyLogger LOGGER = new MyLogger(UserExamAnswerServiceImpl.class);

    @Override
    public int insertList(List<UserExamAnswer> userExamAnswer) throws SQLException {
        return userExamAnswerMapper.insertList(userExamAnswer);
    }

    @Override
    public int insert(UserExamAnswer userExamAnswer) throws SQLException {
        return userExamAnswerMapper.insert(userExamAnswer);
    }

    @Override
    public int deleteByUserId(Integer userId) {
        return userExamAnswerMapper.deleteByUserId(userId);
    }

    @Override
    public List<UserExamAnswer> getListByMap(Map<String,Object> map) throws SQLException {
        return userExamAnswerMapper.getListByMap(map);
    }

    @Override
    public int deleteById(Integer id) throws SQLException {
        return userExamAnswerMapper.deleteById(id);
    }

    @Override
    public int getCountByMap(Map<String,Object> map) throws SQLException {
        return userExamAnswerMapper.getCountByMap(map);
    }

    @Override
    public int deleteByPaperId(Integer paperId) throws SQLException {
        return userExamAnswerMapper.deleteByPaperId(paperId);
    }

    @Override
    public int updateAnswerById(UserExamAnswer userExamAnswer) throws SQLException {
        return userExamAnswerMapper.updateAnswerById(userExamAnswer);
    }
}
