package com.bean.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class Content implements Serializable {

    /**
     * 课程内容/课件ID
     */
    private Integer contentId;

    /**
     * 课程内容/课件名称
     */
    private String contentName;

    /**
     * 内容/课件内容
     */
    private String contentInfo;

    /**
     * 0:普通内容 1:PPT 2:视频 3:音频
     */
    private Integer contentType;

    /**
     * 课程ID
     */
    private Integer courseId;

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

    public Integer getContentId() {
        return contentId;
    }

    public void setContentId(Integer contentId) {
        this.contentId = contentId;
    }

    public String getContentName() {
        return contentName;
    }

    public void setContentName(String contentName) {
        this.contentName = contentName;
    }

    public String getContentInfo() {
        return contentInfo;
    }

    public void setContentInfo(String contentInfo) {
        this.contentInfo = contentInfo;
    }

    public Integer getContentType() {
        return contentType;
    }

    public void setContentType(Integer contentType) {
        this.contentType = contentType;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
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