package com.bean.dao;

import com.bean.model.UserExam;
import com.bean.model.UserExamExample;

import java.sql.SQLException;
import java.util.List;

import mybatis.basemapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

public interface UserExamMapper extends BaseMapper<UserExam> {

    Integer deleteByUserId(Integer userId);

    Integer deleteByExamId(Integer examId) throws SQLException;

}