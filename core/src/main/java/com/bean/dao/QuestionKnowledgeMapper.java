package com.bean.dao;

import com.bean.model.QuestionKnowledge;
import mybatis.basemapper.BaseMapper;

import java.util.List;

public interface QuestionKnowledgeMapper extends BaseMapper<QuestionKnowledge> {

    int deleteByQuestionId(Integer questionId);

}