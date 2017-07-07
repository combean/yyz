package com.bean.springboot;

import com.bean.model.ExamPaper;
import com.bean.service.ExamPaperService;
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
public class ExamPaperServiceTest {

    @Autowired
    private ExamPaperService examPaperService;

    @Test
    public void insert() throws Exception {
        List<ExamPaper> list = new ArrayList<>();
        ExamPaper examPaper = new ExamPaper();
        examPaper.setExamId(1);
        examPaper.setPaperId(1);
        list.add(examPaper);

        ExamPaper examPaper1 = new ExamPaper();
        examPaper1.setExamId(1);
        examPaper1.setPaperId(2);
        list.add(examPaper1);

        ExamPaper examPaper2 = new ExamPaper();
        examPaper2.setExamId(2);
        examPaper2.setPaperId(2);
        list.add(examPaper2);

        ExamPaper examPaper3 = new ExamPaper();
        examPaper3.setExamId(3);
        examPaper3.setPaperId(3);
        list.add(examPaper3);

        examPaperService.insertList(list);
    }

    @Test
    public void insertList() throws Exception {
        ExamPaper examPaper = new ExamPaper();
        examPaper.setExamId(3);
        examPaper.setPaperId(1);
        examPaperService.insert(examPaper);
    }

    @Test
    public void deleteByPaperId() throws Exception {
        Integer i=examPaperService.deleteByPaperId(1);
    }

    @Test
    public void getListByMap() throws Exception {
        Map<String, Object> map = new HashMap<>();
        map.put("paperId",2);
        List<ExamPaper> list=examPaperService.getListByMap(map);
    }

    @Test
    public void deleteById() throws Exception {
        Integer i = examPaperService.deleteById(4);
    }

    @Test
    public void getCountByMap() throws Exception {
        Map<String, Object> map = new HashMap<>();
        map.put("paperId",2);
        Integer i = examPaperService.getCountByMap(map);
    }

}