package com.bean.service;

import com.bean.dao.CourseKnowledgeMapper;
import com.bean.model.CourseKnowledge;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utils.MyLogger;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;


@Service("courseKnowledgeService")
public class CourseKnowledgeServiceImpl implements CourseKnowledgeService {

    @Autowired
    private CourseKnowledgeMapper courseKnowledgeMapper;

    private MyLogger LOGGER = new MyLogger(CourseKnowledgeServiceImpl.class);

    @Override
    public int insertList(List<CourseKnowledge> courseKnowledge) throws SQLException {
        return courseKnowledgeMapper.insertList(courseKnowledge);
    }

    @Override
    public int insert(CourseKnowledge courseKnowledge) throws SQLException {
        return courseKnowledgeMapper.insert(courseKnowledge);
    }

    @Override
    public int deleteByCourseId(Integer courseId) throws SQLException {
        return courseKnowledgeMapper.deleteByCourseId(courseId);
    }

    @Override
    public List<CourseKnowledge> getListByMap(Map<String, Object> map) throws SQLException {
        return courseKnowledgeMapper.getListByMap(map);
    }

    @Override
    public int deleteById(Integer id) throws SQLException {
        return courseKnowledgeMapper.deleteById(id);
    }

    @Override
    public int getCountByMap(Map<String, Object> map) throws SQLException {
        return courseKnowledgeMapper.getCountByMap(map);
    }

    @Override
    public List<CourseKnowledge> getListByCourseId(Integer courseId) throws SQLException {
        return courseKnowledgeMapper.getListByCourseId(courseId);
    }
}
