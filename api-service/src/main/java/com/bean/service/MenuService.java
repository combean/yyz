package com.bean.service;

import com.bean.model.Menu;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface MenuService {
    /**
     * 添加菜单
     * @param menu 菜单对象
     * @return 插入条数
     *
     * 插入数据主键 Menu.getMenuId();
     */
    int insert(Menu menu) throws SQLException;

    /**
     * 编辑/删除菜单
     * @param menu 菜单对象
     * @return
     *
     * 删除时 setDel(0)
     */
    Integer update(Menu menu) throws SQLException;

    /**
     * 根据传入的map信息获取菜单对象
     * @param map key 为 Menu 属性
     * @return 菜单对象
     */
    Menu getByMap(Map<String, Object> map) throws SQLException;

    /**
     * 根据传入的map信息获取菜单List
     * @param map key 为 Menu 属性
     * @return List<Menu>
     */
    List<Menu> getListByMap(Map<String, Object> map) throws SQLException;

    /**
     * 根据条件获取菜单数量
     * @param map key 为 Menu 属性
     * @return 菜单数量
     */
    Integer getCountByMap(Map<String, Object> map) throws SQLException;

    Menu getById(Integer id) throws SQLException;
}
