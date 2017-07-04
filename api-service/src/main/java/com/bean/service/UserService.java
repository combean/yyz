package com.bean.service;

import com.bean.model.User;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface UserService {
    /**
     * 添加用户
     * @param user 用户对象
     * @return 插入条数
     *
     * 插入数据的主键 User.getUserId();
     */
    int insert(User user) throws SQLException;

    /**
     * 编辑/删除用户
     * @param user 用户对象
     * @return boolean
     *
     * 删除时 setDel(0)
     */
    int update(User user) throws SQLException;

    /**
     * 根据传入的map信息获取用户对象
     * @param map key 为User属性
     * @return 用户对象
     */
    User getByMap(Map<String,Object> map) throws SQLException;

    /**
     * 根据传入的map信息获取用户List
     * @param map key 为User属性
     * @return List<User>
     */
    List<User> getListByMap(Map<String,Object> map) throws SQLException;

    /**
     * 根据条件获取用户数量
     * @param map key 为User属性
     * @return
     */
    int getCountByMap(Map<String,Object> map) throws SQLException;

    /**
     * 根据主键ID获取用户对象
     * @param id 主键ID
     * @return
     * @throws SQLException
     */
    User getById(int id) throws SQLException;

    User getByParameter(String str) throws SQLException;

    User getByObj(User user) throws SQLException;
}
