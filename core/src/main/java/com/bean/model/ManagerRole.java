package com.bean.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 */
public class ManagerRole implements Serializable {
    private Integer managerRoleId;

    /**
     * 管理员ID
     */
    private Integer managerId;

    /**
     * 角色ID
     */
    private Integer roleId;

    /**
     * 管理员用户名
     */
    private String managerUsername;

    /**
     * 管理员姓名
     */
    private String managerName;

    /**
     * 角色名称
     */
    private String roleName;

    /**
     * 角色KEY
     */
    private String roleKey;

    private static final long serialVersionUID = 1L;

    public Integer getManagerRoleId() {
        return managerRoleId;
    }

    public void setManagerRoleId(Integer managerRoleId) {
        this.managerRoleId = managerRoleId;
    }

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getManagerUsername() {
        return managerUsername;
    }

    public void setManagerUsername(String managerUsername) {
        this.managerUsername = managerUsername;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleKey() {
        return roleKey;
    }

    public void setRoleKey(String roleKey) {
        this.roleKey = roleKey;
    }
}