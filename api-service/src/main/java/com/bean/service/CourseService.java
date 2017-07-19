package com.bean.service;

import com.bean.model.Course;
import com.bean.model.CourseKnowledge;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface CourseService {
    /**
     * 添加课程
     * @param course 课程对象
     * @return 插入条数
     *
     * 插入数据主键 Course.getClassId();
     */
    int insert(Course course) throws SQLException;

    /**
     * 编辑/删除课程
     * @param course 课程对象
     * @return
     *
     * 删除时 setDel(0)
     */
    Integer update(Course course) throws SQLException;

    /**
     * 根据传入的map信息获取课程对象
     * @param map key 为 Course 属性
     * @return 课程对象
     */
    Course getByMap(Map<String, Object> map) throws SQLException;

    /**
     * 根据传入的map信息获取课程List
     * @param map key 为 Course 属性
     * @return List<Course>
     */
    List<Course> getListByMap(Map<String, Object> map) throws SQLException;

    /**
     * 根据条件获取课程数量
     * @param map key 为 Course 属性
     * @return 课程数量
     */
    Integer getCountByMap(Map<String, Object> map) throws SQLException;

    Course getById(Integer id) throws SQLException;

    @Transactional
    int insertCourseKnowledge(Course course, List<CourseKnowledge> courseKnowledges) throws SQLException;

    @Transactional
    int updateCourseKnowledge(Course course, List<CourseKnowledge> courseKnowledges) throws SQLException;
}
