package com.bean.service;

import com.bean.dao.UserExamMapper;
import com.bean.model.UserExam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utils.MyLogger;

import java.util.List;


@Service("userExamService")
public class UserExamServiceImpl implements UserExamService {

    @Autowired
    private UserExamMapper userExamMapper;

    private MyLogger LOGGER = new MyLogger(UserExamServiceImpl.class);

    @Override
    public int insertUserExamList(List<UserExam> userExam){
        return userExamMapper.insertList(userExam);
    }

    @Override
    public int insertUserExam(UserExam userExam) {
        return userExamMapper.insert(userExam);
    }

    @Override
    public Integer deleteByUserId(Integer managerId) {
        return userExamMapper.deleteByUserId(managerId);
    }

    @Override
    public List<UserExam> getUserExamListByInfo(UserExam userExam) {
        return userExamMapper.getUserExamListByInfo(userExam);
    }

    @Override
    public Integer deleteByUserExamId(Integer userExamId) {
        return userExamMapper.deleteByUserExamId(userExamId);
    }

    @Override
    public Integer getCountByInfo(UserExam userExam) {
        return userExamMapper.getCountByInfo(userExam);
    }
}
