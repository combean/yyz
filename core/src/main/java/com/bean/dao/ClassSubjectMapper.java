package com.bean.dao;

import com.bean.model.ClassSubject;
import java.util.List;

public interface ClassSubjectMapper {

    void insert(List<ClassSubject> record);

    Integer deleteByClassId(Integer classId);

    List<ClassSubject> getClassSubjectListByClassId(Integer classId);

    Integer deleteByClassSubjectId(Integer classId);
}