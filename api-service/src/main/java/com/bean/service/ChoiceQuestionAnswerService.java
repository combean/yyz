package com.bean.service;

import com.bean.model.ChoiceQuestionAnswer;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface ChoiceQuestionAnswerService {
    /**
     * 添加选择题备选答案
     * @param choiceQuestionAnswer 添加选择题备选答案List
     * @return 添加条数
     */
    int insertList(List<ChoiceQuestionAnswer> choiceQuestionAnswer) throws SQLException;

    /**
     * 添加选择题备选答案
     * @param choiceQuestionAnswer 添加选择题备选答案对象
     * @return 添加条数
     */
    int insert(ChoiceQuestionAnswer choiceQuestionAnswer) throws SQLException;

    /**
     * 编辑选择题备选答案
     * @param questionId 试题ID
     * @return
     */
    Integer deleteByQuestionId(Integer questionId) throws SQLException;

    /**
     * 根据班级ID获取选择题备选答案List
     * @param map
     * @return 选择题备选答案List
     */
    List<ChoiceQuestionAnswer> getListByMap(Map<String, Object> map) throws SQLException;

    /**
     * 根据主键ID删除选择题备选答案
     * @param id 主键
     * @return
     */
    Integer deleteById(Integer id) throws SQLException;

    /**
     * 获取选择题备选答案数量
     * @param map
     * @return
     */
    int getCountByMap(Map<String, Object> map) throws SQLException;

    /**
     * 获取选择题正确选项
     * @param questionId 问题ID
     * @return 正确选项
     * @throws SQLException
     */
    String getRightAnswerByQuestionId(Integer questionId) throws SQLException;

    /**
     * 获取选择题正确答案对象
     * @param questionId 问题ID
     * @return 获取选择题正确答案对象
     * @throws SQLException
     */
    ChoiceQuestionAnswer getRightAnswerObjByQuestionId(Integer questionId) throws SQLException;
}
