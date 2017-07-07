package com.bean.springboot;

import com.bean.model.FillQuestionAnswer;
import com.bean.service.FillQuestionAnswerService;
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
public class FillQuestionAnswerServiceTest {

    @Autowired
    private FillQuestionAnswerService fillQuestionAnswerService;

    @Test
    public void insertList() throws Exception {
        List<FillQuestionAnswer> list = new ArrayList<>();
        FillQuestionAnswer fillQuestionAnswer = new FillQuestionAnswer();
        fillQuestionAnswer.setQuestionId(1);
        fillQuestionAnswer.setBlankNo(1);
        fillQuestionAnswer.setAnswerInfo("第一空答案");
        list.add(fillQuestionAnswer);

        FillQuestionAnswer fillQuestionAnswer1 = new FillQuestionAnswer();
        fillQuestionAnswer1.setQuestionId(1);
        fillQuestionAnswer1.setBlankNo(1);
        fillQuestionAnswer1.setAnswerInfo("第一空答案1");
        list.add(fillQuestionAnswer1);

        FillQuestionAnswer fillQuestionAnswer2 = new FillQuestionAnswer();
        fillQuestionAnswer2.setQuestionId(1);
        fillQuestionAnswer2.setBlankNo(2);
        fillQuestionAnswer2.setAnswerInfo("第二空答案");
        list.add(fillQuestionAnswer2);

        FillQuestionAnswer fillQuestionAnswer3 = new FillQuestionAnswer();
        fillQuestionAnswer3.setQuestionId(1);
        fillQuestionAnswer3.setBlankNo(2);
        fillQuestionAnswer3.setAnswerInfo("第二空答案1");
        list.add(fillQuestionAnswer3);

        fillQuestionAnswerService.insertList(list);
    }

    @Test
    public void insert() throws Exception {
        FillQuestionAnswer fillQuestionAnswer = new FillQuestionAnswer();
        fillQuestionAnswer.setQuestionId(1);
        fillQuestionAnswer.setBlankNo(1);
        fillQuestionAnswer.setAnswerInfo("第一空答案3");
        fillQuestionAnswerService.insert(fillQuestionAnswer);
    }

    @Test
    public void deleteByQuestionId() throws Exception {
        Integer i=fillQuestionAnswerService.deleteByQuestionId(1);
    }

    @Test
    public void getListByMap() throws Exception {
        Map<String, Object> map = new HashMap<>();
        map.put("questionId",1);
        map.put("blankNo",1);
        List<FillQuestionAnswer> list=fillQuestionAnswerService.getListByMap(map);
    }

    @Test
    public void deleteById() throws Exception {
        Integer i = fillQuestionAnswerService.deleteById(5);
    }

    @Test
    public void getCountByMap() throws Exception {
        Map<String, Object> map = new HashMap<>();
        map.put("questionId",1);
        Integer i = fillQuestionAnswerService.getCountByMap(map);
    }

    @Test
    public void getAnswerByQuestionId() throws Exception {
        List<FillQuestionAnswer> fillQuestionAnswers = fillQuestionAnswerService.getAnswerByQuestionId(1);
    }

}