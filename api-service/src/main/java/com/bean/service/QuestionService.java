package com.bean.service;

import com.bean.model.Question;

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
    int insertQuestion(Question question);

    /**
     * 编辑/删除试题
     * @param question 试题对象
     * @return boolean
     *
     * 删除时 setDel(0)
     */
    Integer updateQuestion(Question question);

    /**
     * 根据传入的map信息获取试题对象
     * @param map key 为Question属性
     * @return 试题对象
     */
    Question getQuestionByInfo(Map<String, String> map);

    /**
     * 根据传入的map信息获取试题List
     * @param map key 为Question属性
     * @return List<Question>
     */
    List<Question> getQuestionListByInfo(Map<String, String> map);

    /**
     * 根据条件获取试题数量
     * @param map key 为Question属性
     * @return
     */
    Integer getQuestionCountByInfo(Map<String, String> map);
}
