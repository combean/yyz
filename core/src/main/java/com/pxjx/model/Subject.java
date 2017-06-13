package com.pxjx.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class Subject implements Serializable {
    /**
     * 科目ID
     */
    private Integer subjectId;

    /**
     * 科目名称
     */
    private String subjectName;

    /**
     * 父级ID
     */
    private Integer parentId;

    private String memo;

    /**
     * 1正常 0删除
     */
    private Boolean del;

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

    /**
     * 操作（删除）人ID
     */
    private Integer deleteid;

    /**
     * 操作（删除）人姓名
     */
    private String deletename;

    /**
     * 操作（删除）时间
     */
    private Date deletetime;

    private static final long serialVersionUID = 1L;

    private static final long serialVersionUID = 1L;

    private static final long serialVersionUID = 1L;

    private static final long serialVersionUID = 1L;

    private static final long serialVersionUID = 1L;

    private static final long serialVersionUID = 1L;

    private static final long serialVersionUID = 1L;

    private static final long serialVersionUID = 1L;

    private static final long serialVersionUID = 1L;

    private static final long serialVersionUID = 1L;

    private static final long serialVersionUID = 1L;

    private static final long serialVersionUID = 1L;

    private static final long serialVersionUID = 1L;

    private static final long serialVersionUID = 1L;

    private static final long serialVersionUID = 1L;

    private static final long serialVersionUID = 1L;

    private static final long serialVersionUID = 1L;

    private static final long serialVersionUID = 1L;

    private static final long serialVersionUID = 1L;

    private static final long serialVersionUID = 1L;

    private static final long serialVersionUID = 1L;

    private static final long serialVersionUID = 1L;

    private static final long serialVersionUID = 1L;

    private static final long serialVersionUID = 1L;

    private static final long serialVersionUID = 1L;

    private static final long serialVersionUID = 1L;

    private static final long serialVersionUID = 1L;

    private static final long serialVersionUID = 1L;

    private static final long serialVersionUID = 1L;

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public Boolean getDel() {
        return del;
    }

    public void setDel(Boolean del) {
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

    public Integer getDeleteid() {
        return deleteid;
    }

    public void setDeleteid(Integer deleteid) {
        this.deleteid = deleteid;
    }

    public String getDeletename() {
        return deletename;
    }

    public void setDeletename(String deletename) {
        this.deletename = deletename;
    }

    public Date getDeletetime() {
        return deletetime;
    }

    public void setDeletetime(Date deletetime) {
        this.deletetime = deletetime;
    }
}