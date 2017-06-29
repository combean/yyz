package com.bean.service;

import com.bean.dao.CourseMapper;
import com.bean.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utils.MyLogger;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;


@Service("courseService")
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseMapper courseMapper;

    private MyLogger LOGGER = new MyLogger(CourseServiceImpl.class);


    @Override
    public int insert(Course course) throws SQLException {
        return courseMapper.insert(course);
    }

    @Override
    public Integer update(Course course) throws SQLException {
        return courseMapper.update(course);
    }

    @Override
    public Course getByMap(Map<String, Object> map) throws SQLException {
        return courseMapper.getByMap(map);
    }

    @Override
    public List<Course> getListByMap(Map<String, Object> map) throws SQLException {
        return courseMapper.getListByMap(map);
    }

    @Override
    public Integer getCountByMap(Map<String, Object> map) throws SQLException {
        return courseMapper.getCountByMap(map);
    }

    @Override
    public Course getById(Integer id) throws SQLException {
        return courseMapper.getById(id);
    }
}
