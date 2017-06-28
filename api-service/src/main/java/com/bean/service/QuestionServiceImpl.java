package com.bean.service;

import com.bean.dao.QuestionMapper;
import com.bean.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utils.MyLogger;

import java.util.List;
import java.util.Map;

@Service("questionService")
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    private QuestionMapper questionMapper;

    private MyLogger LOGGER = new MyLogger(QuestionServiceImpl.class);


    @Override
    public int insertQuestion(Question question) {
        return questionMapper.insert(question);
    }

    @Override
    public Integer updateQuestion(Question question) {
        return questionMapper.update(question);
    }

    @Override
    public Question getQuestionByInfo(Map<String, String> map) {
        return questionMapper.getQuestionByInfo(map);
    }

    @Override
    public List<Question> getQuestionListByInfo(Map<String, String> map) {
        return questionMapper.getQuestionListByInfo(map);
    }

    @Override
    public Integer getQuestionCountByInfo(Map<String, String> map) {
        return questionMapper.getQuestionCount(map);
    }
}
