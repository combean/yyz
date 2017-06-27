package com.bean.dao;

import com.bean.model.Content;

import java.util.List;
import java.util.Map;

public interface ContentMapper {

    int insert(Content content);

    Integer update(Content content);

    Content getContentByInfo(Map<String, String> map);

    List<Content> getContentListByInfo(Map<String, String> map);

    Integer getContentCountByInfo(Map<String, String> map);
}