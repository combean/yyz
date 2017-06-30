package com.bean.dao;

import com.bean.model.ChoiceQuestionAnswer;
import com.bean.model.ChoiceQuestionAnswerExample;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import mybatis.basemapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

public interface ChoiceQuestionAnswerMapper extends BaseMapper<ChoiceQuestionAnswer> {
    int deleteByQuestionId(Integer id) throws SQLException;

    String getRightAnswerByQuestionId(Integer questionId) throws SQLException;

    ChoiceQuestionAnswer getRightAnswerObjByQuestionId(Integer questionId) throws SQLException;
}