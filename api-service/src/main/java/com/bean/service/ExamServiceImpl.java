package com.bean.service;

import com.bean.dao.ExamMapper;
import com.bean.model.Exam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utils.MyLogger;
import java.util.List;
import java.util.Map;


@Service("examService")
public class ExamServiceImpl implements ExamService {

    @Autowired
    private ExamMapper examMapper;

    private MyLogger LOGGER = new MyLogger(ExamServiceImpl.class);


    @Override
    public int insertExam(Exam exam) {
        return examMapper.insert(exam);
    }

    @Override
    public Integer updateExam(Exam exam) {
        return examMapper.update(exam);
    }

    @Override
    public Exam getExamByInfo(Map<String, String> map) {
        return examMapper.getExamByInfo(map);
    }

    @Override
    public List<Exam> getExamListByInfo(Map<String, String> map) {
        return examMapper.getExamListByInfo(map);
    }

    @Override
    public Integer getExamCountByInfo(Map<String, String> map) {
        return examMapper.getExamCountByInfo(map);
    }
}
