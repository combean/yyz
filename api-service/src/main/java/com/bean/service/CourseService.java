package com.bean.service;

import com.bean.model.Course;

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
    int insertCourse(Course course);

    /**
     * 编辑/删除课程
     * @param course 课程对象
     * @return
     *
     * 删除时 setDel(0)
     */
    Integer updateCourse(Course course);

    /**
     * 根据传入的map信息获取课程对象
     * @param map key 为 Course 属性
     * @return 课程对象
     */
    Course getCourseByInfo(Map<String, String> map);

    /**
     * 根据传入的map信息获取课程List
     * @param map key 为 Course 属性
     * @return List<Course>
     */
    List<Course> getCourseListByInfo(Map<String, String> map);

    /**
     * 根据条件获取课程数量
     * @param map key 为 Course 属性
     * @return 课程数量
     */
    Integer getCourseCountByInfo(Map<String, String> map);
}
