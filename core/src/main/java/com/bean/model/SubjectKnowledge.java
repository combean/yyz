package com.bean.model;

import java.io.Serializable;

/**
 * @author 
 */
public class SubjectKnowledge implements Serializable {
    private Integer subjectKnowledgeId;

    /**
     * 课程ID
     */
    private Integer subjectId;

    /**
     * 知识点ID
     */
    private Integer knowledgeId;

    /**
     * 课程名称
     */
    private String subjectName;

    /**
     * 知识点名称
     */
    private String knowledgeName;

    private static final long serialVersionUID = 1L;

    public Integer getSubjectKnowledgeId() {
        return subjectKnowledgeId;
    }

    public void setSubjectKnowledgeId(Integer subjectKnowledgeId) {
        this.subjectKnowledgeId = subjectKnowledgeId;
    }

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    public Integer getKnowledgeId() {
        return knowledgeId;
    }

    public void setKnowledgeId(Integer knowledgeId) {
        this.knowledgeId = knowledgeId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getKnowledgeName() {
        return knowledgeName;
    }

    public void setKnowledgeName(String knowledgeName) {
        this.knowledgeName = knowledgeName;
    }
}