package com.bean.service;

import com.bean.dao.SubjectMapper;
import com.bean.model.Subject;
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
}
