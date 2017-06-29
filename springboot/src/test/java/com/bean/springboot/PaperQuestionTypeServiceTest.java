package com.bean.springboot;

import com.bean.model.PaperQuestionType;
import com.bean.service.PaperQuestionTypeService;
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
public class PaperQuestionTypeServiceTest {

    @Autowired
    private PaperQuestionTypeService paperQuestionTypeService;

    @Test
    public void insert() throws Exception {
        List<PaperQuestionType> list = new ArrayList<>();
        PaperQuestionType paperQuestionType = new PaperQuestionType();
        paperQuestionType.setTypeSequence(1);
        paperQuestionType.setTypeId(1);
        paperQuestionType.setPaperId(1);
        list.add(paperQuestionType);

        PaperQuestionType paperQuestionType1 = new PaperQuestionType();
        paperQuestionType1.setTypeSequence(2);
        paperQuestionType1.setTypeId(2);
        paperQuestionType1.setPaperId(1);
        list.add(paperQuestionType1);

        PaperQuestionType paperQuestionType2 = new PaperQuestionType();
        paperQuestionType2.setTypeSequence(3);
        paperQuestionType2.setTypeId(3);
        paperQuestionType2.setPaperId(1);
        list.add(paperQuestionType2);

        PaperQuestionType paperQuestionType3 = new PaperQuestionType();
        paperQuestionType3.setTypeSequence(4);
        paperQuestionType3.setTypeId(4);
        paperQuestionType3.setPaperId(1);;
        list.add(paperQuestionType3);

        paperQuestionTypeService.insertList(list);
    }

    @Test
    public void insertList() throws Exception {
        PaperQuestionType paperQuestionType = new PaperQuestionType();
        paperQuestionType.setTypeSequence(5);
        paperQuestionType.setTypeId(5);
        paperQuestionType.setPaperId(1);;
        paperQuestionTypeService.insert(paperQuestionType);
    }

    @Test
    public void deleteByPaperId() throws Exception {
        Integer i=paperQuestionTypeService.deleteByPaperId(1);
    }

    @Test
    public void getListByMap() throws Exception {
//        PaperQuestionType paperQuestionType = new PaperQuestionType();
//        paperQuestionType.setPaperId(1);
        Map<String,Object> map = new HashMap<>();
        map.put("paperId",1);
        List<PaperQuestionType> list=paperQuestionTypeService.getListByMap(map);
    }

    @Test
    public void deleteByPaperQuestionTypeId() throws Exception {
        Integer i = paperQuestionTypeService.deleteById(6);
    }

    @Test
    public void getCountByMap() throws Exception {
//        PaperQuestionType paperQuestionType = new PaperQuestionType();
//        paperQuestionType.setPaperId(1);
        Map<String,Object> map = new HashMap<>();
        map.put("paperId",1);
        Integer i = paperQuestionTypeService.getCountByMap(map);
    }

}