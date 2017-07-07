package com.bean.service;

import com.bean.model.ManagerRole;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface ManagerRoleService {

    /**
     * 添加管理员角色关系
     * @param managerRole 添加管理员角色关系对象
     * @return 添加条数
     */
    int insert(ManagerRole managerRole) throws SQLException;

    /**
     * 添加管理员角色关系
     * @param managerRole 添加管理员角色关系List
     * @return 添加条数
     */
    int insertList(List<ManagerRole> managerRole) throws SQLException;

    /**
     * 编辑管理员角色关系
     * @param managerId 管理员ID
     * @return
     */
    int deleteByManagerId(Integer managerId);

    /**
     * 根据管理员ID获取管理员角色对应关系List
     * @param map
     * @return 管理员角色对应关系List
     */
    List<ManagerRole> getListByMap(Map<String, Object> map) throws SQLException;

    /**
     * 根据主键ID删除管理员角色对应关系
     * @param id 主键
     * @return
     */
    int deleteById(Integer id) throws SQLException;

    /**
     * 获取管理员角色对应关系数量
     * @param map
     * @return
     */
    int getCountByMap(Map<String, Object> map) throws SQLException;
}
