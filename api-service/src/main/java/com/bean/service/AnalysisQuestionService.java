package com.bean.service;

import com.bean.model.AnalysisQuestion;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface AnalysisQuestionService {
    /**
     * 添加分析题父题目子题目关系
     * @param analysisQuestion 添加分析题父题目子题目关系List
     * @return 添加条数
     */
    int insertList(List<AnalysisQuestion> analysisQuestion) throws SQLException;

    /**
     * 添加分析题父题目子题目关系
     * @param analysisQuestion 添加分析题父题目子题目关系对象
     * @return 添加条数
     */
    int insert(AnalysisQuestion analysisQuestion) throws SQLException;

    /**
     * 编辑分析题父题目子题目关系
     * @param fquestionId 试题ID
     * @return
     */
    int deleteByFQuestionId(Integer fquestionId) throws SQLException;

    /**
     * 根据班级ID获取分析题父题目子题目关系List
     * @param map
     * @return 分析题父题目子题目关系List
     */
    List<AnalysisQuestion> getListByMap(Map<String, Object> map) throws SQLException;

    /**
     * 根据主键ID删除分析题父题目子题目关系
     * @param id 主键
     * @return
     */
    Integer deleteById(Integer id) throws SQLException;

    /**
     * 获取分析题父题目子题目关系数量
     * @param map
     * @return
     */
    int getCountByMap(Map<String, Object> map) throws SQLException;
}
