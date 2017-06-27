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
    public void insertCourse() throws Exception {
        Course course = new Course();
        course.setCourseName("课程名称测试");
        course.setCourseType(1);
        course.setSubjectId(1);
        course.setAddname("zhaoyan");
        course.setAddtime(new Date());
        course.setAddid(1);
        Integer i = courseService.insertCourse(course);

        Course course1 = new Course();
        course1.setCourseName("课程名称测试1");
        course1.setCourseType(1);
        course1.setSubjectId(1);
        course1.setAddname("zhaoyan");
        course1.setAddtime(new Date());
        course1.setAddid(1);
        Integer i1 = courseService.insertCourse(course1);
    }

    @Test
    public void updateCourse() throws Exception {
        Course course = new Course();
        course.setCourseName("课程名称测试修改");
        course.setCourseType(1);
        course.setSubjectId(1);
        course.setCourseId(1);
        course.setDel(0);
        course.setEditname("zhaoyan");
        course.setEdittime(new Date());
        course.setEditid(1);
        courseService.updateCourse(course);
    }

    @Test
    public void getCourseByInfo() throws Exception {
        Map<String,String> map = new HashMap<>();
        map.put("courseId","1");
        Course m = courseService.getCourseByInfo(map);
        System.out.print(m);
    }

    @Test
    public void getCourseListByInfo() throws Exception {
        Map<String,String> map = new HashMap<>();
        map.put("courseName","课程");
        List<Course> m = courseService.getCourseListByInfo(map);
        System.out.print(m);
    }

    @Test
    public void getCourseCountByInfo() throws Exception {
        Map<String,String> map = new HashMap<>();
        map.put("courseName","课程");
        int count = courseService.getCourseCountByInfo(map);
    }

}