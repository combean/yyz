package com.bean.service;

import com.bean.dao.ClassSubjectMapper;
import com.bean.dao.UClassMapper;
import com.bean.model.ClassSubject;
import com.bean.model.UClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utils.MyLogger;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;


@Service("uClassService")
public class UClassServiceImpl implements UClassService {

    @Autowired
    private UClassMapper uClassMapper;

    @Autowired
    private ClassSubjectMapper classSubjectMapper;

    private MyLogger LOGGER = new MyLogger(UClassServiceImpl.class);


    @Override
    public int insert(UClass uClass) throws SQLException {
        return uClassMapper.insert(uClass);
    }

    @Override
    public int update(UClass uClass) throws SQLException {
        return uClassMapper.update(uClass);
    }

    @Override
    public UClass getByMap(Map<String, Object> map) throws SQLException {
        return uClassMapper.getByMap(map);
    }

    @Override
    public List<UClass> getListByMap(Map<String, Object> map) throws SQLException {
        return uClassMapper.getListByMap(map);
    }

    @Override
    public int getCountByMap(Map<String, Object> map) throws SQLException {
        return uClassMapper.getCountByMap(map);
    }

    @Override
    public UClass getById(int id) throws SQLException{
        return uClassMapper.getById(id);
    }

    @Override
    public int insertClassSubject(UClass uClass, List<ClassSubject> classSubjects) throws SQLException {
        uClassMapper.insert(uClass);
        for (ClassSubject cs: classSubjects) {
            cs.setClassId(uClass.getClassId());
        }
        return classSubjectMapper.insertList(classSubjects);
    }

    @Override
    public int updateClassSubject(UClass uClass, List<ClassSubject> classSubjects) throws SQLException {
        uClassMapper.update(uClass);
        for (ClassSubject cs: classSubjects) {
            cs.setClassId(uClass.getClassId());
        }
        classSubjectMapper.deleteByClassId(uClass.getClassId());
        return classSubjectMapper.insertList(classSubjects);
    }
}
