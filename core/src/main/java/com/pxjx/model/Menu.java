package com.pxjx.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class Menu implements Serializable {
    /**
     * 菜单ID
     */
    private Integer menuId;

    /**
     * 菜单名称
     */
    private String menuName;

    /**
     * 父级菜单ID
     */
    private Integer menuParentId;

    /**
     * 菜单唯一标识
     */
    private String menuKey;

    /**
     * 菜单URL
     */
    private String menuUrl;

    /**
     * 菜单层级 0顶级
     */
    private Boolean menuLevel;

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

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public Integer getMenuParentId() {
        return menuParentId;
    }

    public void setMenuParentId(Integer menuParentId) {
        this.menuParentId = menuParentId;
    }

    public String getMenuKey() {
        return menuKey;
    }

    public void setMenuKey(String menuKey) {
        this.menuKey = menuKey;
    }

    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }

    public Boolean getMenuLevel() {
        return menuLevel;
    }

    public void setMenuLevel(Boolean menuLevel) {
        this.menuLevel = menuLevel;
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