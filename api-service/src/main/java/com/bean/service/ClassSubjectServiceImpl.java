package com.bean.service;

import com.bean.dao.ClassSubjectMapper;
import com.bean.model.ClassSubject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utils.MyLogger;

import java.util.List;


@Service("classSubjectService")
public class ClassSubjectServiceImpl implements ClassSubjectService {

    @Autowired
    private ClassSubjectMapper classSubjectMapper;

    private MyLogger LOGGER = new MyLogger(ClassSubjectServiceImpl.class);


    @Override
    public void insertClassSubject(List<ClassSubject> classsubject) {
        classSubjectMapper.insert(classsubject);
    }

    @Override
    public Integer deleteByClassId(Integer classId) {
        return classSubjectMapper.deleteByClassId(classId);
    }

    @Override
    public List<ClassSubject> getClassSubjectListByClassId(Integer classId) {
        return classSubjectMapper.getClassSubjectListByClassId(classId);
    }

    @Override
    public Integer deleteByClassSubjectId(Integer classId) {
        return classSubjectMapper.deleteByClassSubjectId(classId);
    }
}
