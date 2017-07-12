package com.bean.service;

import com.bean.model.SubjectKnowledge;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface SubjectKnowledgeService {

    /**
     * 添加课程知识点关系
     * @param subjectKnowledge 添加课程知识点关系对象
     * @return 添加条数
     */
    int insert(SubjectKnowledge subjectKnowledge) throws SQLException;

    /**
     * 添加课程知识点关系
     * @param subjectKnowledge 添加课程知识点关系List
     * @return 添加条数
     */
    int insertList(List<SubjectKnowledge> subjectKnowledge) throws SQLException;

    /**
     * 删除课程知识点关系
     * @param subjectId 课程ID
     * @return
     */
    int deleteBySubjectId(Integer subjectId);

    /**
     * 根据课程ID获取课程知识点对应关系List
     * @param map
     * @return 课程知识点对应关系List
     */
    List<SubjectKnowledge> getListByMap(Map<String, Object> map) throws SQLException;

    /**
     * 根据主键ID删除课程知识点对应关系
     * @param id 主键
     * @return
     */
    int deleteById(Integer id) throws SQLException;

    /**
     * 获取课程知识点对应关系数量
     * @param map
     * @return
     */
    int getCountByMap(Map<String, Object> map) throws SQLException;
}
