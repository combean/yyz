package com.bean.service;

import com.bean.dao.PaperQuestionTypeMapper;
import com.bean.model.PaperQuestionType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utils.MyLogger;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;


@Service("qaperQuestionTypeService")
public class PaperQuestionTypeServiceImpl implements PaperQuestionTypeService {

    @Autowired
    private PaperQuestionTypeMapper qaperQuestionTypeMapper;

    private MyLogger LOGGER = new MyLogger(PaperQuestionTypeServiceImpl.class);

    @Override
    public int insertList(List<PaperQuestionType> qaperQuestionType) throws SQLException {
        return qaperQuestionTypeMapper.insertList(qaperQuestionType);
    }

    @Override
    public int insert(PaperQuestionType qaperQuestionType) throws SQLException {
        return qaperQuestionTypeMapper.insert(qaperQuestionType);
    }

    @Override
    public int deleteByPaperId(Integer paperId) {
        return qaperQuestionTypeMapper.deleteByPaperId(paperId);
    }

    @Override
    public List<PaperQuestionType> getListByMap(Map<String,Object> map) throws SQLException {
        return qaperQuestionTypeMapper.getListByMap(map);
    }

    @Override
    public Integer deleteById(Integer id) throws SQLException {
        return qaperQuestionTypeMapper.deleteById(id);
    }

    @Override
    public Integer getCountByMap(Map<String,Object> map) throws SQLException {
        return qaperQuestionTypeMapper.getCountByMap(map);
    }
}
