package com.bean.service;

import com.bean.dao.ClassSubjectMapper;
import com.bean.model.ClassSubject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utils.MyLogger;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;


@Service("classSubjectService")
public class ClassSubjectServiceImpl implements ClassSubjectService {

    @Autowired
    private ClassSubjectMapper classSubjectMapper;

    private MyLogger LOGGER = new MyLogger(ClassSubjectServiceImpl.class);


    @Override
    public int insertList(List<ClassSubject> classSubject) throws SQLException {
        return classSubjectMapper.insertList(classSubject);
    }

    @Override
    public int insert(ClassSubject classSubject) throws SQLException {
        return classSubjectMapper.insert(classSubject);
    }

    @Override
    public Integer deleteByClassId(Integer classId) {
        return classSubjectMapper.deleteByClassId(classId);
    }

    @Override
    public List<ClassSubject> getListByMap(Map<String, Object> map) throws SQLException {
        return classSubjectMapper.getListByMap(map);
    }

    @Override
    public Integer deleteById(Integer id) throws SQLException {
        return classSubjectMapper.deleteById(id);
    }

    @Override
    public int getCountByMap(Map<String, Object> map) throws SQLException {
        return classSubjectMapper.getCountByMap(map);
    }
}
