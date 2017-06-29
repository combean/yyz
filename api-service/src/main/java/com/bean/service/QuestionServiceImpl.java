package com.bean.service;

import com.bean.dao.QuestionMapper;
import com.bean.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utils.MyLogger;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@Service("questionService")
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    private QuestionMapper questionMapper;

    private MyLogger LOGGER = new MyLogger(QuestionServiceImpl.class);


    @Override
    public int insert(Question question) throws SQLException {
        return questionMapper.insert(question);
    }

    @Override
    public Integer update(Question question) throws SQLException {
        return questionMapper.update(question);
    }

    @Override
    public Question getByMap(Map<String, Object> map) throws SQLException {
        return questionMapper.getByMap(map);
    }

    @Override
    public List<Question> getListByMap(Map<String, Object> map) throws SQLException {
        return questionMapper.getListByMap(map);
    }

    @Override
    public Integer getQuestionCountByInfo(Map<String, Object> map) throws SQLException {
        return questionMapper.getCountByMap(map);
    }

    @Override
    public Question getById(Integer id) throws SQLException {
        return questionMapper.getById(id);
    }
}
