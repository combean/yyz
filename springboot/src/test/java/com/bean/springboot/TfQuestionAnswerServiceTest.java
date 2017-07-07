package com.bean.springboot;

import com.bean.model.TfQuestionAnswer;
import com.bean.service.TfQuestionAnswerService;
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
 * Created by PVer on 2017/6/30.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class TfQuestionAnswerServiceTest {
    
    @Autowired
    private TfQuestionAnswerService tfQuestionAnswerService;
    
    @Test
    public void insertList() throws Exception {
        List<TfQuestionAnswer> list = new ArrayList<>();
        TfQuestionAnswer tfQuestionAnswer = new TfQuestionAnswer();
        tfQuestionAnswer.setQuestionId(1);
        tfQuestionAnswer.setAnswerTitle("A");
        tfQuestionAnswer.setAnswerType(0);
        list.add(tfQuestionAnswer);

        TfQuestionAnswer tfQuestionAnswer1 = new TfQuestionAnswer();
        tfQuestionAnswer1.setQuestionId(1);
        tfQuestionAnswer1.setAnswerTitle("B");
        tfQuestionAnswer1.setAnswerType(1);
        list.add(tfQuestionAnswer1);

        TfQuestionAnswer tfQuestionAnswer2 = new TfQuestionAnswer();
        tfQuestionAnswer2.setQuestionId(1);
        tfQuestionAnswer2.setAnswerTitle("C");
        tfQuestionAnswer2.setAnswerType(0);
        list.add(tfQuestionAnswer2);

        TfQuestionAnswer tfQuestionAnswer3 = new TfQuestionAnswer();
        tfQuestionAnswer3.setQuestionId(1);
        tfQuestionAnswer3.setAnswerTitle("D");
        tfQuestionAnswer3.setAnswerType(0);
        list.add(tfQuestionAnswer3);

        tfQuestionAnswerService.insertList(list);
    }

    @Test
    public void insert() throws Exception {
        TfQuestionAnswer tfQuestionAnswer = new TfQuestionAnswer();
        tfQuestionAnswer.setQuestionId(1);
        tfQuestionAnswer.setAnswerTitle("F");
        tfQuestionAnswer.setAnswerType(0);
        tfQuestionAnswerService.insert(tfQuestionAnswer);
    }

    @Test
    public void deleteByQuestionId() throws Exception {
        Integer i=tfQuestionAnswerService.deleteByQuestionId(1);
    }

    @Test
    public void getListByMap() throws Exception {
        Map<String, Object> map = new HashMap<>();
        map.put("questionId",1);
        List<TfQuestionAnswer> list=tfQuestionAnswerService.getListByMap(map);
    }

    @Test
    public void deleteById() throws Exception {
        Integer i = tfQuestionAnswerService.deleteById(5);
    }

    @Test
    public void getCountByMap() throws Exception {
        Map<String, Object> map = new HashMap<>();
        map.put("questionId",1);
        Integer i = tfQuestionAnswerService.getCountByMap(map);
    }

    @Test
    public void getRightAnswer() throws Exception{
        String rightItem = tfQuestionAnswerService.getRightAnswerByQuestionId(1);
    }

    @Test
    public void getRightAnswerObj() throws Exception{
        TfQuestionAnswer rightObj = tfQuestionAnswerService.getRightAnswerObjByQuestionId(1);
    }
}