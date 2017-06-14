package com.bean.dao;

import com.bean.model.UserExamAnswer;
import com.bean.model.UserExamAnswerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserExamAnswerMapper {
    long countByExample(UserExamAnswerExample example);

    int deleteByExample(UserExamAnswerExample example);

    int deleteByPrimaryKey(Integer userExamAnswerId);

    int insert(UserExamAnswer record);

    int insertSelective(UserExamAnswer record);

    List<UserExamAnswer> selectByExample(UserExamAnswerExample example);

    UserExamAnswer selectByPrimaryKey(Integer userExamAnswerId);

    int updateByExampleSelective(@Param("record") UserExamAnswer record, @Param("example") UserExamAnswerExample example);

    int updateByExample(@Param("record") UserExamAnswer record, @Param("example") UserExamAnswerExample example);

    int updateByPrimaryKeySelective(UserExamAnswer record);

    int updateByPrimaryKey(UserExamAnswer record);
}