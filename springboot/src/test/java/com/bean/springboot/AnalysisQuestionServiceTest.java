package com.bean.springboot;

import com.bean.model.AnalysisQuestion;
import com.bean.service.AnalysisQuestionService;
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
 * Created by PVer on 2017/7/3.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AnalysisQuestionServiceTest {

    @Autowired
    private AnalysisQuestionService analysisQuestionService;

    @Test
    public void insertList() throws Exception {
        List<AnalysisQuestion> list = new ArrayList<AnalysisQuestion>();
        AnalysisQuestion analysisQuestion = new AnalysisQuestion();
        analysisQuestion.setfQuestionId(1);
        analysisQuestion.setsQuestionId(1);
        list.add(analysisQuestion);

		AnalysisQuestion analysisQuestion1 = new AnalysisQuestion();
		analysisQuestion1.setfQuestionId(1);
		analysisQuestion1.setsQuestionId(2);
		list.add(analysisQuestion1);

        AnalysisQuestion analysisQuestion2 = new AnalysisQuestion();
        analysisQuestion2.setfQuestionId(1);
        analysisQuestion2.setsQuestionId(3);
        list.add(analysisQuestion2);

        AnalysisQuestion analysisQuestion3 = new AnalysisQuestion();
        analysisQuestion3.setfQuestionId(1);
        analysisQuestion3.setsQuestionId(4);
        list.add(analysisQuestion3);

        analysisQuestionService.insertList(list);
    }

    @Test
    public void insert() throws Exception {
        AnalysisQuestion analysisQuestion = new AnalysisQuestion();
        analysisQuestion.setfQuestionId(1);
        analysisQuestion.setsQuestionId(5);

        analysisQuestionService.insert(analysisQuestion);
    }

    @Test
    public void deleteByFQuestionId() throws Exception {
        Integer i=analysisQuestionService.deleteByFQuestionId(1);
    }

    @Test
    public void getListByMap() throws Exception {
        Map<String, Object> map = new HashMap<>();
        map.put("fQuestionId",1);
        List<AnalysisQuestion> list=analysisQuestionService.getListByMap(map);
    }

    @Test
    public void deleteById() throws Exception {
        Integer i = analysisQuestionService.deleteById(2);
    }

    @Test
    public void getCountByMap() throws Exception {
        Map<String, Object> map = new HashMap<>();
        map.put("fQuestionId",1);
        int i = analysisQuestionService.getCountByMap(map);
    }

}