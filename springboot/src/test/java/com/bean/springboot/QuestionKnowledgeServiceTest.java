package com.bean.springboot;

import com.bean.model.QuestionKnowledge;
import com.bean.service.QuestionKnowledgeService;
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
public class QuestionKnowledgeServiceTest {

    @Autowired
    private QuestionKnowledgeService questionKnowledgeService;

    @Test
    public void insert() throws Exception {
        List<QuestionKnowledge> list = new ArrayList<>();
        QuestionKnowledge questionKnowledge = new QuestionKnowledge();
        questionKnowledge.setQuestionId(1);
        questionKnowledge.setKnowledgeId(1);
        list.add(questionKnowledge);

        QuestionKnowledge questionKnowledge1 = new QuestionKnowledge();
        questionKnowledge1.setQuestionId(2);
        questionKnowledge1.setKnowledgeId(2);
        list.add(questionKnowledge1);

        QuestionKnowledge questionKnowledge2 = new QuestionKnowledge();
        questionKnowledge2.setQuestionId(1);
        questionKnowledge2.setKnowledgeId(2);
        list.add(questionKnowledge2);

        QuestionKnowledge questionKnowledge3 = new QuestionKnowledge();
        questionKnowledge3.setQuestionId(1);
        questionKnowledge3.setKnowledgeId(3);
        list.add(questionKnowledge3);

        questionKnowledgeService.insertList(list);
    }

    @Test
    public void insertList() throws Exception {
        QuestionKnowledge questionKnowledge = new QuestionKnowledge();
        questionKnowledge.setQuestionId(2);
        questionKnowledge.setKnowledgeId(2);
        questionKnowledgeService.insert(questionKnowledge);
    }

    @Test
    public void deleteByQuestionId() throws Exception {
        Integer i=questionKnowledgeService.deleteByQuestionId(1);
    }

    @Test
    public void getListByMap() throws Exception {
//        QuestionKnowledge questionKnowledge = new QuestionKnowledge();
//        questionKnowledge.setQuestionId(2);
        Map<String,Object> map = new HashMap<>();
        map.put("questionId",2);
        List<QuestionKnowledge> list=questionKnowledgeService.getListByMap(map);
    }

    @Test
    public void deleteByQuestionKnowledgeId() throws Exception {
        Integer i = questionKnowledgeService.deleteById(5);
    }

    @Test
    public void getCountByMap() throws Exception {
//        QuestionKnowledge questionKnowledge = new QuestionKnowledge();
//        questionKnowledge.setQuestionId(2);
        Map<String,Object> map = new HashMap<>();
        map.put("questionId",2);
        Integer i = questionKnowledgeService.getCountByMap(map);
    }

}