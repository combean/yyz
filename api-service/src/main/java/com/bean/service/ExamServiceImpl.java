package com.bean.service;

import com.bean.dao.ExamMapper;
import com.bean.dao.ExamPaperMapper;
import com.bean.dao.UserExamMapper;
import com.bean.model.Exam;
import com.bean.model.ExamPaper;
import com.bean.model.UserExam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utils.MyLogger;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;


@Service("examService")
public class ExamServiceImpl implements ExamService {

    @Autowired
    private ExamMapper examMapper;

    @Autowired
    private ExamPaperMapper examPaperMapper;

    @Autowired
    private UserExamMapper userExamMapper;

    private MyLogger LOGGER = new MyLogger(ExamServiceImpl.class);


    @Override
    public int insert(Exam exam) throws SQLException {
        return examMapper.insert(exam);
    }

    @Override
    public Integer update(Exam exam) throws SQLException {
        return examMapper.update(exam);
    }

    @Override
    public Exam getByMap(Map<String, Object> map) throws SQLException {
        return examMapper.getByMap(map);
    }

    @Override
    public List<Exam> getListByMap(Map<String, Object> map) throws SQLException {
        return examMapper.getListByMap(map);
    }

    @Override
    public Integer getCountByMap(Map<String, Object> map) throws SQLException {
        return examMapper.getCountByMap(map);
    }

    @Override
    public Exam getById(Integer id) throws SQLException {
        return examMapper.getById(id);
    }

    @Override
    public Exam getByObj(Exam exam) throws SQLException {
        return examMapper.getByObj(exam);
    }

    @Override
    public int insertExamPaper(Exam exam, List<ExamPaper> examPapers, List<UserExam> userExams) throws SQLException {
        examMapper.insert(exam);
        for (ExamPaper ep: examPapers){
            ep.setExamId(exam.getExamId());
        }
        for (UserExam ue:userExams) {
            ue.setExamId(exam.getExamId());
        }
        userExamMapper.insertList(userExams);
        return examPaperMapper.insertList(examPapers);
    }

    @Override
    public int updateExamPaper(Exam exam, List<ExamPaper> examPapers, List<UserExam> userExams) throws SQLException {
        examMapper.update(exam);
        for (ExamPaper ep: examPapers){
            ep.setExamId(exam.getExamId());
        }
        for (UserExam ue:userExams) {
            ue.setExamId(exam.getExamId());
        }
        userExamMapper.deleteByExamId(exam.getExamId());
        examPaperMapper.deleteByExamId(exam.getExamId());
        userExamMapper.insertList(userExams);
        return examPaperMapper.insertList(examPapers);
    }
}
