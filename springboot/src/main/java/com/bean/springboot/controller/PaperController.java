package com.bean.springboot.controller;

import com.bean.RSTFul.RSTFulBody;
import com.bean.model.*;
import com.bean.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;
import java.util.*;

/**
 * Created by PVer on 2017/7/14.
 */
@RestController
@RequestMapping("/paper")
public class PaperController {

    @Autowired
    private PaperService paperService;

    @Autowired
    private QuestionService questionService;

    @Autowired
    private PaperQuestionTypeService paperQuestionTypeService;

    @Autowired
    private PaperQuestionService paperQuestionService;

    @Autowired
    private QuestionAnswerService questionAnswerService;

    @Autowired
    private QuestionKnowledgeService questionKnowledgeService;

    @RequestMapping("/add")
    public RSTFulBody add(Paper paper, HttpServletRequest request) throws SQLException {
        RSTFulBody resObject = new RSTFulBody();
        paper.setAddname(request.getSession().getAttribute("userName")+"");
        paper.setAddid(Integer.parseInt(request.getSession().getAttribute("userId")+""));
        paper.setAddtime(new Date());
//        if(paper.getStartTime() != null && !paper.getStartTime().equals("")) paper.setStartTime(initBinder(paper.getStartTime()));

        List<PaperQuestion> paperQuestions = new ArrayList<>();
        if(paper.getSelectQuestionType()==1){
            //组合考卷考题List
            String paperQuestionIds = request.getParameter("paperQuestionIds");
            String[] paperQuestionIdArray = paperQuestionIds.split(",");
            for (String pqid:paperQuestionIdArray) {
                Question question = questionService.getById(Integer.parseInt(pqid));
                PaperQuestion paperQuestion = new PaperQuestion();
                paperQuestion.setQuestionId(question.getQuestionId());
                paperQuestion.setQuestionType(question.getQuestionType());
                paperQuestions.add(paperQuestion);
            }
        }

        String[] typeSequence=request.getParameterValues("typeSequence");
        String[] typeId=request.getParameterValues("typeId");
        String[] questionLevel=request.getParameterValues("questionLevel");
        String[] questionNums=request.getParameterValues("questionNums");
        String[] questionRawScore=request.getParameterValues("questionRawScore");
        List<PaperQuestionType> paperQuestionTypes = new ArrayList<>();
        for(int i=0;i<typeId.length;i++){
            PaperQuestionType paperQuestionType = new PaperQuestionType();
            paperQuestionType.setTypeId(Integer.parseInt(typeId[i]));
            paperQuestionType.setTypeSequence(Integer.parseInt(typeSequence[i]));
            paperQuestionType.setQuestionLevel(Integer.parseInt(questionLevel[i]));
            paperQuestionType.setQuestionNums(Integer.parseInt(questionNums[i]));
            paperQuestionType.setQuestionRawScore(Integer.parseInt(questionRawScore[i]));
            paperQuestionTypes.add(paperQuestionType);
        }
        int i = paperService.insertPaperQuestionType(paper,paperQuestionTypes,paperQuestions);

        if(i>0) resObject.setCode(1);
        else resObject.setCode(0);
        return resObject;
    }

    @RequestMapping("edit")
    public RSTFulBody edit(Paper paper, String paperQuestionIds, HttpServletRequest request) throws SQLException {
        RSTFulBody resObject = new RSTFulBody();
        paper.setEditname(request.getSession().getAttribute("userName")+"");
        paper.setEditid(Integer.parseInt(request.getSession().getAttribute("userId")+""));
        paper.setEdittime(new Date());

        //组合考卷考题List
        List<PaperQuestion> paperQuestions = new ArrayList<>();
        String[] paperQuestionIdArray = paperQuestionIds.split(",");
        for (String pqid:paperQuestionIdArray) {
            PaperQuestion paperQuestion = new PaperQuestion();
            paperQuestion.setQuestionId(Integer.parseInt(pqid));
            paperQuestions.add(paperQuestion);
        }

        String[] typeSequence=request.getParameterValues("typeSequence");
        String[] typeId=request.getParameterValues("typeId");
        String[] questionLevel=request.getParameterValues("questionLevel");
        String[] questionNums=request.getParameterValues("questionNums");
        String[] questionRawScore=request.getParameterValues("questionRawScore");
        List<PaperQuestionType> paperQuestionTypes = new ArrayList<>();
        for(int i=0;i<typeId.length;i++){
            PaperQuestionType paperQuestionType = new PaperQuestionType();
            paperQuestionType.setTypeId(Integer.parseInt(typeId[i]));
            paperQuestionType.setTypeSequence(Integer.parseInt(typeSequence[i]));
            paperQuestionType.setQuestionLevel(Integer.parseInt(questionLevel[i]));
            paperQuestionType.setQuestionRawScore(Integer.parseInt(questionRawScore[i]));
            paperQuestionType.setQuestionNums(Integer.parseInt(questionNums[i]));
            paperQuestionTypes.add(paperQuestionType);
        }
        int i = paperService.insertPaperQuestionType(paper,paperQuestionTypes,paperQuestions);

        if(i>0) resObject.setCode(1);
        else resObject.setCode(0);
        return resObject;
    }

    @RequestMapping("/del")
    public RSTFulBody del(Paper paper,HttpServletRequest request) throws SQLException {
        RSTFulBody resObject = new RSTFulBody();
        paper.setDel(0);
        paper.setEditname(request.getSession().getAttribute("userName")+"");
        paper.setEditid(Integer.parseInt(request.getSession().getAttribute("userId")+""));
        paper.setEdittime(new Date());
        paperService.update(paper);
        resObject.setCode(1);
        return resObject;
    }

    @RequestMapping("/getAllPaper")
    public List<Paper> getAllPaper(Paper paper) throws SQLException {
        //搜索条件
        Map<String, Object> map = new HashMap<>();
        map.put("del",1);
        map.put("parentId",0);
        if(paper.getPaperName() !=null && paper.getPaperName() !="") map.put("paperName",paper.getPaperName());
        if(paper.getPaperId() != null) map.put("paperId",paper.getPaperId());
        List<Paper> papers = paperService.getListByMap(map);
        return papers;
    }

    @RequestMapping("/getPaperQuestions")
    public Paper getPaperQuestions(String paperId,Integer answerType, HttpServletRequest request) throws SQLException{

        List<PaperQuestionType> paperQuestionTypes = paperQuestionTypeService.getListByPaperId(Integer.parseInt(paperId));
        for (PaperQuestionType pqt: paperQuestionTypes) {
            Map<String, Object> map = new HashMap<>();
            map.put("questionType",pqt.getTypeId());
            map.put("paperId",pqt.getPaperId());
//            List<Question> questions
            List<PaperQuestion> paperQuestions = paperQuestionService.getListByMap(map);
            String questionIds = "";
            for (PaperQuestion pq: paperQuestions) {
                questionIds+=pq.getQuestionId()+",";
            }
            questionIds = questionIds.substring(0,questionIds.length()-1);
            List<Question> questions = getQuestions1(questionService.getListByIds(questionIds),answerType);
            pqt.setQuestions(questions);
        }
        Paper paper = paperService.getById(Integer.parseInt(paperId));
        paper.setPaperQuestionTypes(paperQuestionTypes);
        return paper;
    }

    public List<Question> getQuestions1(List<Question> questions,Integer answerType) throws SQLException {
        List<QuestionAnswer> questionAnswers =null;
        for (Question q: questions) {
            if(answerType==null || answerType==0){
                questionAnswers = questionAnswerService.getAnswerListByQuestionId(q.getQuestionId());
            }else{
                questionAnswers = questionAnswerService.getRightAnswerListByQuestionId(q.getQuestionId());
            }
            List<QuestionKnowledge> questionKnowledges = questionKnowledgeService.getListByQuestionId(q.getQuestionId());
            q.setQuestionAnswers(questionAnswers);
            q.setQuestionKnowledges(questionKnowledges);
        }
        return questions;
    }
}
