package com.bean.service;

import com.bean.model.ClassSubject;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface ClassSubjectService {
    /**
     * 添加班级科目关系
     * @param classSubject 添加班级科目关系List
     * @return 添加条数
     */
    int insertList(List<ClassSubject> classSubject) throws SQLException;

    /**
     * 添加班级科目关系
     * @param classSubject 添加班级科目关系对象
     * @return 添加条数
     */
    int insert(ClassSubject classSubject) throws SQLException;
    /**
     * 编辑班级科目关系
     * @param classId 班级ID
     * @return
     */
    Integer deleteByClassId(Integer classId);

    /**
     * 根据班级ID获取班级科目对应关系List
     * @param map
     * @return 班级科目对应关系List
     */
    List<ClassSubject> getListByMap(Map<String, Object> map) throws SQLException;

    /**
     * 根据主键ID删除班级科目对应关系
     * @param id 主键
     * @return
     */
    Integer deleteById(Integer id) throws SQLException;

    /**
     * 获取课程知识点对应关系数量
     * @param map
     * @return
     */
    int getCountByMap(Map<String, Object> map) throws SQLException;
}
