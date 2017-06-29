package com.bean.springboot;

import com.bean.model.CourseKnowledge;
import com.bean.service.CourseKnowledgeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by PVer on 2017/6/27.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CourseKnowledgeServiceTest {

    @Autowired
    private CourseKnowledgeService courseKnowledgeService;

    @Test
    public void insert() throws Exception {
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

        courseKnowledgeService.insertList(list);
    }

    @Test
    public void insertList() throws Exception {
        CourseKnowledge courseKnowledge = new CourseKnowledge();
        courseKnowledge.setCourseId(2);
        courseKnowledge.setKnowledgeId(2);
        courseKnowledgeService.insert(courseKnowledge);
    }

    @Test
    public void deleteByCourseId() throws Exception {
        Integer i=courseKnowledgeService.deleteByCourseId(1);
    }

    @Test
    public void getListByMap() throws Exception {
//        CourseKnowledge courseKnowledge = new CourseKnowledge();
//        courseKnowledge.setCourseId(2);
        Map<String, Object> map = new HashMap<>();
        map.put("courseId",2);
        List<CourseKnowledge> list=courseKnowledgeService.getListByMap(map);
    }

    @Test
    public void deleteByCourseKnowledgeId() throws Exception {
        Integer i = courseKnowledgeService.deleteById(3);
    }

    @Test
    public void getCountByMap() throws Exception {
//        CourseKnowledge courseKnowledge = new CourseKnowledge();
//        courseKnowledge.setCourseId(2);
        Map<String, Object> map = new HashMap<>();
        map.put("courseId",2);
        Integer i = courseKnowledgeService.getCountByMap(map);
    }

}