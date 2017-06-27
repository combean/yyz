package com.bean.springboot;

import com.bean.model.Content;
import com.bean.service.ContentService;
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
public class ContentServiceTest {

    @Autowired
    private ContentService contentService;

    @Test
    public void insertContent() throws Exception {
        Content content = new Content();
        content.setContentName("测试课程内容/课件名称");
        content.setContentInfo("测试课程详细信息");
        content.setCourseId(1);
        content.setContentType(2);
        content.setAddname("zhaoyan");
        content.setAddtime(new Date());
        content.setAddid(1);
        Integer i = contentService.insertContent(content);

        Content content1 = new Content();
        content1.setContentName("测试课程内容/课件名称1");
        content1.setContentInfo("测试课程详细信息2");
        content1.setCourseId(1);
        content1.setContentType(3);
        content1.setAddname("zhaoyan");
        content1.setAddtime(new Date());
        content1.setAddid(1);
        Integer i1 = contentService.insertContent(content1);
    }

    @Test
    public void updateContent() throws Exception {
        Content content = new Content();
        content.setContentName("测试课程内容/课件名称修改");
        content.setContentInfo("测试课程详细信息修改");
        content.setCourseId(1);
        content.setContentId(1);
        content.setContentType(2);
        content.setEditname("zhaoyan");
        content.setEdittime(new Date());
        content.setEditid(1);
        contentService.updateContent(content);
    }

    @Test
    public void getContentByInfo() throws Exception {
        Map<String,String> map = new HashMap<>();
        map.put("contentId","1");
        Content m = contentService.getContentByInfo(map);
        System.out.print(m);
    }

    @Test
    public void getContentListByInfo() throws Exception {
        Map<String,String> map = new HashMap<>();
        map.put("contentName","测试");
        List<Content> m = contentService.getContentListByInfo(map);
        System.out.print(m);
    }

    @Test
    public void getContentCountByInfo() throws Exception {
        Map<String,String> map = new HashMap<>();
        map.put("contentName","测试课程");
        int count = contentService.getContentCountByInfo(map);
    }

}