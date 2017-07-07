package com.bean.service;

import com.bean.model.PaperQuestion;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface PaperQuestionService {

    /**
     * 添加考卷与题目关系
     * @param paperQuestion 考卷与题目关系对象
     * @return 添加条数
     */
    int insert(PaperQuestion paperQuestion) throws SQLException;

    /**
     * 添加考卷与题目关系
     * @param paperQuestion 考卷与题目关系List
     * @return 添加条数
     */
    int insertList(List<PaperQuestion> paperQuestion) throws SQLException;

    /**
     * 编辑考卷与题目关系
     * @param paperId 角色ID
     * @return
     */
    int deleteByPaperId(Integer paperId);

    /**
     * 根据管理员ID获取角色菜单关系List
     * @param map
     * @return 角色菜单关系List
     */
    List<PaperQuestion> getListByMap(Map<String, Object> map) throws SQLException;

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
    int getCountByMap(Map<String, Object> map) throws SQLException;
}
