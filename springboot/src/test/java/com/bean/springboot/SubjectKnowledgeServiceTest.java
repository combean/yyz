package com.bean.springboot;

import com.bean.model.SubjectKnowledge;
import com.bean.service.SubjectKnowledgeService;
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
 * Created by PVer on 2017/6/27.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SubjectKnowledgeServiceTest {

    @Autowired
    private SubjectKnowledgeService subjectKnowledgeService;

    @Test
    public void insert() throws Exception {
        List<SubjectKnowledge> list = new ArrayList<>();
        SubjectKnowledge subjectKnowledge = new SubjectKnowledge();
        subjectKnowledge.setSubjectId(1);
        subjectKnowledge.setKnowledgeId(1);
        list.add(subjectKnowledge);

        SubjectKnowledge subjectKnowledge1 = new SubjectKnowledge();
        subjectKnowledge1.setSubjectId(2);
        subjectKnowledge1.setKnowledgeId(2);
        list.add(subjectKnowledge1);

        SubjectKnowledge subjectKnowledge2 = new SubjectKnowledge();
        subjectKnowledge2.setSubjectId(1);
        subjectKnowledge2.setKnowledgeId(2);
        list.add(subjectKnowledge2);

        SubjectKnowledge subjectKnowledge3 = new SubjectKnowledge();
        subjectKnowledge3.setSubjectId(1);
        subjectKnowledge3.setKnowledgeId(3);
        list.add(subjectKnowledge3);

        subjectKnowledgeService.insertList(list);
    }

    @Test
    public void insertList() throws Exception {
        SubjectKnowledge subjectKnowledge = new SubjectKnowledge();
        subjectKnowledge.setSubjectId(2);
        subjectKnowledge.setKnowledgeId(2);
        subjectKnowledgeService.insert(subjectKnowledge);
    }

    @Test
    public void deleteBySubjectId() throws Exception {
        Integer i=subjectKnowledgeService.deleteBySubjectId(1);
    }

    @Test
    public void getListByMap() throws Exception {
//        SubjectKnowledge subjectKnowledge = new SubjectKnowledge();
//        subjectKnowledge.setSubjectId(2);
        Map<String, Object> map = new HashMap<>();
        map.put("subjectId",2);
        List<SubjectKnowledge> list=subjectKnowledgeService.getListByMap(map);
    }

    @Test
    public void deleteBySubjectKnowledgeId() throws Exception {
        Integer i = subjectKnowledgeService.deleteById(5);
    }

    @Test
    public void getCountByMap() throws Exception {
//        SubjectKnowledge subjectKnowledge = new SubjectKnowledge();
//        subjectKnowledge.setSubjectId(2);
        Map<String, Object> map = new HashMap<>();
        map.put("subjectId",2);
        Integer i = subjectKnowledgeService.getCountByMap(map);
    }

}