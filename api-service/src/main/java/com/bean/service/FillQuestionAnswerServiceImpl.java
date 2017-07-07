package com.bean.service;

import com.bean.dao.FillQuestionAnswerMapper;
import com.bean.model.FillQuestionAnswer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utils.MyLogger;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;


@Service("fillQuestionAnswerService")
public class FillQuestionAnswerServiceImpl implements FillQuestionAnswerService {

    @Autowired
    private FillQuestionAnswerMapper fillQuestionAnswerMapper;

    private MyLogger LOGGER = new MyLogger(FillQuestionAnswerServiceImpl.class);


    @Override
    public int insertList(List<FillQuestionAnswer> fillQuestionAnswer) throws SQLException {
        return fillQuestionAnswerMapper.insertList(fillQuestionAnswer);
    }

    @Override
    public int insert(FillQuestionAnswer fillQuestionAnswer) throws SQLException {
        return fillQuestionAnswerMapper.insert(fillQuestionAnswer);
    }

    @Override
    public int deleteByQuestionId(Integer questionId) throws SQLException {
        return fillQuestionAnswerMapper.deleteByQuestionId(questionId);
    }

    @Override
    public List<FillQuestionAnswer> getListByMap(Map<String, Object> map) throws SQLException {
        return fillQuestionAnswerMapper.getListByMap(map);
    }

    @Override
    public Integer deleteById(Integer id) throws SQLException {
        return fillQuestionAnswerMapper.deleteById(id);
    }

    @Override
    public int getCountByMap(Map<String, Object> map) throws SQLException {
        return fillQuestionAnswerMapper.getCountByMap(map);
    }

    @Override
    public List<FillQuestionAnswer> getAnswerByQuestionId(Integer questionId) throws SQLException {
        return fillQuestionAnswerMapper.getAnswerByQuestionId(questionId);
    }

}
