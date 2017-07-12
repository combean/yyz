package com.bean.service;

import com.bean.dao.QuestionAnswerMapper;
import com.bean.model.QuestionAnswer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utils.MyLogger;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;


@Service("questionAnswerService")
public class QuestionAnswerServiceImpl implements QuestionAnswerService {

    @Autowired
    private QuestionAnswerMapper questionAnswerMapper;

    private MyLogger LOGGER = new MyLogger(QuestionAnswerServiceImpl.class);


    @Override
    public int insertList(List<QuestionAnswer> questionAnswers) throws SQLException {
        return questionAnswerMapper.insertList(questionAnswers);
    }

    @Override
    public int insert(QuestionAnswer questionAnswer) throws SQLException {
        return questionAnswerMapper.insert(questionAnswer);
    }

    @Override
    public Integer deleteByQuestionId(Integer questionId) throws SQLException {
        return questionAnswerMapper.deleteByQuestionId(questionId);
    }

    @Override
    public List<QuestionAnswer> getListByMap(Map<String, Object> map) throws SQLException {
        return questionAnswerMapper.getListByMap(map);
    }

    @Override
    public int deleteById(Integer id) throws SQLException {
        return questionAnswerMapper.deleteById(id);
    }

    @Override
    public int getCountByMap(Map<String, Object> map) throws SQLException {
        return questionAnswerMapper.getCountByMap(map);
    }

    @Override
    public String getRightAnswerByQuestionId(Integer questionId) throws SQLException {
        return questionAnswerMapper.getRightAnswerByQuestionId(questionId);
    }

    @Override
    public QuestionAnswer getRightAnswerObjByQuestionId(Integer questionId) throws SQLException {
        return questionAnswerMapper.getRightAnswerObjByQuestionId(questionId);
    }

    @Override
    public List<QuestionAnswer> getRightAnswerListByQuestionId(Integer questionId) throws SQLException {
        return questionAnswerMapper.getRightAnswerListByQuestionId(questionId);
    }

    @Override
    public List<QuestionAnswer> getAnswerListByQuestionId(Integer questionId) throws SQLException {
        return questionAnswerMapper.getAnswerListByQuestionId(questionId);
    }
}
