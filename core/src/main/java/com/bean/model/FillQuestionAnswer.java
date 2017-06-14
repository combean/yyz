package com.bean.model;

import java.io.Serializable;

/**
 * @author 
 */
public class FillQuestionAnswer implements Serializable {
    /**
     * 填空题答案ID
     */
    private Integer fillAnswerId;

    private Integer questionId;

    /**
     * 空序号
     */
    private String blankNo;

    /**
     * 答案内容
     */
    private String answerInfo;

    private static final long serialVersionUID = 1L;

    public Integer getFillAnswerId() {
        return fillAnswerId;
    }

    public void setFillAnswerId(Integer fillAnswerId) {
        this.fillAnswerId = fillAnswerId;
    }

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public String getBlankNo() {
        return blankNo;
    }

    public void setBlankNo(String blankNo) {
        this.blankNo = blankNo;
    }

    public String getAnswerInfo() {
        return answerInfo;
    }

    public void setAnswerInfo(String answerInfo) {
        this.answerInfo = answerInfo;
    }
}