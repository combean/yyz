package com.bean.dao;

import com.bean.model.CourseKnowledge;
import java.util.List;

public interface CourseKnowledgeMapper {
    int insert(CourseKnowledge courseKnowledge);

    int insertList(List<CourseKnowledge> courseKnowledge);

    Integer deleteByCourseId(Integer courseId);

    List<CourseKnowledge> getCourseKnowledgeListByInfo(CourseKnowledge courseKnowledge);

    Integer deleteByCourseKnowledgeId(Integer courseKnowledgeId);

    int getCountByInfo (CourseKnowledge courseKnowledge);
}