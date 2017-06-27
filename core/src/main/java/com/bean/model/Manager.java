package com.bean.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class Manager implements Serializable {
    /**
     * 管理员ID
     */
    private Integer managerId;

    /**
     * 管理员用户名
     */
    private String managerUsername;

    /**
     * 管理员登陆密码
     */
    private String managerPassword;

    /**
     * 管理员手机号码
     */
    private String managerMobile;

    /**
     * 管理员姓名
     */
    private String managerName;

    /**
     * 管理员性别
     */
    private Integer managerSex;

    /**
     * 管理员头像地址
     */
    private String managerProfileImg;

    /**
     * 管理员邮箱地址
     */
    private String managerEmail;

    private String memo;

    /**
     * 1正常 0删除
     */
    private Integer del;

    /**
     * 添加人
     */
    private String addname;

    /**
     * 添加人的ID
     */
    private Integer addid;

    /**
     * 添加时间
     */
    private Date addtime;

    /**
     * 编辑人用户名
     */
    private String editname;

    /**
     * 编辑ID
     */
    private Integer editid;

    /**
     * 编辑时间
     */
    private Date edittime;


    private static final long serialVersionUID = 1L;

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    public String getManagerUsername() {
        return managerUsername;
    }

    public void setManagerUsername(String managerUsername) {
        this.managerUsername = managerUsername;
    }

    public String getManagerPassword() {
        return managerPassword;
    }

    public void setManagerPassword(String managerPassword) {
        this.managerPassword = managerPassword;
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

    public Integer getManagerSex() {
        return managerSex;
    }

    public void setManagerSex(Integer managerSex) {
        this.managerSex = managerSex;
    }

    public String getManagerProfileImg() {
        return managerProfileImg;
    }

    public void setManagerProfileImg(String managerProfileImg) {
        this.managerProfileImg = managerProfileImg;
    }

    public String getManagerEmail() {
        return managerEmail;
    }

    public void setManagerEmail(String managerEmail) {
        this.managerEmail = managerEmail;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public Integer getDel() {
        return del;
    }

    public void setDel(Integer del) {
        this.del = del;
    }

    public String getAddname() {
        return addname;
    }

    public void setAddname(String addname) {
        this.addname = addname;
    }

    public Integer getAddid() {
        return addid;
    }

    public void setAddid(Integer addid) {
        this.addid = addid;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public String getEditname() {
        return editname;
    }

    public void setEditname(String editname) {
        this.editname = editname;
    }

    public Integer getEditid() {
        return editid;
    }

    public void setEditid(Integer editid) {
        this.editid = editid;
    }

    public Date getEdittime() {
        return edittime;
    }

    public void setEdittime(Date edittime) {
        this.edittime = edittime;
    }
}