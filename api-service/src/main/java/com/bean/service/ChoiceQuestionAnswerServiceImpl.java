package com.bean.service;

import com.bean.dao.ChoiceQuestionAnswerMapper;
import com.bean.model.ChoiceQuestionAnswer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utils.MyLogger;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;


@Service("choiceQuestionAnswerService")
public class ChoiceQuestionAnswerServiceImpl implements ChoiceQuestionAnswerService {

    @Autowired
    private ChoiceQuestionAnswerMapper choiceQuestionAnswerMapper;

    private MyLogger LOGGER = new MyLogger(ChoiceQuestionAnswerServiceImpl.class);


    @Override
    public int insertList(List<ChoiceQuestionAnswer> choiceQuestionAnswer) throws SQLException {
        return choiceQuestionAnswerMapper.insertList(choiceQuestionAnswer);
    }

    @Override
    public int insert(ChoiceQuestionAnswer choiceQuestionAnswer) throws SQLException {
        return choiceQuestionAnswerMapper.insert(choiceQuestionAnswer);
    }

    @Override
    public Integer deleteByQuestionId(Integer questionId) throws SQLException {
        return choiceQuestionAnswerMapper.deleteByQuestionId(questionId);
    }

    @Override
    public List<ChoiceQuestionAnswer> getListByMap(Map<String, Object> map) throws SQLException {
        return choiceQuestionAnswerMapper.getListByMap(map);
    }

    @Override
    public Integer deleteById(Integer id) throws SQLException {
        return choiceQuestionAnswerMapper.deleteById(id);
    }

    @Override
    public int getCountByMap(Map<String, Object> map) throws SQLException {
        return choiceQuestionAnswerMapper.getCountByMap(map);
    }

    @Override
    public String getRightAnswerByQuestionId(Integer questionId) throws SQLException {
        return choiceQuestionAnswerMapper.getRightAnswerByQuestionId(questionId);
    }

    @Override
    public ChoiceQuestionAnswer getRightAnswerObjByQuestionId(Integer questionId) throws SQLException {
        return choiceQuestionAnswerMapper.getRightAnswerObjByQuestionId(questionId);
    }
}
