package com.bean.service;

import com.bean.dao.ExamPaperMapper;
import com.bean.model.ExamPaper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utils.MyLogger;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;


@Service("examPaperService")
public class ExamPaperServiceImpl implements ExamPaperService {

    @Autowired
    private ExamPaperMapper examPaperMapper;

    private MyLogger LOGGER = new MyLogger(ExamPaperServiceImpl.class);

    @Override
    public int insertList(List<ExamPaper> examPaper) throws SQLException {
        return examPaperMapper.insertList(examPaper);
    }

    @Override
    public int insert(ExamPaper examPaper) throws SQLException {
        return examPaperMapper.insert(examPaper);
    }

    @Override
    public int deleteByPaperId(Integer paperId) throws SQLException {
        return examPaperMapper.deleteByPaperId(paperId);
    }

    @Override
    public List<ExamPaper> getListByMap(Map<String, Object> map) throws SQLException {
        return examPaperMapper.getListByMap(map);
    }

    @Override
    public int deleteById(Integer id) throws SQLException {
        return examPaperMapper.deleteById(id);
    }

    @Override
    public int getCountByMap(Map<String, Object> map) throws SQLException {
        return examPaperMapper.getCountByMap(map);
    }

    @Override
    public int deleteByExamId(Integer id) throws SQLException {
        return examPaperMapper.deleteByExamId(id);
    }

    @Override
    public List<ExamPaper> getListByExamId(Integer id) throws SQLException {
        return examPaperMapper.getListByExamId(id);
    }
}
