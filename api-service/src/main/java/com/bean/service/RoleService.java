package com.bean.service;

import com.bean.model.Role;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface RoleService {
    /**
     * 添加角色
     * @param role 角色对象
     * @return 插入条数
     *
     * 插入数据的主键 Role.getRoleId();
     */
    int insert(Role role) throws SQLException;

    /**
     * 编辑/删除角色
     * @param role 角色对象
     * @return boolean
     *
     * 删除时 setDel(0)
     */
    int update(Role role) throws SQLException;

    /**
     * 根据传入的map信息获取角色对象
     * @param map key 为Role属性
     * @return 角色对象
     */
    Role getByMap(Map<String, Object> map) throws SQLException;

    /**
     * 根据传入的map信息获取角色List
     * @param map key 为Role属性
     * @return List<Role>
     */
    List<Role> getListByMap(Map<String, Object> map) throws SQLException;

    /**
     * 根据条件获取角色数量
     * @param map key 为Role属性
     * @return
     */
    int getCountByMap(Map<String, Object> map) throws SQLException;

    Role getById(Integer id) throws SQLException;
}
