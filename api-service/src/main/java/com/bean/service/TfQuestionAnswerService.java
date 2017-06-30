package com.bean.service;

import com.bean.model.TfQuestionAnswer;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface TfQuestionAnswerService {
    /**
     * 添加判断题备选答案
     * @param tfQuestionAnswer 添加判断题备选答案List
     * @return 添加条数
     */
    int insertList(List<TfQuestionAnswer> tfQuestionAnswer) throws SQLException;

    /**
     * 添加判断题备选答案
     * @param tfQuestionAnswer 添加判断题备选答案对象
     * @return 添加条数
     */
    int insert(TfQuestionAnswer tfQuestionAnswer) throws SQLException;

    /**
     * 编辑判断题备选答案
     * @param questionId 试题ID
     * @return
     */
    Integer deleteByQuestionId(Integer questionId) throws SQLException;

    /**
     * 根据班级ID获取判断题备选答案List
     * @param map
     * @return 判断题备选答案List
     */
    List<TfQuestionAnswer> getListByMap(Map<String, Object> map) throws SQLException;

    /**
     * 根据主键ID删除判断题备选答案
     * @param id 主键
     * @return
     */
    Integer deleteById(Integer id) throws SQLException;

    /**
     * 获取判断题备选答案数量
     * @param map
     * @return
     */
    int getCountByMap(Map<String, Object> map) throws SQLException;

    /**
     * 获取判断题正确选项
     * @param questionId 问题ID
     * @return 正确选项
     * @throws SQLException
     */
    String getRightAnswerByQuestionId(Integer questionId) throws SQLException;

    /**
     * 获取判断题正确答案对象
     * @param questionId 问题ID
     * @return 获取判断题正确答案对象
     * @throws SQLException
     */
    TfQuestionAnswer getRightAnswerObjByQuestionId(Integer questionId) throws SQLException;
}
