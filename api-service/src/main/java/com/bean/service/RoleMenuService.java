package com.bean.service;

import com.bean.model.RoleMenu;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface RoleMenuService {

    /**
     * 添加角色与菜单关系
     * @param roleMenu 角色与菜单关系对象
     * @return 添加条数
     */
    int insert(RoleMenu roleMenu) throws SQLException;

    /**
     * 添加角色与菜单关系
     * @param roleMenu 角色与菜单关系List
     * @return 添加条数
     */
    int insertList(List<RoleMenu> roleMenu) throws SQLException;

    /**
     * 编辑角色与菜单关系
     * @param roleId 角色ID
     * @return
     */
    Integer deleteByRoleId(Integer roleId);

    /**
     * 根据管理员ID获取角色菜单关系List
     * @param map
     * @return 角色菜单关系List
     */
    List<RoleMenu> getListByMap(Map<String,Object> map) throws SQLException;

    /**
     * 根据主键ID删除角色菜单关系
     * @param id 主键
     * @return
     */
    int deleteById(Integer id) throws SQLException;

    /**
     * 获取角色菜单关系数量
     * @param map
     * @return
     */
    int getCountByMap(Map<String,Object> map) throws SQLException;
}
