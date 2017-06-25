package com.bean.service;

import com.bean.dao.SubjectMapper;
import com.bean.model.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utils.MyLogger;

import java.util.List;
import java.util.Map;


@Service("subjectService")
public class SubjectServiceImpl implements SubjectService {

    @Autowired
    private SubjectMapper subjectMapper;

    private MyLogger LOGGER = new MyLogger(SubjectServiceImpl.class);


    @Override
    public int insertSubject(Subject subject) {
        return subjectMapper.insert(subject);
    }

    @Override
    public Integer updateSubject(Subject subject) {
        return subjectMapper.update(subject);
    }

    @Override
    public Subject getSubjectByInfo(Map<String, String> map) {
        return subjectMapper.getSubjectByInfo(map);
    }

    @Override
    public List<Subject> getSubjectListByInfo(Map<String, String> map) {
        return subjectMapper.getSubjectListByInfo(map);
    }

    @Override
    public Integer getSubjectCountByInfo(Map<String, String> map) {
        return subjectMapper.getSubjectCountByInfo(map);
    }
}
