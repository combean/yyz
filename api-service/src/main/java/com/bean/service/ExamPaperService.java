package com.bean.service;

import com.bean.model.ExamPaper;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface ExamPaperService {

    /**
     * 添加考试考卷关系
     * @param examPaper 添加考试考卷关系对象
     * @return 添加条数
     */
    int insert(ExamPaper examPaper) throws SQLException;

    /**
     * 添加考试考卷关系
     * @param examPaper 添加考试考卷关系List
     * @return 添加条数
     */
    int insertList(List<ExamPaper> examPaper) throws SQLException;

    /**
     * 编辑考试考卷关系
     * @param paperId 考卷ID
     * @return
     */
    int deleteByPaperId(Integer paperId) throws SQLException;

    /**
     * 获取考试考卷对应关系List
     * @param map
     * @return 考试考卷对应关系List
     */
    List<ExamPaper> getListByMap(Map<String, Object> map) throws SQLException;

    /**
     * 根据主键ID删除考试考卷对应关系
     * @param id 主键
     * @return
     */
    int deleteById(Integer id) throws SQLException;

    /**
     * 获取考试考卷对应关系数量
     * @param map
     * @return
     */
    int getCountByMap(Map<String, Object> map) throws SQLException;
}
