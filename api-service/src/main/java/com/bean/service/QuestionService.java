package com.bean.service;

import com.bean.model.Question;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface QuestionService {
    /**
     * 添加试题
     * @param question 试题对象
     * @return 插入条数
     *
     * 插入数据的主键 Question.getQuestionId();
     */
    int insert(Question question) throws SQLException;

    /**
     * 编辑/删除试题
     * @param question 试题对象
     * @return boolean
     *
     * 删除时 setDel(0)
     */
    Integer update(Question question) throws SQLException;

    /**
     * 根据传入的map信息获取试题对象
     * @param map key 为Question属性
     * @return 试题对象
     */
    Question getByMap(Map<String, Object> map) throws SQLException;

    /**
     * 根据传入的map信息获取试题List
     * @param map key 为Question属性
     * @return List<Question>
     */
    List<Question> getListByMap(Map<String, Object> map) throws SQLException;

    /**
     * 根据条件获取试题数量
     * @param map key 为Question属性
     * @return
     */
    Integer getQuestionCountByInfo(Map<String, Object> map) throws SQLException;

    Question getById(Integer id) throws SQLException;
}
