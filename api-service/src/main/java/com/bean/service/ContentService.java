package com.bean.service;

import com.bean.model.Content;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface ContentService {
    /**
     * 添加课程内容/课件
     * @param content 课程内容/课件对象
     * @return 插入条数
     *
     * 插入数据主键 Content.getClassId();
     */
    int insert(Content content) throws SQLException;

    /**
     * 编辑/删除课程内容/课件
     * @param content 课程内容/课件对象
     * @return
     *
     * 删除时 setDel(0)
     */
    Integer update(Content content) throws SQLException;

    /**
     * 根据传入的map信息获取课程内容/课件对象
     * @param map key 为 Content 属性
     * @return 课程内容/课件对象
     */
    Content getByMap(Map<String, Object> map) throws SQLException;

    /**
     * 根据传入的map信息获取课程内容/课件List
     * @param map key 为 Content 属性
     * @return List<Content>
     */
    List<Content> getListByMap(Map<String, Object> map) throws SQLException;

    /**
     * 根据条件获取课程内容/课件数量
     * @param map key 为 Content 属性
     * @return 课程内容/课件数量
     */
    Integer getCountByMap(Map<String, Object> map) throws SQLException;

    Content getById(Integer id) throws SQLException;
}
