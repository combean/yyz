package com.bean.service;

import com.bean.model.QuestionAnswer;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface QuestionAnswerService {
    /**
     * 添加选择题备选答案
     * @param questionAnswers 添加选择题备选答案List
     * @return 添加条数
     */
    int insertList(List<QuestionAnswer> questionAnswers) throws SQLException;

    /**
     * 添加选择题备选答案
     * @param questionAnswer 添加选择题备选答案对象
     * @return 添加条数
     */
    int insert(QuestionAnswer questionAnswer) throws SQLException;

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
    List<QuestionAnswer> getListByMap(Map<String, Object> map) throws SQLException;

    /**
     * 根据主键ID删除选择题备选答案
     * @param id 主键
     * @return
     */
    int deleteById(Integer id) throws SQLException;

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
    QuestionAnswer getRightAnswerObjByQuestionId(Integer questionId) throws SQLException;

    /**
     * 获取多选题选择题正确答案List
     * @param questionId 问题ID
     * @return 获取选择题正确答案List
     * @throws SQLException
     */
    List<QuestionAnswer> getRightAnswerListByQuestionId(Integer questionId) throws SQLException;

    /**
     * 根据题目ID获取题目答案List
     * @param questionId 题目ID
     * @return 答案List
     * @throws SQLException
     */
    List<QuestionAnswer> getAnswerListByQuestionId(Integer questionId) throws SQLException;
}
