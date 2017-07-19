package com.bean.springboot.controller;

import com.bean.RSTFul.RSTFulBody;
import com.bean.model.Course;
import com.bean.model.CourseKnowledge;
import com.bean.service.ContentService;
import com.bean.service.CourseKnowledgeService;
import com.bean.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;
import java.util.*;

/**
 * Created by PVer on 2017/7/19.
 */
@RestController
@RequestMapping("/course")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @Autowired
    private ContentService contentService;

    @Autowired
    private CourseKnowledgeService courseKnowledgeService;

    @RequestMapping("/add")
    public RSTFulBody add(Course course,String knowledgeIds,HttpServletRequest request) throws SQLException {
        RSTFulBody rstFulBody = new RSTFulBody();
        course.setAddname(request.getSession().getAttribute("userName")+"");
        course.setAddid(Integer.parseInt(request.getSession().getAttribute("userId")+""));
        course.setAddtime(new Date());
        //知识点
        String[] knowledgeIdArray = knowledgeIds.split(",");
        List<CourseKnowledge> courseKnowledges = new ArrayList<>();
        for (String knowledgeId : knowledgeIdArray){
            CourseKnowledge courseKnowledge = new CourseKnowledge();
            courseKnowledge.setKnowledgeId(Integer.parseInt(knowledgeId));
            courseKnowledges.add(courseKnowledge);
        }
        int i = courseService.updateCourseKnowledge(course,courseKnowledges);
        if(i>0) rstFulBody.setCode(1);
        else rstFulBody.setCode(0);
        return rstFulBody;
    }

    @RequestMapping("/edit")
    public RSTFulBody edit(Course course,String knowledgeIds,HttpServletRequest request) throws SQLException {
        RSTFulBody rstFulBody = new RSTFulBody();
        course.setEditname(request.getSession().getAttribute("userName")+"");
        course.setEditid(Integer.parseInt(request.getSession().getAttribute("userId")+""));
        course.setEdittime(new Date());
        //知识点
        String[] knowledgeIdArray = knowledgeIds.split(",");
        List<CourseKnowledge> courseKnowledges = new ArrayList<>();
        for (String knowledgeId : knowledgeIdArray){
            CourseKnowledge courseKnowledge = new CourseKnowledge();
            courseKnowledge.setKnowledgeId(Integer.parseInt(knowledgeId));
            courseKnowledges.add(courseKnowledge);
        }
        int i = courseService.updateCourseKnowledge(course,courseKnowledges);
        if(i>0) rstFulBody.setCode(1);
        else rstFulBody.setCode(0);
        return rstFulBody;
    }

    @RequestMapping("/getAllCourse")
    public List<Course> getAllCourse(Course course) throws SQLException {
        Map<String,Object> map = new HashMap<>();
        map.put("del",1);
        if(course.getCourseId()!=null) map.put("courseId",course.getCourseId());
        if(course.getSubjectId()!=null) map.put("subjectId",course.getSubjectId());
        if(course.getCourseType()!=null) map.put("courseType",course.getCourseType());
        if(course.getCourseName()!=null) map.put("courseName",course.getCourseName());

        List<Course> courses = courseService.getListByMap(map);
        for (Course c: courses) {
            c.setCourseKnowledges(courseKnowledgeService.getListByCourseId(c.getCourseId()));
        }
        return courses;
    }
}
