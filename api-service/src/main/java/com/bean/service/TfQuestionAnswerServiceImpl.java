package com.bean.service;

import com.bean.dao.TfQuestionAnswerMapper;
import com.bean.model.TfQuestionAnswer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utils.MyLogger;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;


@Service("tfQuestionAnswerAnswerService")
public class TfQuestionAnswerServiceImpl implements TfQuestionAnswerService {

    @Autowired
    private TfQuestionAnswerMapper tfQuestionAnswerAnswerMapper;

    private MyLogger LOGGER = new MyLogger(TfQuestionAnswerServiceImpl.class);


    @Override
    public int insertList(List<TfQuestionAnswer> tfQuestionAnswerAnswer) throws SQLException {
        return tfQuestionAnswerAnswerMapper.insertList(tfQuestionAnswerAnswer);
    }

    @Override
    public int insert(TfQuestionAnswer tfQuestionAnswerAnswer) throws SQLException {
        return tfQuestionAnswerAnswerMapper.insert(tfQuestionAnswerAnswer);
    }

    @Override
    public Integer deleteByQuestionId(Integer questionId) throws SQLException {
        return tfQuestionAnswerAnswerMapper.deleteByQuestionId(questionId);
    }

    @Override
    public List<TfQuestionAnswer> getListByMap(Map<String, Object> map) throws SQLException {
        return tfQuestionAnswerAnswerMapper.getListByMap(map);
    }

    @Override
    public Integer deleteById(Integer id) throws SQLException {
        return tfQuestionAnswerAnswerMapper.deleteById(id);
    }

    @Override
    public int getCountByMap(Map<String, Object> map) throws SQLException {
        return tfQuestionAnswerAnswerMapper.getCountByMap(map);
    }

    @Override
    public String getRightAnswerByQuestionId(Integer questionId) throws SQLException {
        return tfQuestionAnswerAnswerMapper.getRightAnswerByQuestionId(questionId);
    }

    @Override
    public TfQuestionAnswer getRightAnswerObjByQuestionId(Integer questionId) throws SQLException {
        return tfQuestionAnswerAnswerMapper.getRightAnswerObjByQuestionId(questionId);
    }
}
