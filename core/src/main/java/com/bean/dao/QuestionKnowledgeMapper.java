package com.bean.dao;

import com.bean.model.QuestionKnowledge;
import java.util.List;

public interface QuestionKnowledgeMapper {
    int insert(QuestionKnowledge questionKnowledge);

    int insertList(List<QuestionKnowledge> questionKnowledge);

    Integer deleteByQuestionId(Integer questionId);

    List<QuestionKnowledge> getQuestionKnowledgeListByInfo(QuestionKnowledge questionKnowledge);

    Integer deleteByQuestionKnowledgeId(Integer questionKnowledgeId);

    int getCountByInfo (QuestionKnowledge questionKnowledge);
}