package com.bean.dao;

import com.bean.model.Knowledge;
import com.bean.model.QuestionKnowledge;
import mybatis.basemapper.BaseMapper;
import org.apache.ibatis.jdbc.SQL;

import java.sql.SQLException;
import java.util.List;

public interface QuestionKnowledgeMapper extends BaseMapper<QuestionKnowledge> {

    int deleteByQuestionId(Integer questionId);

    List<QuestionKnowledge> getListByKnowledgeIds(List<Knowledge> knowledges);

    List<QuestionKnowledge> getListByQuestionId(Integer questionId) throws SQLException;
}