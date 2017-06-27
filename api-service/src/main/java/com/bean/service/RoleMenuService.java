package com.bean.service;

import com.bean.model.RoleMenu;

import java.util.List;

public interface RoleMenuService {

    /**
     * 添加角色与菜单关系
     * @param roleMenu 角色与菜单关系对象
     * @return 添加条数
     */
    int insertRoleMenu(RoleMenu roleMenu);

    /**
     * 添加角色与菜单关系
     * @param roleMenu 角色与菜单关系List
     * @return 添加条数
     */
    int insertRoleMenuList(List<RoleMenu> roleMenu);

    /**
     * 编辑角色与菜单关系
     * @param roleId 角色ID
     * @return
     */
    Integer deleteByRoleId(Integer roleId);

    /**
     * 根据管理员ID获取角色菜单关系List
     * @param roleMenu 角色菜单关系对象
     * @return 角色菜单关系List
     */
    List<RoleMenu> getRoleMenuListByInfo(RoleMenu roleMenu);

    /**
     * 根据主键ID删除角色菜单关系
     * @param roleMenuId
     * @return
     */
    Integer deleteByRoleMenuId(Integer roleMenuId);

    /**
     * 获取角色菜单关系数量
     * @param roleMenu 角色菜单关系对象
     * @return
     */
    Integer getCountByInfo(RoleMenu roleMenu);
}
