package com.bean.dao;

import com.bean.model.CourseKnowledge;
import mybatis.basemapper.BaseMapper;

import java.util.List;

public interface CourseKnowledgeMapper extends BaseMapper<CourseKnowledge> {

    int deleteByCourseId(Integer courseId);

}