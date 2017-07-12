package com.bean.service;

import com.bean.dao.QuestionAnswerMapper;
import com.bean.dao.QuestionKnowledgeMapper;
import com.bean.dao.QuestionMapper;
import com.bean.model.QuestionAnswer;
import com.bean.model.Question;
import com.bean.model.QuestionKnowledge;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utils.MyLogger;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@Service("questionService")
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    private QuestionMapper questionMapper;

    @Autowired
    private QuestionAnswerMapper questionAnswerMapper;

    @Autowired
    private QuestionKnowledgeMapper questionKnowledgeMapper;

    private MyLogger LOGGER = new MyLogger(QuestionServiceImpl.class);


    @Override
    public int insert(Question question) throws SQLException {
        return questionMapper.insert(question);
    }

    @Override
    public Integer update(Question question) throws SQLException {
        return questionMapper.update(question);
    }

    @Override
    public Question getByMap(Map<String, Object> map) throws SQLException {
        return questionMapper.getByMap(map);
    }

    @Override
    public List<Question> getListByMap(Map<String, Object> map) throws SQLException {
        return questionMapper.getListByMap(map);
    }

    @Override
    public Integer getQuestionCountByInfo(Map<String, Object> map) throws SQLException {
        return questionMapper.getCountByMap(map);
    }

    @Override
    public Question getById(Integer id) throws SQLException {
        return questionMapper.getById(id);
    }

    @Override
    public Question getByObj(Question question) throws SQLException {
        return questionMapper.getByObj(question);
    }

    @Override
    public int insertQuestionAnswer(Question question, List<QuestionAnswer> questionAnswers, List<QuestionKnowledge> questionKnowledges) throws SQLException {
                questionMapper.insert(question);
                for (QuestionAnswer questionAnswer: questionAnswers) {
                    questionAnswer.setQuestionId(question.getQuestionId());
                }
                for (QuestionKnowledge questionKnowledge: questionKnowledges){
                    questionKnowledge.setQuestionId(question.getQuestionId());
                }
                questionKnowledgeMapper.insertList(questionKnowledges);
         return questionAnswerMapper.insertList(questionAnswers);
    }

    @Override
    public int updateQuestionAnswer(Question question, List<QuestionAnswer> questionAnswers, List<QuestionKnowledge> questionKnowledges) throws SQLException {
        questionMapper.update(question);
        for (QuestionAnswer questionAnswer: questionAnswers) {
            questionAnswer.setQuestionId(question.getQuestionId());
        }
        for (QuestionKnowledge questionKnowledge: questionKnowledges){
            questionKnowledge.setQuestionId(question.getQuestionId());
        }
        questionKnowledgeMapper.deleteByQuestionId(question.getQuestionId());
        questionAnswerMapper.deleteByQuestionId(question.getQuestionId());
        questionKnowledgeMapper.insertList(questionKnowledges);
        return questionAnswerMapper.insertList(questionAnswers);
    }

    @Override
    public List<Question> getQuestionListByIds(List<QuestionKnowledge> questionknowledges) throws SQLException {
        return questionMapper.getQuestionListByIds(questionknowledges);
    }
}
