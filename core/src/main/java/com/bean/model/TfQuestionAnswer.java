package com.bean.model;

import java.io.Serializable;

/**
 * @author 
 */
public class TfQuestionAnswer implements Serializable {
    /**
     * 判断题题答案ID
     */
    private Integer tfAnswerId;

    private Integer questionId;

    /**
     * 备选答案(正确\错误)
     */
    private String answerTitle;

    /**
     * 答案是否正确 0:错误 1:正确
     */
    private Boolean answerType;

    private static final long serialVersionUID = 1L;

    public Integer getTfAnswerId() {
        return tfAnswerId;
    }

    public void setTfAnswerId(Integer tfAnswerId) {
        this.tfAnswerId = tfAnswerId;
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

    public Boolean getAnswerType() {
        return answerType;
    }

    public void setAnswerType(Boolean answerType) {
        this.answerType = answerType;
    }
}