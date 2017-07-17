package com.bean.service;

import com.bean.model.PaperQuestionType;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface PaperQuestionTypeService {

    /**
     * 添加考卷与试题分类关系
     * @param paperQuestionType 添加考卷与试题分类关系对象
     * @return 添加条数
     */
    int insert(PaperQuestionType paperQuestionType) throws SQLException;

    /**
     * 添加考卷与试题分类关系
     * @param paperQuestionType 添加考卷与试题分类关系List
     * @return 添加条数
     */
    int insertList(List<PaperQuestionType> paperQuestionType) throws SQLException;

    /**
     * 编辑考卷与试题分类关系
     * @param paperId 考卷ID
     * @return
     */
    int deleteByPaperId(Integer paperId) throws SQLException;

    /**
     * 根据试题ID获取考卷与试题分类对应关系List
     * @param map
     * @return 考卷与试题分类对应关系List
     */
    List<PaperQuestionType> getListByMap(Map<String, Object> map) throws SQLException;

    /**
     * 根据主键ID删除考卷与试题分类对应关系
     * @param id 主键
     * @return
     */
    Integer deleteById(Integer id) throws SQLException;

    /**
     * 获取考卷与试题分类对应关系数量
     * @param map
     * @return
     */
    Integer getCountByMap(Map<String, Object> map) throws SQLException;

    /**
     * 根据考卷ID获取分类List
     * @param paperId 考卷ID
     * @return
     * @throws SQLException
     */
    List<PaperQuestionType> getListByPaperId(Integer paperId) throws SQLException;
}
