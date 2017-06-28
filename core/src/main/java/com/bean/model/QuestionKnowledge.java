package com.bean.model;

import java.io.Serializable;

/**
 * @author 
 */
public class QuestionKnowledge implements Serializable {
    private Integer questionKnowledgeId;

    /**
     * 题目ID
     */
    private Integer questionId;

    /**
     * 知识点ID
     */
    private Integer knowledgeId;

    /**
     * 试题题干
     */
    private String questionTitle;

    /**
     * 知识点
     */
    private String knowledgeName;

    private static final long serialVersionUID = 1L;

    public Integer getQuestionKnowledgeId() {
        return questionKnowledgeId;
    }

    public void setQuestionKnowledgeId(Integer questionKnowledgeId) {
        this.questionKnowledgeId = questionKnowledgeId;
    }

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public Integer getKnowledgeId() {
        return knowledgeId;
    }

    public void setKnowledgeId(Integer knowledgeId) {
        this.knowledgeId = knowledgeId;
    }

    public String getQuestionTitle() {
        return questionTitle;
    }

    public void setQuestionTitle(String questionTitle) {
        this.questionTitle = questionTitle;
    }

    public String getKnowledgeName() {
        return knowledgeName;
    }

    public void setKnowledgeName(String knowledgeName) {
        this.knowledgeName = knowledgeName;
    }
}