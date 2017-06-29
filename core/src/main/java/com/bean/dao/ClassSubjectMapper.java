package com.bean.dao;

import com.bean.model.ClassSubject;
import mybatis.basemapper.BaseMapper;

import java.util.List;

public interface ClassSubjectMapper extends BaseMapper<ClassSubject>{

    int deleteByClassId(Integer classId);

}