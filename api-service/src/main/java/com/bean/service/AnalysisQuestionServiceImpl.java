package com.bean.service;

import com.bean.dao.AnalysisQuestionMapper;
import com.bean.model.AnalysisQuestion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utils.MyLogger;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;


@Service("analysisQuestionService")
public class AnalysisQuestionServiceImpl implements AnalysisQuestionService {

    @Autowired
    private AnalysisQuestionMapper analysisQuestionMapper;

    private MyLogger LOGGER = new MyLogger(AnalysisQuestionServiceImpl.class);


    @Override
    public int insertList(List<AnalysisQuestion> analysisQuestion) throws SQLException {
        return analysisQuestionMapper.insertList(analysisQuestion);
    }

    @Override
    public int insert(AnalysisQuestion analysisQuestion) throws SQLException {
        return analysisQuestionMapper.insert(analysisQuestion);
    }

    @Override
    public int deleteByFQuestionId(Integer fquestionId) throws SQLException {
        return analysisQuestionMapper.deleteByFQuestionId(fquestionId);
    }

    @Override
    public List<AnalysisQuestion> getListByMap(Map<String, Object> map) throws SQLException {
        return analysisQuestionMapper.getListByMap(map);
    }

    @Override
    public Integer deleteById(Integer id) throws SQLException {
        return analysisQuestionMapper.deleteById(id);
    }

    @Override
    public int getCountByMap(Map<String, Object> map) throws SQLException {
        return analysisQuestionMapper.getCountByMap(map);
    }
}
