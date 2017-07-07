package com.bean.service;

import com.bean.dao.PaperQuestionMapper;
import com.bean.model.PaperQuestion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utils.MyLogger;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;


@Service("paperQuestionService")
public class PaperQuestionServiceImpl implements PaperQuestionService {

    @Autowired
    private PaperQuestionMapper paperQuestionMapper;

    private MyLogger LOGGER = new MyLogger(PaperQuestionServiceImpl.class);

    @Override
    public int insertList(List<PaperQuestion> paperQuestion) throws SQLException {
        return paperQuestionMapper.insertList(paperQuestion);
    }

    @Override
    public int insert(PaperQuestion paperQuestion) throws SQLException {
        return paperQuestionMapper.insert(paperQuestion);
    }

    @Override
    public int deleteByPaperId(Integer paperId) {
        return paperQuestionMapper.deleteByPaperId(paperId);
    }

    @Override
    public List<PaperQuestion> getListByMap(Map<String, Object> map) throws SQLException {
        return paperQuestionMapper.getListByMap(map);
    }

    @Override
    public int deleteById(Integer id) throws SQLException {
        return paperQuestionMapper.deleteById(id);
    }

    @Override
    public int getCountByMap(Map<String, Object> map) throws SQLException {
        return paperQuestionMapper.getCountByMap(map);
    }
}
