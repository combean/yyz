package com.bean.springboot;

import com.bean.model.PaperQuestion;
import com.bean.service.PaperQuestionService;
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
 * Created by PVer on 2017/6/29.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PaperQuestionServiceTest {

    @Autowired
    private PaperQuestionService paperQuestionService;

    @Test
    public void insertList() throws Exception {
        List<PaperQuestion> list = new ArrayList<>();
        PaperQuestion paperQuestion = new PaperQuestion();
        paperQuestion.setPaperId(1);
        paperQuestion.setQuestionId(1);
        list.add(paperQuestion);

        PaperQuestion paperQuestion1 = new PaperQuestion();
        paperQuestion1.setPaperId(2);
        paperQuestion1.setQuestionId(2);
        list.add(paperQuestion1);

        PaperQuestion paperQuestion2 = new PaperQuestion();
        paperQuestion2.setPaperId(1);
        paperQuestion2.setQuestionId(2);
        list.add(paperQuestion2);

        PaperQuestion paperQuestion3 = new PaperQuestion();
        paperQuestion3.setPaperId(1);
        paperQuestion3.setQuestionId(3);
        list.add(paperQuestion3);

        paperQuestionService.insertList(list);
    }

    @Test
    public void insert() throws Exception {
        PaperQuestion paperQuestion = new PaperQuestion();
        paperQuestion.setPaperId(2);
        paperQuestion.setQuestionId(2);
        paperQuestionService.insert(paperQuestion);
    }

    @Test
    public void deleteByPaperId() throws Exception {
        Integer i=paperQuestionService.deleteByPaperId(1);
    }

    @Test
    public void getListByMap() throws Exception {
        Map<String, Object> map = new HashMap<>();
        map.put("paperId",2);
        List<PaperQuestion> list=paperQuestionService.getListByMap(map);
    }

    @Test
    public void deleteById() throws Exception {
        Integer i = paperQuestionService.deleteById(5);
    }

    @Test
    public void getCountByMap() throws Exception {
        Map<String, Object> map = new HashMap<>();
        map.put("paperId",2);
        Integer i = paperQuestionService.getCountByMap(map);
    }

}