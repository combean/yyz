package com.bean.springboot;

import com.bean.model.ChoiceQuestionAnswer;
import com.bean.service.ChoiceQuestionAnswerService;
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
public class ChoiceQuestionAnswerServiceTest {
    
    @Autowired
    private ChoiceQuestionAnswerService choiceQuestionAnswerService;
    
    @Test
    public void insertList() throws Exception {
        List<ChoiceQuestionAnswer> list = new ArrayList<>();
        ChoiceQuestionAnswer choiceQuestionAnswer = new ChoiceQuestionAnswer();
        choiceQuestionAnswer.setQuestionId(1);
        choiceQuestionAnswer.setAnswerTitle("A");
        choiceQuestionAnswer.setAnswerInfo("备选项1");
        choiceQuestionAnswer.setAnswerType(0);
        list.add(choiceQuestionAnswer);

        ChoiceQuestionAnswer choiceQuestionAnswer1 = new ChoiceQuestionAnswer();
        choiceQuestionAnswer1.setQuestionId(1);
        choiceQuestionAnswer1.setAnswerTitle("B");
        choiceQuestionAnswer1.setAnswerInfo("备选项2");
        choiceQuestionAnswer1.setAnswerType(1);
        list.add(choiceQuestionAnswer1);

        ChoiceQuestionAnswer choiceQuestionAnswer2 = new ChoiceQuestionAnswer();
        choiceQuestionAnswer2.setQuestionId(1);
        choiceQuestionAnswer2.setAnswerTitle("C");
        choiceQuestionAnswer2.setAnswerInfo("备选项3");
        choiceQuestionAnswer2.setAnswerType(0);
        list.add(choiceQuestionAnswer2);

        ChoiceQuestionAnswer choiceQuestionAnswer3 = new ChoiceQuestionAnswer();
        choiceQuestionAnswer3.setQuestionId(1);
        choiceQuestionAnswer3.setAnswerTitle("D");
        choiceQuestionAnswer3.setAnswerInfo("备选项4");
        choiceQuestionAnswer3.setAnswerType(0);
        list.add(choiceQuestionAnswer3);

        choiceQuestionAnswerService.insertList(list);
    }

    @Test
    public void insert() throws Exception {
        ChoiceQuestionAnswer choiceQuestionAnswer = new ChoiceQuestionAnswer();
        choiceQuestionAnswer.setQuestionId(1);
        choiceQuestionAnswer.setAnswerTitle("F");
        choiceQuestionAnswer.setAnswerInfo("备选项5");
        choiceQuestionAnswer.setAnswerType(1);
        choiceQuestionAnswerService.insert(choiceQuestionAnswer);
    }

    @Test
    public void deleteByQuestionId() throws Exception {
        Integer i=choiceQuestionAnswerService.deleteByQuestionId(1);
    }

    @Test
    public void getListByMap() throws Exception {
        Map<String, Object> map = new HashMap<>();
        map.put("questionId",1);
        List<ChoiceQuestionAnswer> list=choiceQuestionAnswerService.getListByMap(map);
    }

    @Test
    public void deleteById() throws Exception {
        Integer i = choiceQuestionAnswerService.deleteById(5);
    }

    @Test
    public void getCountByMap() throws Exception {
        Map<String, Object> map = new HashMap<>();
        map.put("questionId",1);
        Integer i = choiceQuestionAnswerService.getCountByMap(map);
    }

    @Test
    public void getRightAnswer() throws Exception{
        String rightItem = choiceQuestionAnswerService.getRightAnswerByQuestionId(1);
    }

    @Test
    public void getRightAnswerObj() throws Exception{
        ChoiceQuestionAnswer rightObj = choiceQuestionAnswerService.getRightAnswerObjByQuestionId(1);
    }

    @Test
    public void getRightAnswerList() throws Exception{
        List<ChoiceQuestionAnswer> rightObj = choiceQuestionAnswerService.getRightAnswerListByQuestionId(1);
    }
}