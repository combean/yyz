package com.bean.springboot;

import com.bean.model.Paper;
import com.bean.service.PaperService;
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
 * Created by PVer on 2017/6/27.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class PaperServiceTest {

    @Autowired
    private PaperService paperService;

    @Test
    public void insert() throws Exception {
        Paper paper = new Paper();
        paper.setPaperName("测试考卷名称");
        paper.setSubjectId(1);
        paper.setPaperType(1);
        paper.setExamMinutes(60);
        paper.setStartTime(new Date());
        paper.setEndTime(new Date());
        paper.setAddname("zhaoyan");
        paper.setAddtime(new Date());
        paper.setAddid(1);
        Integer i = paperService.insert(paper);

        Paper paper1 = new Paper();
        paper1.setPaperName("测试考卷名称");
        paper1.setSubjectId(1);
        paper1.setPaperType(1);
        paper1.setExamMinutes(60);
        paper1.setStartTime(new Date());
        paper1.setEndTime(new Date());
        paper1.setAddname("zhaoyan");
        paper1.setAddtime(new Date());
        paper1.setAddid(1);
        Integer i1 = paperService.insert(paper1);
    }

    @Test
    public void update() throws Exception {
        Paper paper = new Paper();
        paper.setPaperName("测试考卷名称修改");
        paper.setSubjectId(1);
        paper.setPaperType(1);
        paper.setPaperId(1);
        paper.setDel(0);
        paper.setEditname("zhaoyan");
        paper.setEdittime(new Date());
        paper.setEditid(1);
        paperService.update(paper);
    }

    @Test
    public void getByMap() throws Exception {
        Map<String,Object> map = new HashMap<>();
        map.put("paperId","1");
        Paper m = paperService.getByMap(map);
        System.out.print(m);
    }

    @Test
    public void getListByMap() throws Exception {
        Map<String,Object> map = new HashMap<>();
        map.put("paperName","测试");
        List<Paper> m = paperService.getListByMap(map);
        System.out.print(m);
    }

    @Test
    public void getCountbyMap() throws Exception {
        Map<String,Object> map = new HashMap<>();
        map.put("paperName","测试");
        int count = paperService.getCountByMap(map);
    }

}