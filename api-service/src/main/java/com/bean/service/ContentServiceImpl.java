package com.bean.service;

import com.bean.dao.ContentMapper;
import com.bean.model.Content;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utils.MyLogger;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;


@Service("contentService")
public class ContentServiceImpl implements ContentService {

    @Autowired
    private ContentMapper contentMapper;

    private MyLogger LOGGER = new MyLogger(ContentServiceImpl.class);


    @Override
    public int insert(Content content) throws SQLException {
        return contentMapper.insert(content);
    }

    @Override
    public Integer update(Content content) throws SQLException {
        return contentMapper.update(content);
    }

    @Override
    public Content getByMap(Map<String, Object> map) throws SQLException {
        return contentMapper.getByMap(map);
    }

    @Override
    public List<Content> getListByMap(Map<String, Object> map) throws SQLException {
        return contentMapper.getListByMap(map);
    }

    @Override
    public Integer getCountByMap(Map<String, Object> map) throws SQLException {
        return contentMapper.getCountByMap(map);
    }

    @Override
    public Content getById(Integer id) throws SQLException{
        return contentMapper.getById(id);
    }
}
