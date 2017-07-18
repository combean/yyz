package com.bean.dao;

import com.bean.model.ExamPaper;
import com.bean.model.ExamPaperExample;

import java.sql.SQLException;
import java.util.List;

import mybatis.basemapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

public interface ExamPaperMapper extends BaseMapper<ExamPaper> {
    int deleteByPaperId(Integer id) throws SQLException;

    int deleteByExamId(Integer id) throws SQLException;

    List<ExamPaper> getListByExamId(Integer id) throws SQLException;
}