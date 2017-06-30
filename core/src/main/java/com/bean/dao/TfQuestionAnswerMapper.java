package com.bean.dao;

import com.bean.model.TfQuestionAnswer;
import com.bean.model.TfQuestionAnswerExample;

import java.sql.SQLException;
import java.util.List;

import mybatis.basemapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

public interface TfQuestionAnswerMapper extends BaseMapper<TfQuestionAnswer> {

    int deleteByQuestionId(Integer id) throws SQLException;

    String getRightAnswerByQuestionId(Integer questionId) throws SQLException;

    TfQuestionAnswer getRightAnswerObjByQuestionId(Integer questionId) throws SQLException;
}