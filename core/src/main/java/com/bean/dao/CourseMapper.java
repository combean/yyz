package com.bean.dao;

import com.bean.model.Course;
import com.bean.model.CourseExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface CourseMapper {
    int insert(Course course);

    Integer update(Course course);

    Course getCourseByInfo(Map<String, String> map);

    List<Course> getCourseListByInfo(Map<String, String> map);

    Integer getCourseCountByInfo(Map<String, String> map);
}