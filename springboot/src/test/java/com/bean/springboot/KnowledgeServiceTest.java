package com.bean.springboot;

import com.bean.model.Knowledge;
import com.bean.service.KnowledgeService;
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
 * Created by PVer on 2017/6/26.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class KnowledgeServiceTest {

    @Autowired
    private KnowledgeService knowledgeService;

    @Test
    public void insertKnowledge() throws Exception {
        Knowledge knowledge = new Knowledge();
        knowledge.setKnowledgeName("测试知识点");
        knowledge.setMemo("测试知识点备注内容");
        knowledge.setAddname("zhaoyan");
        knowledge.setAddid(1);
        knowledge.setAddtime(new Date());

        knowledgeService.insertKnowledge(knowledge);

        Knowledge knowledge1 = new Knowledge();
        knowledge1.setKnowledgeName("测试知识点1");
        knowledge1.setMemo("测试知识点备注内容1");
        knowledge1.setAddname("zhaoyan");
        knowledge1.setAddid(1);
        knowledge1.setAddtime(new Date());

        knowledgeService.insertKnowledge(knowledge1);
    }

    @Test
    public void updateKnowledge() throws Exception {
        Knowledge knowledge = new Knowledge();
        knowledge.setKnowledgeName("测试知识点修改修改");
        knowledge.setKnowledgeId(1);
        knowledge.setMemo("测试知识点备注修改修改");
        knowledge.setEditid(1);
        knowledge.setEditname("zhaoyan");
        knowledge.setEdittime(new Date());

        knowledgeService.updateKnowledge(knowledge);
    }

    @Test
    public void getKnowledgeByInfo() throws Exception {
        Map<String,String> map = new HashMap<>();
        map.put("knowledgeName","测试知识点修改");

        Knowledge u=knowledgeService.getKnowledgeByInfo(map);
        System.out.println(u);
    }

    @Test
    public void getKnowledgeListByInfo() throws Exception {
        Map<String,String> map = new HashMap<>();
        map.put("knowledgeName","测试");

        List<Knowledge> u = knowledgeService.getKnowledgeListByInfo(map);
        System.out.println(u);
    }

    @Test
    public void getKnowledgeCountByInfo() throws Exception {
        Map<String,String> map = new HashMap<>();
        map.put("knowledgeName","测试");
        Integer count = knowledgeService.getKnowledgeCountByInfo(map);
        System.out.print(count);
    }

}