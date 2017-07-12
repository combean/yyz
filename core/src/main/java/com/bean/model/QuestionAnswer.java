package com.bean.model;

import java.io.Serializable;

/**
 * @author 
 */
public class QuestionAnswer implements Serializable {
    /**
     * 选择题答案ID
     */
    private Integer answerId;

    private Integer questionId;

    /**
     * 选择题选项 例如: A B C
     */
    private String answerTitle;

    /**
     * 答案内容
     */
    private String answerInfo;

    /**
     * 填空题 空序号
     */
    private Integer blankNo;

    /**
     * 答案是否正确 0:错误 1:正确
     */
    private Integer answerType;

    private static final long serialVersionUID = 1L;

    public Integer getAnswerId() {
        return answerId;
    }

    public void setAnswerId(Integer answerId) {
        this.answerId = answerId;
    }

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public String getAnswerTitle() {
        return answerTitle;
    }

    public void setAnswerTitle(String answerTitle) {
        this.answerTitle = answerTitle;
    }

    public String getAnswerInfo() {
        return answerInfo;
    }

    public void setAnswerInfo(String answerInfo) {
        this.answerInfo = answerInfo;
    }

    public Integer getAnswerType() {
        return answerType;
    }

    public void setAnswerType(Integer answerType) {
        this.answerType = answerType;
    }

    public Integer getBlankNo() {
        return blankNo;
    }

    public void setBlankNo(Integer blankNo) {
        this.blankNo = blankNo;
    }
}