package com.bean.service;

import com.bean.dao.ContentMapper;
import com.bean.model.Content;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utils.MyLogger;

import java.util.List;
import java.util.Map;


@Service("contentService")
public class ContentServiceImpl implements ContentService {

    @Autowired
    private ContentMapper contentMapper;

    private MyLogger LOGGER = new MyLogger(ContentServiceImpl.class);


    @Override
    public int insertContent(Content content) {
        return contentMapper.insert(content);
    }

    @Override
    public Integer updateContent(Content content) {
        return contentMapper.update(content);
    }

    @Override
    public Content getContentByInfo(Map<String, String> map) {
        return contentMapper.getContentByInfo(map);
    }

    @Override
    public List<Content> getContentListByInfo(Map<String, String> map) {
        return contentMapper.getContentListByInfo(map);
    }

    @Override
    public Integer getContentCountByInfo(Map<String, String> map) {
        return contentMapper.getContentCountByInfo(map);
    }
}
