package com.bean.springboot.controller;

import com.bean.RSTFul.RSTFulBody;
import com.bean.model.Exam;
import com.bean.model.ExamPaper;
import com.bean.model.Paper;
import com.bean.model.ResultJson;
import com.bean.service.ExamPaperService;
import com.bean.service.ExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;
import java.util.*;

/**
 * Created by PVer on 2017/7/5.
 */
@RestController
@RequestMapping("/exam")
public class ExamContoller {

    @Autowired
    private ExamService examService;

    @Autowired
    private ExamPaperService examPaperService;

    @RequestMapping("/getAllExam")
    public List<Exam> getAllExam(Exam exam) throws SQLException {
        //搜索条件
        Map<String, Object> map = new HashMap<>();
        map.put("del",1);
        if(exam.getExamName()!=null || exam.getExamName()!="") map.put("examName",exam.getExamName());
        if(exam.getExamType()!=null) map.put("examType",exam.getExamType());
        if(exam.getSubjectId()!=null) map.put("subjectId",exam.getSubjectId());
        if(exam.getOptionTheory()!=null) map.put("optionTheory",exam.getOptionTheory());
        if(exam.getPlaceId()!=null) map.put("placeId",exam.getPlaceId());
        if(exam.getPaperId()!=null) map.put("paperId",exam.getPaperId());
        List<Exam> exams = examService.getListByMap(map);
        return exams;
    }

    @RequestMapping("/add")
    public RSTFulBody add(Exam exam, HttpServletRequest request) throws SQLException {

        RSTFulBody resObject = new RSTFulBody();
        exam.setAddname(request.getSession().getAttribute("userName")+"");
        exam.setAddid(Integer.parseInt(request.getSession().getAttribute("userId")+""));
        exam.setAddtime(new Date());
        //考试卷
        String paperIdsStr = request.getParameter("paperIdsStr");
        String[] paperIds = paperIdsStr.split(",");
        List<ExamPaper> examPapers = new ArrayList<>();
        for (String pid : paperIds){
            ExamPaper examPaper = new ExamPaper();
            examPaper.setPaperId(Integer.parseInt(pid));
            examPapers.add(examPaper);
        }
        int i = examService.insertExamPaper(exam,examPapers);
        if(i>0) resObject.setCode(1);
        else resObject.setCode(0);
        return resObject;
    }

    @RequestMapping("/edit")
    public RSTFulBody edit(Exam exam,HttpServletRequest request) throws SQLException {
        RSTFulBody resObject = new RSTFulBody();
        exam.setEditname(request.getSession().getAttribute("userName")+"");
        exam.setEditid(Integer.parseInt(request.getSession().getAttribute("userId")+""));
        exam.setEdittime(new Date());
        //考试卷
        String paperIdsStr = request.getParameter("paperIdsStr");
        String[] paperIds = paperIdsStr.split(",");
        List<ExamPaper> examPapers = new ArrayList<>();
        for (String pid : paperIds){
            ExamPaper examPaper = new ExamPaper();
            examPaper.setPaperId(Integer.parseInt(pid));
            examPapers.add(examPaper);
        }
        int i = examService.updateExamPaper(exam,examPapers);
        if(i>0) resObject.setCode(1);
        else resObject.setCode(0);
        return resObject;
    }

    @RequestMapping("/del")
    public RSTFulBody del(Exam exam) throws SQLException {
        RSTFulBody resObject = new RSTFulBody();
        exam.setDel(0);
        exam.setEditname("zhaoyan");
        exam.setEditid(1);
        exam.setEdittime(new Date());

        examService.update(exam);
        resObject.setCode(1);
        return resObject;
    }

    @RequestMapping("/getExamPaper")
    public List<ExamPaper> getExamPaper(Integer examId) throws SQLException {
        List<ExamPaper> examPapers = examPaperService.getListByExamId(examId);
        return examPapers;
    }
}
