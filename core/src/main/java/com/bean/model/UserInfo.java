package com.bean.model;

import java.io.Serializable;

/**
 * @author 
 */
public class UserInfo implements Serializable {
    private Integer userInfoId;

    /**
     * 用户/学员ID
     */
    private Integer userId;

    /**
     * 用户/学员手机
     */
    private String userMobile;

    /**
     * 用户/学员姓名
     */
    private String userName;

    /**
     * 用户/学员头像地址
     */
    private String userProfileImg;

    /**
     * 用户/学员性别 1:男 0:女
     */
    private Boolean userSex;

    private static final long serialVersionUID = 1L;

    public Integer getUserInfoId() {
        return userInfoId;
    }

    public void setUserInfoId(Integer userInfoId) {
        this.userInfoId = userInfoId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserProfileImg() {
        return userProfileImg;
    }

    public void setUserProfileImg(String userProfileImg) {
        this.userProfileImg = userProfileImg;
    }

    public Boolean getUserSex() {
        return userSex;
    }

    public void setUserSex(Boolean userSex) {
        this.userSex = userSex;
    }
}