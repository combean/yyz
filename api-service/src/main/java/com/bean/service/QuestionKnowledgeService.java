package com.bean.service;

import com.bean.model.QuestionKnowledge;

import java.util.List;

public interface QuestionKnowledgeService {

    /**
     * 添加试题知识点关系
     * @param questionKnowledge 添加试题知识点关系对象
     * @return 添加条数
     */
    int insertQuestionKnowledge(QuestionKnowledge questionKnowledge);

    /**
     * 添加试题知识点关系
     * @param questionKnowledge 添加试题知识点关系List
     * @return 添加条数
     */
    int insertQuestionKnowledgeList(List<QuestionKnowledge> questionKnowledge);

    /**
     * 编辑试题知识点关系
     * @param questionId 试题ID
     * @return
     */
    Integer deleteByQuestionId(Integer questionId);

    /**
     * 根据试题ID获取试题知识点对应关系List
     * @param questionKnowledge 试题ID
     * @return 试题知识点对应关系List
     */
    List<QuestionKnowledge> getQuestionKnowledgeListByInfo(QuestionKnowledge questionKnowledge);

    /**
     * 根据主键ID删除试题知识点对应关系
     * @param questionKnowledgeId
     * @return
     */
    Integer deleteByQuestionKnowledgeId(Integer questionKnowledgeId);

    /**
     * 获取试题知识点对应关系数量
     * @param questionKnowledge 试题知识点对应关系 对象
     * @return
     */
    Integer getCountByInfo(QuestionKnowledge questionKnowledge);
}
