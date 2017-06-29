package com.bean.springboot;

import com.bean.model.UserExam;
import com.bean.service.UserExamService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by PVer on 2017/6/28.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserExamServiceTest {

    @Autowired
    private UserExamService userExamService;

    @Test
    public void insertUserExamList() throws Exception {
        List<UserExam> list = new ArrayList<>();
        UserExam userExam = new UserExam();
        userExam.setUserId(1);
        userExam.setExamId(1);
        list.add(userExam);

        UserExam userExam1 = new UserExam();
        userExam1.setUserId(2);
        userExam1.setExamId(2);
        list.add(userExam1);

        UserExam userExam2 = new UserExam();
        userExam2.setUserId(1);
        userExam2.setExamId(2);
        list.add(userExam2);

        UserExam userExam3 = new UserExam();
        userExam3.setUserId(1);
        userExam3.setExamId(3);
        list.add(userExam3);

        userExamService.insertList(list);
    }

    @Test
    public void insertUserExam() throws Exception {
        UserExam userExam = new UserExam();
        userExam.setUserId(2);
        userExam.setExamId(2);
        userExamService.insert(userExam);
    }

    @Test
    public void deleteByUserId() throws Exception {
        Integer i=userExamService.deleteByUserId(1);
    }

    @Test
    public void getUserExamListByInfo() throws Exception {
//        UserExam userExam = new UserExam();
//        userExam.setUserId(2);
        Map<String,Object> map = new HashMap<>();
        map.put("userId",2);
        List<UserExam> list=userExamService.getListByMap(map);
    }

    @Test
    public void deleteByUserExamId() throws Exception {
        Integer i = userExamService.deleteById(5);
    }

    @Test
    public void getCountByMap() throws Exception {
//        UserExam userExam = new UserExam();
//        userExam.setUserId(2);
        Map<String,Object> map = new HashMap<>();
        map.put("userId",2);
        Integer i = userExamService.getCountByMap(map);
    }

}