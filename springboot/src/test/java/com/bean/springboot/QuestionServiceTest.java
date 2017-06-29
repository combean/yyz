package com.bean.springboot;

import com.bean.model.Question;
import com.bean.service.QuestionService;
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
 * Created by PVer on 2017/6/28.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class QuestionServiceTest {

    @Autowired
    private QuestionService questionService;

    @Test
    public void insertQuestion() throws Exception {
        Question question = new Question();
        question.setQuestionTitle("测试试题题干");
        question.setQuestionLevel(0);
        question.setQuestionType(1);
        question.setAddname("zhaoyan");
        question.setAddtime(new Date());
        question.setAddid(1);
        Integer i = questionService.insert(question);

        Question question1 = new Question();
        question1.setQuestionTitle("测试试题题干1");
        question1.setQuestionLevel(1);
        question1.setQuestionType(2);
        question1.setMemo("测试试题备注");
        question1.setAddname("zhaoyan");
        question1.setAddtime(new Date());
        question1.setAddid(1);
        Integer i1 = questionService.insert(question1);
    }

    @Test
    public void updateQuestion() throws Exception {
        Question question = new Question();
        question.setQuestionTitle("测试试题题干修改");
        question.setQuestionLevel(0);
        question.setQuestionType(1);
        question.setQuestionId(1);
        question.setMemo("测试试题备注修改");
        question.setDel(0);
        question.setEditname("zhaoyan");
        question.setEdittime(new Date());
        question.setEditid(1);
        questionService.update(question);
    }

    @Test
    public void getByMap() throws Exception {
        Map<String,Object> map = new HashMap<>();
        map.put("questionId","1");
        map.put("questionTitle","测试试题题干修改");
        Question m = questionService.getByMap(map);
        System.out.print(m);
    }

    @Test
    public void getListByMap() throws Exception {
        Map<String,Object> map = new HashMap<>();
        map.put("questionTitle","测试");
        List<Question> m = questionService.getListByMap(map);
        System.out.print(m);
    }

    @Test
    public void getQuestionCountByInfo() throws Exception {
        Map<String,Object> map = new HashMap<>();
        map.put("questionTitle","测试");
        int count = questionService.getQuestionCountByInfo(map);
    }

}