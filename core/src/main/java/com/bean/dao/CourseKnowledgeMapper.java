package com.bean.dao;

import com.bean.model.CourseKnowledge;
import mybatis.basemapper.BaseMapper;

import java.sql.SQLException;
import java.util.List;

public interface CourseKnowledgeMapper extends BaseMapper<CourseKnowledge> {

    int deleteByCourseId(Integer courseId) throws SQLException;

    List<CourseKnowledge> getListByCourseId(Integer courseId) throws SQLException;

}