package com.bean.service;

import com.bean.dao.SubjectKnowledgeMapper;
import com.bean.model.SubjectKnowledge;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utils.MyLogger;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;


@Service("subjectKnowledgeService")
public class SubjectKnowledgeServiceImpl implements SubjectKnowledgeService {

    @Autowired
    private SubjectKnowledgeMapper subjectKnowledgeMapper;

    private MyLogger LOGGER = new MyLogger(SubjectKnowledgeServiceImpl.class);

    @Override
    public int insertList(List<SubjectKnowledge> subjectKnowledge) throws SQLException {
        return subjectKnowledgeMapper.insertList(subjectKnowledge);
    }

    @Override
    public int insert(SubjectKnowledge subjectKnowledge) throws SQLException {
        return subjectKnowledgeMapper.insert(subjectKnowledge);
    }

    @Override
    public int deleteBySubjectId(Integer subjectId) {
        return subjectKnowledgeMapper.deleteBySubjectId(subjectId);
    }

    @Override
    public List<SubjectKnowledge> getListByMap(Map<String, Object> map) throws SQLException {
        return subjectKnowledgeMapper.getListByMap(map);
    }

    @Override
    public int deleteById(Integer id) throws SQLException {
        return subjectKnowledgeMapper.deleteById(id);
    }

    @Override
    public int getCountByMap(Map<String, Object> map) throws SQLException {
        return subjectKnowledgeMapper.getCountByMap(map);
    }

    @Override
    public List<SubjectKnowledge> getListBySubjectId(Integer subjectId) throws SQLException {
        return subjectKnowledgeMapper.getListBySubjectId(subjectId);
    }
}
