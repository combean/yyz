package com.bean.service;

import com.bean.model.UserExam;

import java.util.List;

public interface UserExamService {

    /**
     * 添加用户考试关系
     * @param userExam 添加用户考试关系对象
     * @return 添加条数
     */
    int insertUserExam(UserExam userExam);

    /**
     * 添加用户考试关系
     * @param userExam 添加用户考试关系List
     * @return 添加条数
     */
    int insertUserExamList(List<UserExam> userExam);

    /**
     * 编辑用户考试关系
     * @param userId 用户ID
     * @return
     */
    Integer deleteByUserId(Integer userId);

    /**
     * 根据用户ID获取用户考试对应关系List
     * @param userExam 用户ID
     * @return 用户考试对应关系List
     */
    List<UserExam> getUserExamListByInfo(UserExam userExam);

    /**
     * 根据主键ID删除用户考试对应关系
     * @param userExamId
     * @return
     */
    Integer deleteByUserExamId(Integer userExamId);

    /**
     * 获取用户考试对应关系数量
     * @param userExam 用户考试对应关系对象
     * @return
     */
    Integer getCountByInfo(UserExam userExam);
}
