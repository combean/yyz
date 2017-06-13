package com.pxjx.model;

import java.io.Serializable;

/**
 * @author 
 */
public class MangerInfo implements Serializable {
    private Integer managerInfoId;

    /**
     * 管理员ID
     */
    private Integer managerId;

    private String managerMobile;

    /**
     * 管理员姓名
     */
    private String managerName;

    /**
     * 管理员头像地址
     */
    private String managerProfileImg;

    private static final long serialVersionUID = 1L;

    public Integer getManagerInfoId() {
        return managerInfoId;
    }

    public void setManagerInfoId(Integer managerInfoId) {
        this.managerInfoId = managerInfoId;
    }

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    public String getManagerMobile() {
        return managerMobile;
    }

    public void setManagerMobile(String managerMobile) {
        this.managerMobile = managerMobile;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public String getManagerProfileImg() {
        return managerProfileImg;
    }

    public void setManagerProfileImg(String managerProfileImg) {
        this.managerProfileImg = managerProfileImg;
    }
}