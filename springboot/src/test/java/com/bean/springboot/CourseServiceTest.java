package com.bean.springboot;

import com.bean.model.Course;
import com.bean.service.CourseService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by PVer on 2017/6/27.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CourseServiceTest {

    @Autowired
    private CourseService courseService;

    @Test
    public void insert() throws Exception {
        Course course = new Course();
        course.setCourseName("课程名称测试");
        course.setCourseType(1);
        course.setSubjectId(1);
        course.setAddname("zhaoyan");
        course.setAddtime(new Date());
        course.setAddid(1);
        Integer i = courseService.insert(course);

        Course course1 = new Course();
        course1.setCourseName("课程名称测试1");
        course1.setCourseType(1);
        course1.setSubjectId(1);
        course1.setAddname("zhaoyan");
        course1.setAddtime(new Date());
        course1.setAddid(1);
        Integer i1 = courseService.insert(course1);
    }

    @Test
    public void update() throws Exception {
        Course course = new Course();
        course.setCourseName("课程名称测试修改");
        course.setCourseType(1);
        course.setSubjectId(1);
        course.setCourseId(1);
        course.setDel(0);
        course.setEditname("zhaoyan");
        course.setEdittime(new Date());
        course.setEditid(1);
        courseService.update(course);
    }

    @Test
    public void getByMap() throws Exception {
        Map<String,Object> map = new HashMap<>();
        map.put("courseId","1");
        Course m = courseService.getByMap(map);
        System.out.print(m);
    }

    @Test
    public void getListByMap() throws Exception {
        Map<String,Object> map = new HashMap<>();
        map.put("courseName","课程");
        List<Course> m = courseService.getListByMap(map);
        System.out.print(m);
    }

    @Test
    public void getCountByMap() throws Exception {
        Map<String,Object> map = new HashMap<>();
        map.put("courseName","课程");
        int count = courseService.getCountByMap(map);
    }

    @Test
    public void getById() throws Exception{
        Course course=courseService.getById(1);
    }

}