package com.bean.service;

import com.bean.dao.CourseMapper;
import com.bean.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utils.MyLogger;

import java.util.List;
import java.util.Map;


@Service("courseService")
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseMapper courseMapper;

    private MyLogger LOGGER = new MyLogger(CourseServiceImpl.class);


    @Override
    public int insertCourse(Course course) {
        return courseMapper.insert(course);
    }

    @Override
    public Integer updateCourse(Course course) {
        return courseMapper.update(course);
    }

    @Override
    public Course getCourseByInfo(Map<String, String> map) {
        return courseMapper.getCourseByInfo(map);
    }

    @Override
    public List<Course> getCourseListByInfo(Map<String, String> map) {
        return courseMapper.getCourseListByInfo(map);
    }

    @Override
    public Integer getCourseCountByInfo(Map<String, String> map) {
        return courseMapper.getCourseCountByInfo(map);
    }
}
