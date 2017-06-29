package com.bean.service;

import com.bean.model.UserExam;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface UserExamService {

    /**
     * 添加用户考试关系
     * @param userExam 添加用户考试关系对象
     * @return 添加条数
     */
    int insert(UserExam userExam) throws SQLException;

    /**
     * 添加用户考试关系
     * @param userExam 添加用户考试关系List
     * @return 添加条数
     */
    int insertList(List<UserExam> userExam) throws SQLException;

    /**
     * 编辑用户考试关系
     * @param userId 用户ID
     * @return
     */
    int deleteByUserId(Integer userId) throws SQLException;

    /**
     * 根据用户ID获取用户考试对应关系List
     * @param map
     * @return 用户考试对应关系List
     */
    List<UserExam> getListByMap(Map<String,Object> map) throws SQLException;

    /**
     * 根据主键ID删除用户考试对应关系
     * @param id 主键
     * @return
     */
    int deleteById(Integer id) throws SQLException;

    /**
     * 获取用户考试对应关系数量
     * @param map
     * @return
     */
    int getCountByMap(Map<String,Object> map) throws SQLException;
}
