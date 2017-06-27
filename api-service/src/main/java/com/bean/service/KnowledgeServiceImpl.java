package com.bean.service;

import com.bean.dao.KnowledgeMapper;
import com.bean.model.Knowledge;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utils.MyLogger;

import java.util.List;
import java.util.Map;


@Service("kowledgeService")
public class KnowledgeServiceImpl implements KnowledgeService {

    @Autowired
    private KnowledgeMapper knowledgeMapper;

    private MyLogger LOGGER = new MyLogger(KnowledgeServiceImpl.class);


    @Override
    public int insertKnowledge(Knowledge kowledge) {
        return knowledgeMapper.insert(kowledge);
    }

    @Override
    public Integer updateKnowledge(Knowledge kowledge) {
        return knowledgeMapper.update(kowledge);
    }

    @Override
    public Knowledge getKnowledgeByInfo(Map<String, String> map) {
        return knowledgeMapper.getKnowledgeByInfo(map);
    }

    @Override
    public List<Knowledge> getKnowledgeListByInfo(Map<String, String> map) {
        return knowledgeMapper.getKnowledgeListByInfo(map);
    }

    @Override
    public Integer getKnowledgeCountByInfo(Map<String, String> map) {
        return knowledgeMapper.getKnowledgeCountByInfo(map);
    }
}
