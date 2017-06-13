package com.pxjx.model;

import java.io.Serializable;

/**
 * @author 
 */
public class UserExam implements Serializable {
    private Integer userExamId;

    /**
     * 用户ID
     */
    private Integer userId;

    private Integer examId;

    private static final long serialVersionUID = 1L;

    public Integer getUserExamId() {
        return userExamId;
    }

    public void setUserExamId(Integer userExamId) {
        this.userExamId = userExamId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getExamId() {
        return examId;
    }

    public void setExamId(Integer examId) {
        this.examId = examId;
    }
}