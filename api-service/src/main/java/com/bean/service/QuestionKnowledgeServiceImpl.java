package com.bean.service;

import com.bean.dao.QuestionKnowledgeMapper;
import com.bean.model.QuestionKnowledge;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utils.MyLogger;

import java.util.List;


@Service("questionKnowledgeService")
public class QuestionKnowledgeServiceImpl implements QuestionKnowledgeService {

    @Autowired
    private QuestionKnowledgeMapper questionKnowledgeMapper;

    private MyLogger LOGGER = new MyLogger(QuestionKnowledgeServiceImpl.class);

    @Override
    public int insertQuestionKnowledgeList(List<QuestionKnowledge> questionKnowledge){
        return questionKnowledgeMapper.insertList(questionKnowledge);
    }

    @Override
    public int insertQuestionKnowledge(QuestionKnowledge questionKnowledge) {
        return questionKnowledgeMapper.insert(questionKnowledge);
    }

    @Override
    public Integer deleteByQuestionId(Integer managerId) {
        return questionKnowledgeMapper.deleteByQuestionId(managerId);
    }

    @Override
    public List<QuestionKnowledge> getQuestionKnowledgeListByInfo(QuestionKnowledge questionKnowledge) {
        return questionKnowledgeMapper.getQuestionKnowledgeListByInfo(questionKnowledge);
    }

    @Override
    public Integer deleteByQuestionKnowledgeId(Integer questionKnowledgeId) {
        return questionKnowledgeMapper.deleteByQuestionKnowledgeId(questionKnowledgeId);
    }

    @Override
    public Integer getCountByInfo(QuestionKnowledge questionKnowledge) {
        return questionKnowledgeMapper.getCountByInfo(questionKnowledge);
    }
}
