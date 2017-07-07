package com.bean.springboot;

import com.bean.model.UserExamAnswer;
import com.bean.service.UserExamAnswerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.*;

import static org.junit.Assert.*;

/**
 * Created by PVer on 2017/6/29.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserExamAnswerServiceTest {

    @Autowired
    private UserExamAnswerService userExamAnswerService;

    @Test
    public void insertList() throws Exception {
        List<UserExamAnswer> list = new ArrayList<>();
        UserExamAnswer userExamAnswer = new UserExamAnswer();
        userExamAnswer.setAnswerTime(new Date());
        userExamAnswer.setAnswerInfo("A");
        userExamAnswer.setIfRight(0);
        userExamAnswer.setPaperId(1);
        userExamAnswer.setQuestionId(1);
        userExamAnswer.setUserId(1);
        userExamAnswer.setRawScore(2);
        list.add(userExamAnswer);

        UserExamAnswer userExamAnswer1 = new UserExamAnswer();
        userExamAnswer1.setAnswerTime(new Date());
        userExamAnswer1.setAnswerInfo("B");
        userExamAnswer1.setIfRight(1);
        userExamAnswer1.setPaperId(1);
        userExamAnswer1.setQuestionId(2);
        userExamAnswer1.setUserId(1);
        userExamAnswer1.setRawScore(2);
        list.add(userExamAnswer1);

        UserExamAnswer userExamAnswer2 = new UserExamAnswer();
        userExamAnswer2.setAnswerTime(new Date());
        userExamAnswer2.setAnswerInfo("B");
        userExamAnswer2.setIfRight(1);
        userExamAnswer2.setPaperId(1);
        userExamAnswer2.setQuestionId(3);
        userExamAnswer2.setUserId(1);
        userExamAnswer2.setRawScore(2);
        list.add(userExamAnswer2);

        UserExamAnswer userExamAnswer3 = new UserExamAnswer();
        userExamAnswer3.setAnswerTime(new Date());
        userExamAnswer3.setAnswerInfo("C");
        userExamAnswer3.setIfRight(0);
        userExamAnswer3.setPaperId(1);
        userExamAnswer3.setQuestionId(4);
        userExamAnswer3.setUserId(1);
        userExamAnswer3.setRawScore(2);
        list.add(userExamAnswer3);

        UserExamAnswer userExamAnswer4 = new UserExamAnswer();
        userExamAnswer4.setAnswerTime(new Date());
        userExamAnswer4.setAnswerInfo("D");
        userExamAnswer4.setIfRight(1);
        userExamAnswer4.setPaperId(1);
        userExamAnswer4.setQuestionId(5);
        userExamAnswer4.setUserId(1);
        userExamAnswer4.setRawScore(2);
        list.add(userExamAnswer4);

        userExamAnswerService.insertList(list);
    }

    @Test
    public void insert() throws Exception {

        UserExamAnswer userExamAnswer = new UserExamAnswer();
        userExamAnswer.setAnswerTime(new Date());
        userExamAnswer.setAnswerInfo("空一答案");
        userExamAnswer.setBlankNo(1);
        userExamAnswer.setIfRight(1);
        userExamAnswer.setPaperId(1);
        userExamAnswer.setQuestionId(6);
        userExamAnswer.setUserId(1);
        userExamAnswer.setRawScore(2);
        userExamAnswerService.insert(userExamAnswer);
    }

    @Test
    public void deleteByUserId() throws Exception {
        Integer i = userExamAnswerService.deleteByUserId(1);
    }

    @Test
    public void getListByMap() throws Exception {
        Map<String, Object> map = new HashMap<>();
        map.put("paperId",1);
        List<UserExamAnswer> userExamAnswers = userExamAnswerService.getListByMap(map);
    }

    @Test
    public void deleteById() throws Exception {
        Integer i = userExamAnswerService.deleteById(2);
    }

    @Test
    public void getCountByMap() throws Exception {
        Map<String, Object> map = new HashMap<>();
        map.put("paperId",1);
        Integer i = userExamAnswerService.getCountByMap(map);
    }

    @Test
    public void deleteByPaperId() throws Exception {
        Integer i = userExamAnswerService.deleteByPaperId(1);
    }

    @Test
    public void updateAnswerById() throws Exception {
        UserExamAnswer userExamAnswer = new UserExamAnswer();
        userExamAnswer.setAnswerEditTime(new Date());
        userExamAnswer.setAnswerInfo("AAAA");
        userExamAnswer.setIfRight(1);
        userExamAnswer.setUserExamAnswerId(1);
        userExamAnswer.setAnswerEditTime(new Date());

        userExamAnswerService.updateAnswerById(userExamAnswer);
    }

}