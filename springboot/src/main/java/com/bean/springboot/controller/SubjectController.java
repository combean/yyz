package com.bean.springboot.controller;

import com.bean.RSTFul.RSTFulBody;
import com.bean.model.Subject;
import com.bean.model.SubjectKnowledge;
import com.bean.service.SubjectKnowledgeService;
import com.bean.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;
import java.util.*;

/**
 * Created by PVer on 2017/7/12.
 */
@RestController
@RequestMapping("/subject")
public class SubjectController {

    @Autowired
    private SubjectService subjectService;

    @Autowired
    private SubjectKnowledgeService subjectKnowledgeService;

    @RequestMapping("/add")
    public RSTFulBody add(Subject subject, HttpServletRequest request) throws SQLException {
        RSTFulBody resObject = new RSTFulBody();
        subject.setAddname(request.getSession().getAttribute("userName")+"");
        subject.setAddid(Integer.parseInt(request.getSession().getAttribute("userId")+""));
        subject.setAddtime(new Date());

        //知识点
        int i=0;
        String knowledgeIdStr = request.getParameter("knowledgeIds");
        if(knowledgeIdStr != null && knowledgeIdStr != ""){
            String[] knowledgeIds = knowledgeIdStr.split(",");
            List<SubjectKnowledge> sujectKnowledges = new ArrayList<>();
            for (String knowledgeId : knowledgeIds){
                SubjectKnowledge subjectKnowledge = new SubjectKnowledge();
                subjectKnowledge.setKnowledgeId(Integer.parseInt(knowledgeId));
                sujectKnowledges.add(subjectKnowledge);
            }

            i = subjectService.insertSubjectKnowledge(subject,sujectKnowledges);
        }else{
            i = subjectService.insert(subject);
        }

        if(i>0) resObject.setCode(1);
        else resObject.setCode(0);
        return resObject;
    }

    @RequestMapping("edit")
    public RSTFulBody edit(Subject subject, HttpServletRequest request) throws SQLException {
        RSTFulBody resObject = new RSTFulBody();
        subject.setEditname(request.getSession().getAttribute("userName")+"");
        subject.setEditid(Integer.parseInt(request.getSession().getAttribute("userId")+""));
        subject.setEdittime(new Date());

        if(subject.getSubjectType()==1) {
            subjectKnowledgeService.deleteBySubjectId(subject.getSubjectId());
            delChildSubject(subject);
        }

        //知识点
        String knowledgeIdStr = request.getParameter("knowledgeIds");
        int i=0;
        if(knowledgeIdStr != null && knowledgeIdStr != ""){
            String[] knowledgeIds = knowledgeIdStr.split(",");
            List<SubjectKnowledge> sujectKnowledges = new ArrayList<>();
            for (String knowledgeId : knowledgeIds){
                SubjectKnowledge subjectKnowledge = new SubjectKnowledge();
                subjectKnowledge.setKnowledgeId(Integer.parseInt(knowledgeId));
                sujectKnowledges.add(subjectKnowledge);
            }
            i=subjectService.updateSubjectKnowledge(subject,sujectKnowledges);
        }else {
            i = subjectService.update(subject);
        }

        if(i>0) resObject.setCode(1);
        else resObject.setCode(0);
        return resObject;
    }

    @RequestMapping("/del")
    public RSTFulBody del(Subject subject,HttpServletRequest request) throws SQLException {
        RSTFulBody resObject = new RSTFulBody();
        subject.setDel(0);
        subject.setEditname(request.getSession().getAttribute("userName")+"");
        subject.setEditid(Integer.parseInt(request.getSession().getAttribute("userId")+""));
        subject.setEdittime(new Date());
        subjectService.update(subject);
        resObject.setCode(1);
        return resObject;
    }

    @RequestMapping("/getAllSubject")
    public List<Subject> getAllSubject(Subject subject) throws SQLException {
        //搜索条件
        Map<String, Object> map = new HashMap<>();
        map.put("del",1);
        map.put("parentId",0);
        if(subject.getSubjectName() !=null && subject.getSubjectName() !="") map.put("subjectName",subject.getSubjectName());
        if(subject.getSubjectId() != null) map.put("subjectId",subject.getSubjectId());
        if(subject.getParentId() != null) map.put("parentId",subject.getParentId());
        List<Subject> subjects = subjectService.getListByMap(map);
        return subjects;
    }

    private List<Subject> getChildSubject(Subject subject) throws SQLException {
        Map<String, Object> map = new HashMap<>();
        map.put("parentId",subject.getSubjectId());
        map.put("del",1);
        List<Subject> childSubjects = subjectService.getListByMap(map);
        subject.setChildSubject(childSubjects);
        for (Subject s: childSubjects) {
            s.setChildSubject(getChildSubject(s));
        }
        return childSubjects;
    }

    private void delChildSubject(Subject subject) throws SQLException {
        Map<String, Object> map = new HashMap<>();
        map.put("parentId",subject.getSubjectId());
        map.put("del",1);
        List<Subject> childSubjects = subjectService.getListByMap(map);
        subject.setChildSubject(childSubjects);
        for (Subject s: childSubjects) {
            s.setDel(0);
            s.setEditname(subject.getEditname());
            s.setEditid(subject.getEditid());
            s.setEdittime(subject.getEdittime());
            subjectService.update(s);
            delChildSubject(s);
        }
    }
}
