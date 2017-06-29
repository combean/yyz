package com.bean.dao;

import com.bean.model.UserExamAnswer;
import com.bean.model.UserExamAnswerExample;
import java.util.List;
import java.util.Map;

import mybatis.basemapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

public interface UserExamAnswerMapper extends BaseMapper<UserExamAnswer> {

    int deleteByUserId(Integer userId);

    int deleteByPaperId(Integer paperId);

    int updateAnswerById(UserExamAnswer userExamAnswer);

}