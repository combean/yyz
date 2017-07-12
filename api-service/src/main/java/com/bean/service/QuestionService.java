package com.bean.service;

import com.bean.model.Question;
import com.bean.model.QuestionAnswer;
import com.bean.model.QuestionKnowledge;
import org.springframework.transaction.annotation.Transactional;

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

    /**
     * 根据主键ID获取题目对象
     * @param id 主键ID
     * @return 题目对象
     * @throws SQLException
     */
    Question getById(Integer id) throws SQLException;

    /**
     * 根据对象属性获取题目对象
     * @param question 题目对象
     * @return 题目对象
     * @throws SQLException
     */
    Question getByObj(Question question) throws SQLException;

    /**
     * 插入题目和参考答案知识点
     * @param question 题目对象
     * @param questionAnswers 答案对象
     * @param questionKnowledges 题目知识点对象
     * @return 插入数量
     * @throws SQLException
     */
    @Transactional
    int insertQuestionAnswer(Question question, List<QuestionAnswer> questionAnswers, List<QuestionKnowledge> questionKnowledges) throws SQLException;

    /**
     * 更新题目和参考答案知识点
     * @param question 题目对象
     * @param questionAnswers 答案对象
     * @param questionKnowledges 题目知识点对象
     * @return 更新数量
     * @throws SQLException
     */
    @Transactional
    int updateQuestionAnswer(Question question, List<QuestionAnswer> questionAnswers, List<QuestionKnowledge> questionKnowledges) throws SQLException;

    List<Question> getQuestionListByIds(List<QuestionKnowledge> questionknowledges) throws SQLException;
}
