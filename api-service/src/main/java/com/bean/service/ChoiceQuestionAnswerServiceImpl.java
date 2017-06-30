package com.bean.service;

import com.bean.dao.ChoiceQuestionAnswerMapper;
import com.bean.model.ChoiceQuestionAnswer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utils.MyLogger;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;


@Service("choiceQuestionAnswertService")
public class ChoiceQuestionAnswerServiceImpl implements ChoiceQuestionAnswerService {

    @Autowired
    private ChoiceQuestionAnswerMapper choiceQuestionAnswertMapper;

    private MyLogger LOGGER = new MyLogger(ChoiceQuestionAnswerServiceImpl.class);


    @Override
    public int insertList(List<ChoiceQuestionAnswer> choiceQuestionAnswert) throws SQLException {
        return choiceQuestionAnswertMapper.insertList(choiceQuestionAnswert);
    }

    @Override
    public int insert(ChoiceQuestionAnswer choiceQuestionAnswert) throws SQLException {
        return choiceQuestionAnswertMapper.insert(choiceQuestionAnswert);
    }

    @Override
    public Integer deleteByQuestionId(Integer questionId) throws SQLException {
        return choiceQuestionAnswertMapper.deleteByQuestionId(questionId);
    }

    @Override
    public List<ChoiceQuestionAnswer> getListByMap(Map<String, Object> map) throws SQLException {
        return choiceQuestionAnswertMapper.getListByMap(map);
    }

    @Override
    public Integer deleteById(Integer id) throws SQLException {
        return choiceQuestionAnswertMapper.deleteById(id);
    }

    @Override
    public int getCountByMap(Map<String, Object> map) throws SQLException {
        return choiceQuestionAnswertMapper.getCountByMap(map);
    }

    @Override
    public String getRightAnswerByQuestionId(Integer questionId) throws SQLException {
        return choiceQuestionAnswertMapper.getRightAnswerByQuestionId(questionId);
    }

    @Override
    public ChoiceQuestionAnswer getRightAnswerObjByQuestionId(Integer questionId) throws SQLException {
        return choiceQuestionAnswertMapper.getRightAnswerObjByQuestionId(questionId);
    }
}
