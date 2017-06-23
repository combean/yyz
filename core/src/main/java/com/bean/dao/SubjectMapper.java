package com.bean.dao;

import com.bean.model.Subject;
import java.util.List;
import java.util.Map;

public interface SubjectMapper {
    int insert(Subject subject);

    Integer update(Subject subject);

    Subject getSubjectByInfo(Map<String,String> map);

    List<Subject> getSubjectListByInfo(Map<String,String> map);

    Integer getSubjectCountByInfo(Map<String,String> map);
}