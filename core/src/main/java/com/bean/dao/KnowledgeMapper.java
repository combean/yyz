package com.bean.dao;

import com.bean.model.Knowledge;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface KnowledgeMapper {
    int insert(Knowledge knowledge);

    Integer update(Knowledge knowledge);

    Knowledge getKnowledgeByInfo(Map<String,String> map);

    List<Knowledge> getKnowledgeListByInfo(Map<String,String> map);

    Integer getKnowledgeCountByInfo(Map<String,String> map);
}