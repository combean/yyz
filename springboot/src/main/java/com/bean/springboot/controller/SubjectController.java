package com.bean.springboot.controller;

import com.bean.RSTFul.RSTFulBody;
import com.bean.model.Subject;
import com.bean.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by PVer on 2017/7/12.
 */
@RestController
@RequestMapping("/subject")
public class SubjectController {

    @Autowired
    private SubjectService subjectService;

    @RequestMapping("/add")
    public RSTFulBody add(Subject subject, HttpServletRequest request) throws SQLException {
        RSTFulBody resObject = new RSTFulBody();
        subject.setAddname(request.getSession().getAttribute("userName")+"");
        subject.setAddid(Integer.parseInt(request.getSession().getAttribute("userId")+""));
        subject.setAddtime(new Date());
        int i = subjectService.insert(subject);
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
        int i=subjectService.update(subject);
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
        if(subject.getSubjectName() !=null && subject.getSubjectName() !="") map.put("subjectName",subject.getSubjectName());
        if(subject.getSubjectId() != null) map.put("subjectId",subject.getSubjectId());
        if(subject.getParentId() != null) map.put("parentId",subject.getParentId());
        List<Subject> subjects = subjectService.getListByMap(map);
        return subjects;
    }
}
