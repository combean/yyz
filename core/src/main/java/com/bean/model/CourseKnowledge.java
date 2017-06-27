package com.bean.model;

import java.io.Serializable;

/**
 * @author 
 */
public class CourseKnowledge implements Serializable {
    private Integer courseKnowledgeId;

    /**
     * 课程ID
     */
    private Integer courseId;

    /**
     * 知识点ID
     */
    private Integer knowledgeId;

    /**
     * 课程名称
     */
    private String courseName;

    /**
     * 知识点名称
     */
    private String knowledgeName;

    private static final long serialVersionUID = 1L;

    public Integer getCourseKnowledgeId() {
        return courseKnowledgeId;
    }

    public void setCourseKnowledgeId(Integer courseKnowledgeId) {
        this.courseKnowledgeId = courseKnowledgeId;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public Integer getKnowledgeId() {
        return knowledgeId;
    }

    public void setKnowledgeId(Integer knowledgeId) {
        this.knowledgeId = knowledgeId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getKnowledgeName() {
        return knowledgeName;
    }

    public void setKnowledgeName(String knowledgeName) {
        this.knowledgeName = knowledgeName;
    }
}