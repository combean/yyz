package com.bean.dao;

import java.util.List;
import java.util.Map;
import com.bean.model.Exam;

public interface ExamMapper {
    int insert(Exam exam);

    Integer update(Exam exam);

    Exam getExamByInfo(Map<String,String> map);

    List<Exam> getExamListByInfo(Map<String,String> map);

    Integer getExamCountByInfo(Map<String,String> map);
}