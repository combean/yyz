package com.pxjx.model;

import java.io.Serializable;

/**
 * @author 
 */
public class UserClass implements Serializable {
    private Integer userClassId;

    /**
     * 用户ID
     */
    private Integer userId;

    /**
     * 班级ID
     */
    private Integer classId;

    private static final long serialVersionUID = 1L;

    public Integer getUserClassId() {
        return userClassId;
    }

    public void setUserClassId(Integer userClassId) {
        this.userClassId = userClassId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }
}