package com.bean.dao;

import com.bean.model.ClassSubject;
import java.util.List;

public interface ClassSubjectMapper {

    void insert(List<ClassSubject> record);

    boolean deleteByClassId(Integer classId);
}