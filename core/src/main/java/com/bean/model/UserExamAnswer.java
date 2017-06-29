package com.bean.model;

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

    /**
     * 考题ID
     */
    private Integer questionId;

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
    private Integer ifRight;

    /**
     * 回答时间
     */
    private Date answerTime;

    /**
     * 修改答案时间
     */
    private Date answerEditTime;

    /**
     * 分值
     */
    private float rawScore;

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

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
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

    public Integer getIfRight() {
        return ifRight;
    }

    public void setIfRight(Integer ifRight) {
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

    public float getRawScore() {
        return rawScore;
    }

    public void setRawScore(float rawScore) {
        this.rawScore = rawScore;
    }
}