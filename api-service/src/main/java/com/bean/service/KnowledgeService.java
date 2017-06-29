package com.bean.service;

import com.bean.model.Knowledge;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface KnowledgeService {
    /**
     * 添加知识点
     * @param knowledge 知识点对象
     * @return 插入条数
     *
     * 插入数据主键 Knowledge.getClassId();
     */
    int insert(Knowledge knowledge) throws SQLException;

    /**
     * 编辑/删除知识点
     * @param knowledge 知识点对象
     * @return
     *
     * 删除时 setDel(0)
     */
    Integer update(Knowledge knowledge) throws SQLException;

    /**
     * 根据传入的map信息获取知识点对象
     * @param map key 为 Knowledge 属性
     * @return 知识点对象
     */
    Knowledge getByMap(Map<String, Object> map) throws SQLException;

    /**
     * 根据传入的map信息获取知识点List
     * @param map key 为 Knowledge 属性
     * @return List<Knowledge>
     */
    List<Knowledge> getListByMap(Map<String, Object> map) throws SQLException;

    /**
     * 根据条件获取知识点数量
     * @param map key 为 Knowledge 属性
     * @return 知识点数量
     */
    Integer getCountByMap(Map<String, Object> map) throws SQLException;

    Knowledge getById(Integer id) throws SQLException;
}
