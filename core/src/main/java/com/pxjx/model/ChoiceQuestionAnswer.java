package com.pxjx.model;

import java.io.Serializable;

/**
 * @author 
 */
public class ChoiceQuestionAnswer implements Serializable {
    /**
     * 选择题答案ID
     */
    private Integer choiceAnswerId;

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
     * 答案是否正确 0:错误 1:正确
     */
    private Boolean answerType;

    private static final long serialVersionUID = 1L;

    public Integer getChoiceAnswerId() {
        return choiceAnswerId;
    }

    public void setChoiceAnswerId(Integer choiceAnswerId) {
        this.choiceAnswerId = choiceAnswerId;
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

    public Boolean getAnswerType() {
        return answerType;
    }

    public void setAnswerType(Boolean answerType) {
        this.answerType = answerType;
    }
}