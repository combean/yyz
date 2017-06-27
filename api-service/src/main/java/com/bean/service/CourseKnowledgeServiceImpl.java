package com.bean.service;

import com.bean.dao.CourseKnowledgeMapper;
import com.bean.model.CourseKnowledge;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utils.MyLogger;

import java.util.List;


@Service("courseKnowledgeService")
public class CourseKnowledgeServiceImpl implements CourseKnowledgeService {

    @Autowired
    private CourseKnowledgeMapper courseKnowledgeMapper;

    private MyLogger LOGGER = new MyLogger(CourseKnowledgeServiceImpl.class);

    @Override
    public int insertCourseKnowledgeList(List<CourseKnowledge> courseKnowledge){
        return courseKnowledgeMapper.insertList(courseKnowledge);
    }

    @Override
    public int insertCourseKnowledge(CourseKnowledge courseKnowledge) {
        return courseKnowledgeMapper.insert(courseKnowledge);
    }

    @Override
    public Integer deleteByCourseId(Integer courseId) {
        return courseKnowledgeMapper.deleteByCourseId(courseId);
    }

    @Override
    public List<CourseKnowledge> getCourseKnowledgeListByInfo(CourseKnowledge courseKnowledge) {
        return courseKnowledgeMapper.getCourseKnowledgeListByInfo(courseKnowledge);
    }

    @Override
    public Integer deleteByCourseKnowledgeId(Integer courseKnowledgeId) {
        return courseKnowledgeMapper.deleteByCourseKnowledgeId(courseKnowledgeId);
    }

    @Override
    public Integer getCountByInfo(CourseKnowledge courseKnowledge) {
        return courseKnowledgeMapper.getCountByInfo(courseKnowledge);
    }
}
