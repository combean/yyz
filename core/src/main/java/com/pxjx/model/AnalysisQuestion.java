package com.pxjx.model;

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
}