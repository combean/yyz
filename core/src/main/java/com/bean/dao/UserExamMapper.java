package com.bean.dao;

import com.bean.model.UserExam;
import com.bean.model.UserExamExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserExamMapper {
    long countByExample(UserExamExample example);

    int deleteByExample(UserExamExample example);

    int deleteByPrimaryKey(Integer userExamId);

    int insert(UserExam record);

    int insertSelective(UserExam record);

    List<UserExam> selectByExample(UserExamExample example);

    UserExam selectByPrimaryKey(Integer userExamId);

    int updateByExampleSelective(@Param("record") UserExam record, @Param("example") UserExamExample example);

    int updateByExample(@Param("record") UserExam record, @Param("example") UserExamExample example);

    int updateByPrimaryKeySelective(UserExam record);

    int updateByPrimaryKey(UserExam record);
}