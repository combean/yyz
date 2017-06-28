package com.bean.dao;

import com.bean.model.UserExam;
import com.bean.model.UserExamExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserExamMapper {
    int insert(UserExam userExam);

    int insertList(List<UserExam> userExam);

    Integer deleteByUserId(Integer managerId);

    List<UserExam> getUserExamListByInfo(UserExam userExam);

    Integer deleteByUserExamId(Integer userExamId);

    int getCountByInfo (UserExam userExam);
}