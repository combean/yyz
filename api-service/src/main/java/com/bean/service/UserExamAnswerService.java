package com.bean.service;

import com.bean.model.UserExamAnswer;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface UserExamAnswerService {

    /**
     * 添加用户答案
     * @param userExamAnswer 添加用户答案对象
     * @return 添加条数
     */
    int insert(UserExamAnswer userExamAnswer) throws SQLException;

    /**
     * 添加用户答案
     * @param userExamAnswer 添加用户答案List
     * @return 添加条数
     */
    int insertList(List<UserExamAnswer> userExamAnswer) throws SQLException;

    /**
     * 编辑用户答案
     * @param userId 用户ID
     * @return
     */
    int deleteByUserId(Integer userId) throws SQLException;

    /**
     * 根据用户ID获取用户答案List
     * @param map
     * @return 用户答案List
     */
    List<UserExamAnswer> getListByMap(Map<String, Object> map) throws SQLException;

    /**
     * 根据主键ID删除用户答案
     * @param id 主键
     * @return
     */
    int deleteById(Integer id) throws SQLException;

    /**
     * 获取用户答案数量
     * @param map
     * @return
     */
    int getCountByMap(Map<String, Object> map) throws SQLException;

    /**
     * 根据考卷ID删除用户答案
     * @param paperId 考卷ID
     * @return
     * @throws SQLException
     */
    int deleteByPaperId(Integer paperId) throws SQLException;

    /**
     * 更新试题答案
     * @param userExamAnswer 用户答案对象
     * @return
     * @throws SQLException
     */
    int updateAnswerById(UserExamAnswer userExamAnswer) throws SQLException;
}
