package com.bean.service;

import com.bean.dao.QuestionKnowledgeMapper;
import com.bean.model.Knowledge;
import com.bean.model.QuestionKnowledge;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utils.MyLogger;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;


@Service("questionKnowledgeService")
public class QuestionKnowledgeServiceImpl implements QuestionKnowledgeService {

    @Autowired
    private QuestionKnowledgeMapper questionKnowledgeMapper;

    private MyLogger LOGGER = new MyLogger(QuestionKnowledgeServiceImpl.class);

    @Override
    public int insertList(List<QuestionKnowledge> questionKnowledge) throws SQLException {
        return questionKnowledgeMapper.insertList(questionKnowledge);
    }

    @Override
    public int insert(QuestionKnowledge questionKnowledge) throws SQLException {
        return questionKnowledgeMapper.insert(questionKnowledge);
    }

    @Override
    public int deleteByQuestionId(Integer managerId) {
        return questionKnowledgeMapper.deleteByQuestionId(managerId);
    }

    @Override
    public List<QuestionKnowledge> getListByMap(Map<String, Object> map) throws SQLException {
        return questionKnowledgeMapper.getListByMap(map);
    }

    @Override
    public int deleteById(Integer id) throws SQLException {
        return questionKnowledgeMapper.deleteById(id);
    }

    @Override
    public int getCountByMap(Map<String, Object> map) throws SQLException {
        return questionKnowledgeMapper.getCountByMap(map);
    }

    @Override
    public List<QuestionKnowledge> getListByObj(QuestionKnowledge questionKnowledge) throws SQLException {
        return questionKnowledgeMapper.getListByObj(questionKnowledge);
    }

    @Override
    public List<QuestionKnowledge> getListByKnowledgeIds(List<Knowledge> knowledges) throws SQLException {
        return questionKnowledgeMapper.getListByKnowledgeIds(knowledges);
    }

    @Override
    public List<QuestionKnowledge> getListByQuestionId(Integer questionId) throws SQLException {
        return questionKnowledgeMapper.getListByQuestionId(questionId);
    }
}
