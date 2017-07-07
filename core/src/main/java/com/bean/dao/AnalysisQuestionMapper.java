package com.bean.dao;

import com.bean.model.AnalysisQuestion;
import com.bean.model.AnalysisQuestionExample;

import java.sql.SQLException;
import java.util.List;

import mybatis.basemapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

public interface AnalysisQuestionMapper extends BaseMapper<AnalysisQuestion> {

    int deleteByFQuestionId(Integer id) throws SQLException;

}