package com.bean.springboot.controller;

import com.bean.RSTFul.RSTFulBody;
import com.bean.model.Question;
import com.bean.model.QuestionAnswer;
import com.bean.model.QuestionKnowledge;
import com.bean.service.QuestionAnswerService;
import com.bean.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import utils.Utils;

import javax.servlet.http.HttpServletRequest;
import java.sql.Array;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by PVer on 2017/7/6.
 */
@RestController
@RequestMapping("/question")
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @Autowired
    private QuestionAnswerService questionAnswerService;

    @RequestMapping("/add")
    public RSTFulBody add(Question question,HttpServletRequest request) throws SQLException {

        RSTFulBody resObject = new RSTFulBody();
        question.setAddname(request.getSession().getAttribute("userName")+"");
        question.setAddid(Integer.parseInt(request.getSession().getAttribute("userId")+""));
        question.setAddtime(new Date());
        //知识点
        String knowledgeIdStr = request.getParameter("knowledgeIds");
        String[] knowledgeIds = knowledgeIdStr.split(",");
        List<QuestionKnowledge> questionKnowledges = new ArrayList<>();
        for (String knowledgeId : knowledgeIds){
            QuestionKnowledge questionKnowledge = new QuestionKnowledge();
            questionKnowledge.setKnowledgeId(Integer.parseInt(knowledgeId));
            questionKnowledges.add(questionKnowledge);
        }

        int n = 0;
        List<QuestionAnswer> questionAnswers = getQuestionAnswer(question,request);
        if(question.getQuestionType()==3){
            //将题干所有字符转换为半角
            String questionTitle=Utils.ToDBC(question.getQuestionTitle());
            //正则匹配()中的内容
            Pattern pattern = Pattern.compile("(?<=\\()[^\\)]+");
            Matcher matcher = pattern.matcher(questionTitle);
            //将题干()中内容替换为空
            String result = matcher.replaceAll("");
            question.setQuestionTitle(result);
        }
        //写入数据库
        n = questionService.insertQuestionAnswer(question,questionAnswers,questionKnowledges);
        if(n>0){
            resObject.setCode(1);
        }else {
            resObject.setCode(0);
        }
        return resObject;
    }

    @RequestMapping("/edit")
    public RSTFulBody edit(Question question,HttpServletRequest request) throws SQLException {
        RSTFulBody resObject = new RSTFulBody();
        question.setEditid(Integer.parseInt(request.getSession().getAttribute("userId")+""));
        question.setEditname(request.getSession().getAttribute("userName")+"");
        question.setEdittime(new Date());

        //知识点
        String knowledgeIdStr = request.getParameter("knowledgeIds");
        String[] knowledgeIds = knowledgeIdStr.split(",");
        List<QuestionKnowledge> questionKnowledges = new ArrayList<>();
        for (String knowledgeId : knowledgeIds){
            QuestionKnowledge questionKnowledge = new QuestionKnowledge();
            questionKnowledge.setKnowledgeId(Integer.parseInt(knowledgeId));
            questionKnowledges.add(questionKnowledge);
        }

        int n = 0;
        List<QuestionAnswer> questionAnswers = getQuestionAnswer(question,request);
        if(question.getQuestionType()==3){
            //将题干所有字符转换为半角
            String questionTitle=Utils.ToDBC(question.getQuestionTitle());
            //正则匹配()中的内容
            Pattern pattern = Pattern.compile("(?<=\\()[^\\)]+");
            Matcher matcher = pattern.matcher(questionTitle);
            //将题干()中内容替换为空
            String result = matcher.replaceAll("");
            question.setQuestionTitle(result);
        }

        //更新数据
        n = questionService.updateQuestionAnswer(question,questionAnswers,questionKnowledges);
        if(n>0){
            resObject.setCode(1);
        }else {
            resObject.setCode(0);
        }
        return resObject;
    }

    private List<QuestionAnswer> getQuestionAnswer(Question question,HttpServletRequest request){
        List<QuestionAnswer> questionAnswers = new ArrayList<>();
        //题目为选择题或多选题
        if(question.getQuestionType()==1 || question.getQuestionType()==2){
            //选择题答案
            String[] anwserTitles=request.getParameterValues("answerTitle");
            String[] answerInfos=request.getParameterValues("answerInfo");
            String[] answerTypes=request.getParameterValues("answerType");

            for (int i=0;i<anwserTitles.length;i++){
                QuestionAnswer questionAnswer = new QuestionAnswer();
                questionAnswer.setAnswerTitle(anwserTitles[i]);
                questionAnswer.setAnswerInfo(answerInfos[i]);
                questionAnswer.setAnswerType(Integer.parseInt(answerTypes[i]));
                questionAnswers.add(questionAnswer);
            }

        }
        //题目为填空题
        if(question.getQuestionType()==3){
            //将题干所有字符转换为半角
            String questionTitle=Utils.ToDBC(question.getQuestionTitle());
            //正则匹配()中的内容
            Pattern pattern = Pattern.compile("(?<=\\()[^\\)]+");
            Matcher matcher = pattern.matcher(questionTitle);

            //匹配出的内容放入list
            ArrayList answers = new ArrayList();
            while(matcher.find()){
                answers.add(matcher.group());
            }
            //组合答案list
            for(int i=0;i<answers.size();i++){
                String[] answerArray=(answers.get(i)+"").split(",");
                for(String answer: answerArray){
                    QuestionAnswer questionAnswer = new QuestionAnswer();
                    questionAnswer.setBlankNo(i+1);
                    questionAnswer.setAnswerInfo(answer);
                    questionAnswer.setAnswerType(1);
                    questionAnswers.add(questionAnswer);
                }
            }
            //将题干()中内容替换为空
            String result = matcher.replaceAll("");
            question.setQuestionTitle(result);
        }
        //题目类型为问答题
        if(question.getQuestionType()==4){
            QuestionAnswer questionAnswer = new QuestionAnswer();
            questionAnswer.setAnswerInfo(request.getParameter("answerInfo"));
            questionAnswer.setAnswerType(1);
            questionAnswers.add(questionAnswer);
        }
        //题目类型为判断题
        if(question.getQuestionType()==5){
            String[] answerInfos=request.getParameterValues("answerInfo");
            String[] answerTypes=request.getParameterValues("answerType");
            for (int i=0;i<answerInfos.length;i++){
                QuestionAnswer questionAnswer = new QuestionAnswer();
                questionAnswer.setAnswerInfo(answerInfos[i]);
                questionAnswer.setAnswerType(Integer.parseInt(answerTypes[i]));
                questionAnswers.add(questionAnswer);
            }
        }
        return questionAnswers;
    }
}
