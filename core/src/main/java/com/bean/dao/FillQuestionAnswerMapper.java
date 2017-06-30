package com.bean.dao;

import com.bean.model.FillQuestionAnswer;
import com.bean.model.FillQuestionAnswerExample;

import java.sql.SQLException;
import java.util.List;

import mybatis.basemapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

public interface FillQuestionAnswerMapper extends BaseMapper<FillQuestionAnswer> {

    int deleteByQuestionId(Integer id) throws SQLException;

    List<FillQuestionAnswer> getAnswerByQuestionId(Integer questionId) throws SQLException;

}