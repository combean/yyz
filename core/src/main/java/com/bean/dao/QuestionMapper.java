package com.bean.dao;

import com.bean.model.Question;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import com.bean.model.QuestionKnowledge;
import mybatis.basemapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

public interface QuestionMapper extends BaseMapper<Question> {
    List<Question> getQuestionListByIds(List<QuestionKnowledge> questionknowledges) throws SQLException;

    List<Question> getListByIds(String ids) throws SQLException;
}