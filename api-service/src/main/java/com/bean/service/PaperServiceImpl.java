package com.bean.service;

import com.bean.dao.PaperMapper;
import com.bean.dao.PaperQuestionMapper;
import com.bean.dao.PaperQuestionTypeMapper;
import com.bean.model.Paper;
import com.bean.model.PaperQuestion;
import com.bean.model.PaperQuestionType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utils.MyLogger;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;


@Service("paperService")
public class PaperServiceImpl implements PaperService {

    @Autowired
    private PaperMapper paperMapper;

    @Autowired
    private PaperQuestionTypeMapper paperQuestionTypeMapper;

    @Autowired
    private PaperQuestionMapper paperQuestionMapper;

    private MyLogger LOGGER = new MyLogger(PaperServiceImpl.class);


    @Override
    public int insert(Paper paper) throws SQLException {
        return paperMapper.insert(paper);
    }

    @Override
    public int update(Paper paper) throws SQLException {
        return paperMapper.update(paper);
    }

    @Override
    public Paper getByMap(Map<String, Object> map) throws SQLException {
        return paperMapper.getByMap(map);
    }

    @Override
    public List<Paper> getListByMap(Map<String, Object> map) throws SQLException {
        return paperMapper.getListByMap(map);
    }

    @Override
    public int getCountByMap(Map<String, Object> map) throws SQLException {
        return paperMapper.getCountByMap(map);
    }

    @Override
    public Paper getById(Integer id) throws SQLException {
        return paperMapper.getById(id);
    }

    @Override
    public int insertPaperQuestionType(Paper paper, List<PaperQuestionType> paperQuestionTypes, List<PaperQuestion> paperQuestions) throws SQLException {
        paperMapper.insert(paper);
        for (PaperQuestionType paperQuestionType: paperQuestionTypes) {
            paperQuestionType.setPaperId(paper.getPaperId());
        }
        for (PaperQuestion paperQuestion: paperQuestions){
            paperQuestion.setPaperId(paper.getPaperId());
        }
        paperQuestionTypeMapper.insertList(paperQuestionTypes);
        return paperQuestionMapper.insertList(paperQuestions);
    }

    @Override
    public int updatePaperQuestionType(Paper paper, List<PaperQuestionType> paperQuestionTypes, List<PaperQuestion> paperQuestions) throws SQLException {
        paperMapper.insert(paper);
        for (PaperQuestionType paperQuestionType: paperQuestionTypes) {
            paperQuestionType.setPaperId(paper.getPaperId());
        }
        for (PaperQuestion paperQuestion: paperQuestions){
            paperQuestion.setPaperId(paper.getPaperId());
        }
        paperQuestionTypeMapper.deleteByPaperId(paper.getPaperId());
        paperQuestionMapper.deleteByPaperId(paper.getPaperId());
        paperQuestionTypeMapper.insertList(paperQuestionTypes);
        return paperQuestionMapper.insertList(paperQuestions);
    }
}
