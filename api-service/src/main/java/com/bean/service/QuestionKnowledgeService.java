package com.bean.service;

import com.bean.model.Knowledge;
import com.bean.model.QuestionKnowledge;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface QuestionKnowledgeService {

    /**
     * 添加试题知识点关系
     * @param questionKnowledge 添加试题知识点关系对象
     * @return 添加条数
     */
    int insert(QuestionKnowledge questionKnowledge) throws SQLException;

    /**
     * 添加试题知识点关系
     * @param questionKnowledge 添加试题知识点关系List
     * @return 添加条数
     */
    int insertList(List<QuestionKnowledge> questionKnowledge) throws SQLException;

    /**
     * 编辑试题知识点关系
     * @param questionId 试题ID
     * @return
     */
    int deleteByQuestionId(Integer questionId);

    /**
     * 根据试题ID获取试题知识点对应关系List
     * @param map
     * @return 试题知识点对应关系List
     */
    List<QuestionKnowledge> getListByMap(Map<String, Object> map) throws SQLException;

    /**
     * 根据主键ID删除试题知识点对应关系
     * @param id 主键
     * @return
     */
    int deleteById(Integer id) throws SQLException;

    /**
     * 获取试题知识点对应关系数量
     * @param map
     * @return
     */
    int getCountByMap(Map<String, Object> map) throws SQLException;

    List<QuestionKnowledge> getListByObj(QuestionKnowledge questionKnowledge) throws SQLException;

    List<QuestionKnowledge> getListByKnowledgeIds(List<Knowledge> knowledges) throws SQLException;
}
