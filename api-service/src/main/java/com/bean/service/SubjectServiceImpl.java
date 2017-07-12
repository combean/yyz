package com.bean.service;

import com.bean.dao.SubjectKnowledgeMapper;
import com.bean.dao.SubjectMapper;
import com.bean.model.Subject;
import com.bean.model.SubjectKnowledge;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utils.MyLogger;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;


@Service("subjectService")
public class SubjectServiceImpl implements SubjectService {

    @Autowired
    private SubjectMapper subjectMapper;

    @Autowired
    private SubjectKnowledgeMapper subjectKnowledgeMapper;

    private MyLogger LOGGER = new MyLogger(SubjectServiceImpl.class);


    @Override
    public int insert(Subject subject) throws SQLException {
        return subjectMapper.insert(subject);
    }

    @Override
    public Integer update(Subject subject) throws SQLException {
        return subjectMapper.update(subject);
    }

    @Override
    public Subject getByMap(Map<String, Object> map) throws SQLException {
        return subjectMapper.getByMap(map);
    }

    @Override
    public List<Subject> getListByMap(Map<String, Object> map) throws SQLException {
        return subjectMapper.getListByMap(map);
    }

    @Override
    public Integer getCountByMap(Map<String, Object> map) throws SQLException {
        return subjectMapper.getCountByMap(map);
    }

    @Override
    public Subject getById(int id) throws SQLException {
        return subjectMapper.getById(id);
    }

    @Override
    public int insertSubjectKnowledge(Subject subject, List<SubjectKnowledge> subjectKnowledges) throws SQLException {
        subjectMapper.insert(subject);
        for (SubjectKnowledge sk: subjectKnowledges) {
            sk.setSubjectId(subject.getSubjectId());
        }
        return subjectKnowledgeMapper.insertList(subjectKnowledges);
    }

    @Override
    public int updateSubjectKnowledge(Subject subject, List<SubjectKnowledge> subjectKnowledges) throws SQLException {
        subjectMapper.update(subject);
        for (SubjectKnowledge sk: subjectKnowledges) {
            sk.setSubjectId(subject.getSubjectId());
        }
        subjectKnowledgeMapper.deleteBySubjectId(subject.getSubjectId());
        return subjectKnowledgeMapper.insertList(subjectKnowledges);
    }
}
