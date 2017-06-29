package com.bean.service;

import com.bean.model.Manager;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface ManagerService {
    /**
     * 添加管理员
     * @param manager 管理员对象
     * @return 插入条数
     *
     * 插入数据的主键 Manager.getManagerId();
     */
    int insert(Manager manager) throws SQLException;

    /**
     * 编辑/删除管理员
     * @param manager 管理员对象
     * @return boolean
     *
     * 删除时 setDel(0)
     */
    Integer update(Manager manager) throws SQLException;

    /**
     * 根据传入的map信息获取管理员对象
     * @param map key 为Manager属性
     * @return 管理员对象
     */
    Manager getByMap(Map<String, Object> map) throws SQLException;

    /**
     * 根据传入的map信息获取管理员List
     * @param map key 为Manager属性
     * @return List<Manager>
     */
    List<Manager> getListByMap(Map<String, Object> map) throws SQLException;

    /**
     * 根据条件获取管理员数量
     * @param map key 为Manager属性
     * @return
     */
    Integer getCountByMap(Map<String, Object> map) throws SQLException;

    Manager getById(Integer id) throws SQLException;
}
