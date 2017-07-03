package com.bean.model;

import java.io.Serializable;

/**
 * @author 
 */
public class AnalysisQuestion implements Serializable {
    /**
     * 分析题 子题问题关联表
     */
    private Integer analysisQuestionId;

    /**
     * 父问题ID
     */
    private Integer fQuestionId;

    /**
     * 子问题ID
     */
    private Integer sQuestionId;

    /**
     * 父题目标题
     */
    private String fquestionTitle;

    /**
     * 父题目类型 0:单选 1:多选 2:填空 3:问答 4:分析 5:判断
     */
    private Integer fquestionType;

    /**
     * 子题目标题
     */
    private String squestionTitle;

    /**
     * 子题目类型 0:单选 1:多选 2:填空 3:问答 4:分析 5:判断
     */
    private Integer squestionType;


    private static final long serialVersionUID = 1L;

    public Integer getAnalysisQuestionId() {
        return analysisQuestionId;
    }

    public void setAnalysisQuestionId(Integer analysisQuestionId) {
        this.analysisQuestionId = analysisQuestionId;
    }

    public Integer getfQuestionId() {
        return fQuestionId;
    }

    public void setfQuestionId(Integer fQuestionId) {
        this.fQuestionId = fQuestionId;
    }

    public Integer getsQuestionId() {
        return sQuestionId;
    }

    public void setsQuestionId(Integer sQuestionId) {
        this.sQuestionId = sQuestionId;
    }

    public String getFquestionTitle() {
        return fquestionTitle;
    }

    public void setFquestionTitle(String fquestionTitle) {
        this.fquestionTitle = fquestionTitle;
    }

    public Integer getFquestionType() {
        return fquestionType;
    }

    public void setFquestionType(Integer fquestionType) {
        this.fquestionType = fquestionType;
    }

    public String getSquestionTitle() {
        return squestionTitle;
    }

    public void setSquestionTitle(String squestionTitle) {
        this.squestionTitle = squestionTitle;
    }

    public Integer getSquestionType() {
        return squestionType;
    }

    public void setSquestionType(Integer squestionType) {
        this.squestionType = squestionType;
    }
}