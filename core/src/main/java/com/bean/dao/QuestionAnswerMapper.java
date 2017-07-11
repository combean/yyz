package com.bean.dao;

import com.bean.model.QuestionAnswer;
import mybatis.basemapper.BaseMapper;

import java.sql.SQLException;
import java.util.List;

public interface QuestionAnswerMapper extends BaseMapper<QuestionAnswer> {
    int deleteByQuestionId(Integer id) throws SQLException;

    String getRightAnswerByQuestionId(Integer questionId) throws SQLException;

    QuestionAnswer getRightAnswerObjByQuestionId(Integer questionId) throws SQLException;

    List<QuestionAnswer> getRightAnswerListByQuestionId(Integer questionId) throws SQLException;
}