package com.bean.springboot;

import com.bean.model.QuestionAnswer;
import com.bean.service.QuestionAnswerService;
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
 * Created by PVer on 2017/6/30.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class QuestionAnswerServiceTest {
    
    @Autowired
    private QuestionAnswerService questionAnswerService;
    
    @Test
    public void insertList() throws Exception {
        List<QuestionAnswer> list = new ArrayList<>();
        QuestionAnswer questionAnswer = new QuestionAnswer();
        questionAnswer.setQuestionId(1);
        questionAnswer.setAnswerTitle("A");
        questionAnswer.setAnswerInfo("备选项1");
        questionAnswer.setAnswerType(0);
        list.add(questionAnswer);

        QuestionAnswer questionAnswer1 = new QuestionAnswer();
        questionAnswer1.setQuestionId(1);
        questionAnswer1.setAnswerTitle("B");
        questionAnswer1.setAnswerInfo("备选项2");
        questionAnswer1.setAnswerType(1);
        list.add(questionAnswer1);

        QuestionAnswer questionAnswer2 = new QuestionAnswer();
        questionAnswer2.setQuestionId(1);
        questionAnswer2.setAnswerTitle("C");
        questionAnswer2.setAnswerInfo("备选项3");
        questionAnswer2.setAnswerType(0);
        list.add(questionAnswer2);

        QuestionAnswer questionAnswer3 = new QuestionAnswer();
        questionAnswer3.setQuestionId(1);
        questionAnswer3.setAnswerTitle("D");
        questionAnswer3.setAnswerInfo("备选项4");
        questionAnswer3.setAnswerType(0);
        list.add(questionAnswer3);

        questionAnswerService.insertList(list);
    }

    @Test
    public void insert() throws Exception {
        QuestionAnswer questionAnswer = new QuestionAnswer();
        questionAnswer.setQuestionId(1);
        questionAnswer.setAnswerTitle("F");
        questionAnswer.setAnswerInfo("备选项5");
        questionAnswer.setAnswerType(1);
        questionAnswerService.insert(questionAnswer);
    }

    @Test
    public void deleteByQuestionId() throws Exception {
        Integer i=questionAnswerService.deleteByQuestionId(1);
    }

    @Test
    public void getListByMap() throws Exception {
        Map<String, Object> map = new HashMap<>();
        map.put("questionId",1);
        List<QuestionAnswer> list=questionAnswerService.getListByMap(map);
    }

    @Test
    public void deleteById() throws Exception {
        Integer i = questionAnswerService.deleteById(5);
    }

    @Test
    public void getCountByMap() throws Exception {
        Map<String, Object> map = new HashMap<>();
        map.put("questionId",1);
        Integer i = questionAnswerService.getCountByMap(map);
    }

    @Test
    public void getRightAnswer() throws Exception{
        String rightItem = questionAnswerService.getRightAnswerByQuestionId(1);
    }

    @Test
    public void getRightAnswerObj() throws Exception{
        QuestionAnswer rightObj = questionAnswerService.getRightAnswerObjByQuestionId(1);
    }

    @Test
    public void getRightAnswerList() throws Exception{
        List<QuestionAnswer> rightObj = questionAnswerService.getRightAnswerListByQuestionId(1);
    }
}