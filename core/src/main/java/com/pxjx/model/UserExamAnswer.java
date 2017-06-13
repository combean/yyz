package com.pxjx.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class UserExamAnswer implements Serializable {
    private Integer userExamAnswerId;

    /**
     * 用户ID
     */
    private Integer userId;

    /**
     * 考卷ID
     */
    private Integer paperId;

    private Integer pqtQuestionId;

    /**
     * 填空题中空的序号
     */
    private Integer blankNo;

    /**
     * 答题内容
     */
    private String answerInfo;

    /**
     * 是否正确 0:错误 1:正确
     */
    private Boolean ifRight;

    /**
     * 回答时间
     */
    private Date answerTime;

    /**
     * 修改答案时间
     */
    private Date answerEditTime;

    private static final long serialVersionUID = 1L;

    public Integer getUserExamAnswerId() {
        return userExamAnswerId;
    }

    public void setUserExamAnswerId(Integer userExamAnswerId) {
        this.userExamAnswerId = userExamAnswerId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getPaperId() {
        return paperId;
    }

    public void setPaperId(Integer paperId) {
        this.paperId = paperId;
    }

    public Integer getPqtQuestionId() {
        return pqtQuestionId;
    }

    public void setPqtQuestionId(Integer pqtQuestionId) {
        this.pqtQuestionId = pqtQuestionId;
    }

    public Integer getBlankNo() {
        return blankNo;
    }

    public void setBlankNo(Integer blankNo) {
        this.blankNo = blankNo;
    }

    public String getAnswerInfo() {
        return answerInfo;
    }

    public void setAnswerInfo(String answerInfo) {
        this.answerInfo = answerInfo;
    }

    public Boolean getIfRight() {
        return ifRight;
    }

    public void setIfRight(Boolean ifRight) {
        this.ifRight = ifRight;
    }

    public Date getAnswerTime() {
        return answerTime;
    }

    public void setAnswerTime(Date answerTime) {
        this.answerTime = answerTime;
    }

    public Date getAnswerEditTime() {
        return answerEditTime;
    }

    public void setAnswerEditTime(Date answerEditTime) {
        this.answerEditTime = answerEditTime;
    }
}