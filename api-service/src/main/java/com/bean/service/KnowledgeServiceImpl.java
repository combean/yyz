package com.bean.service;

import com.bean.dao.KnowledgeMapper;
import com.bean.model.Knowledge;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utils.MyLogger;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;


@Service("kowledgeService")
public class KnowledgeServiceImpl implements KnowledgeService {

    @Autowired
    private KnowledgeMapper knowledgeMapper;

    private MyLogger LOGGER = new MyLogger(KnowledgeServiceImpl.class);


    @Override
    public int insert(Knowledge kowledge) throws SQLException {
        return knowledgeMapper.insert(kowledge);
    }

    @Override
    public Integer update(Knowledge kowledge) throws SQLException {
        return knowledgeMapper.update(kowledge);
    }

    @Override
    public Knowledge getByMap(Map<String, Object> map) throws SQLException {
        return knowledgeMapper.getByMap(map);
    }

    @Override
    public List<Knowledge> getListByMap(Map<String, Object> map) throws SQLException {
        return knowledgeMapper.getListByMap(map);
    }

    @Override
    public Integer getCountByMap(Map<String, Object> map) throws SQLException {
        return knowledgeMapper.getCountByMap(map);
    }

    @Override
    public Knowledge getById(Integer id) throws SQLException {
        return knowledgeMapper.getById(id);
    }

    @Override
    public List<Knowledge> getListByObj(Knowledge knowledge) throws SQLException {
        return knowledgeMapper.getListByObj(knowledge);
    }
}
