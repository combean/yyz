package com.bean.service;

import com.bean.model.CourseKnowledge;

import java.util.List;

public interface CourseKnowledgeService {

    /**
     * 添加课程知识点关系
     * @param courseKnowledge 添加课程知识点关系对象
     * @return 添加条数
     */
    int insertCourseKnowledge(CourseKnowledge courseKnowledge);

    /**
     * 添加课程知识点关系
     * @param courseKnowledge 添加课程知识点关系List
     * @return 添加条数
     */
    int insertCourseKnowledgeList(List<CourseKnowledge> courseKnowledge);

    /**
     * 删除课程知识点关系
     * @param courseId 课程ID
     * @return
     */
    Integer deleteByCourseId(Integer courseId);

    /**
     * 根据课程ID获取课程知识点对应关系List
     * @param courseKnowledge 课程ID
     * @return 课程知识点对应关系List
     */
    List<CourseKnowledge> getCourseKnowledgeListByInfo(CourseKnowledge courseKnowledge);

    /**
     * 根据主键ID删除课程知识点对应关系
     * @param courseKnowledgeId
     * @return
     */
    Integer deleteByCourseKnowledgeId(Integer courseKnowledgeId);

    /**
     * 获取课程知识点对应关系数量
     * @param courseKnowledge 课程知识点对应关系对象
     * @return
     */
    Integer getCountByInfo(CourseKnowledge courseKnowledge);
}
