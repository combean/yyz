package com.bean.springboot;

import com.bean.model.CourseKnowledge;
import com.bean.service.CourseKnowledgeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by PVer on 2017/6/27.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CourseKnowledgeServiceTest {

    @Autowired
    private CourseKnowledgeService courseKnowledgeService;

    @Test
    public void insertCourseKnowledge() throws Exception {
        List<CourseKnowledge> list = new ArrayList<>();
        CourseKnowledge courseKnowledge = new CourseKnowledge();
        courseKnowledge.setCourseId(1);
        courseKnowledge.setKnowledgeId(1);
        list.add(courseKnowledge);

        CourseKnowledge courseKnowledge1 = new CourseKnowledge();
        courseKnowledge1.setCourseId(2);
        courseKnowledge1.setKnowledgeId(2);
        list.add(courseKnowledge1);

        CourseKnowledge courseKnowledge2 = new CourseKnowledge();
        courseKnowledge2.setCourseId(1);
        courseKnowledge2.setKnowledgeId(2);
        list.add(courseKnowledge2);

        CourseKnowledge courseKnowledge3 = new CourseKnowledge();
        courseKnowledge3.setCourseId(1);
        courseKnowledge3.setKnowledgeId(3);
        list.add(courseKnowledge3);

        courseKnowledgeService.insertCourseKnowledgeList(list);
    }

    @Test
    public void insertCourseKnowledgeList() throws Exception {
        CourseKnowledge courseKnowledge = new CourseKnowledge();
        courseKnowledge.setCourseId(2);
        courseKnowledge.setKnowledgeId(2);
        courseKnowledgeService.insertCourseKnowledge(courseKnowledge);
    }

    @Test
    public void deleteByCourseId() throws Exception {
        Integer i=courseKnowledgeService.deleteByCourseId(1);
    }

    @Test
    public void getCourseKnowledgeListByInfo() throws Exception {
        CourseKnowledge courseKnowledge = new CourseKnowledge();
        courseKnowledge.setCourseId(2);
        List<CourseKnowledge> list=courseKnowledgeService.getCourseKnowledgeListByInfo(courseKnowledge);
    }

    @Test
    public void deleteByCourseKnowledgeId() throws Exception {
        Integer i = courseKnowledgeService.deleteByCourseKnowledgeId(3);
    }

    @Test
    public void getCountByInfo() throws Exception {
        CourseKnowledge courseKnowledge = new CourseKnowledge();
        courseKnowledge.setCourseId(2);
        Integer i = courseKnowledgeService.getCountByInfo(courseKnowledge);
    }

}