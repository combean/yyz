package com.bean.service;

import com.bean.dao.CourseKnowledgeMapper;
import com.bean.dao.CourseMapper;
import com.bean.model.Course;
import com.bean.model.CourseKnowledge;
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

    @Autowired
    private CourseKnowledgeMapper courseKnowledgeMapper;

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

    @Override
    public int insertCourseKnowledge(Course course, List<CourseKnowledge> courseKnowledges) throws SQLException {
        courseMapper.insert(course);
        for (CourseKnowledge ck: courseKnowledges) {
            ck.setCourseId(course.getCourseId());
        }
        return courseKnowledgeMapper.insertList(courseKnowledges);
    }

    @Override
    public int updateCourseKnowledge(Course course, List<CourseKnowledge> courseKnowledges) throws SQLException {
        courseMapper.update(course);
        for (CourseKnowledge ck: courseKnowledges) {
            ck.setCourseId(course.getCourseId());
        }
        courseKnowledgeMapper.deleteByCourseId(course.getCourseId());
        return courseKnowledgeMapper.insertList(courseKnowledges);
    }
}
