package com.bean.service;

import com.bean.model.FillQuestionAnswer;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface FillQuestionAnswerService {
    /**
     * 添加填空题备选答案
     * @param cillQuestionAnswer 添加填空题备选答案List
     * @return 添加条数
     */
    int insertList(List<FillQuestionAnswer> cillQuestionAnswer) throws SQLException;

    /**
     * 添加填空题备选答案
     * @param cillQuestionAnswer 添加填空题备选答案对象
     * @return 添加条数
     */
    int insert(FillQuestionAnswer cillQuestionAnswer) throws SQLException;

    /**
     * 编辑填空题备选答案
     * @param questionId 试题ID
     * @return
     */
    Integer deleteByQuestionId(Integer questionId) throws SQLException;

    /**
     * 根据班级ID获取填空题备选答案List
     * @param map
     * @return 填空题备选答案List
     */
    List<FillQuestionAnswer> getListByMap(Map<String, Object> map) throws SQLException;

    /**
     * 根据主键ID删除填空题备选答案
     * @param id 主键
     * @return
     */
    Integer deleteById(Integer id) throws SQLException;

    /**
     * 获取填空题备选答案数量
     * @param map
     * @return
     */
    int getCountByMap(Map<String, Object> map) throws SQLException;

    /**
     * 获取填空题参考答案List
     * @param questionId 问题ID
     * @return 正确选项
     * @throws SQLException
     */
    List<FillQuestionAnswer> getAnswerByQuestionId(Integer questionId) throws SQLException;
}
