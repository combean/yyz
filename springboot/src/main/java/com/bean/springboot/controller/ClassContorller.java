package com.bean.springboot.controller;

import com.bean.RSTFul.RSTFulBody;
import com.bean.model.ClassSubject;
import com.bean.model.UClass;
import com.bean.service.UClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;
import java.util.*;

/**
 * Created by PVer on 2017/7/18.
 */
@RestController
@RequestMapping("/uclass")
public class ClassContorller {

    @Autowired
    private UClassService uClassService;

    @RequestMapping("/add")
    public RSTFulBody add(UClass uClass, String subjectIds, HttpServletRequest request) throws SQLException {
        RSTFulBody resObject = new RSTFulBody();
        uClass.setAddname(request.getSession().getAttribute("userName")+"");
        uClass.setAddid(Integer.parseInt(request.getSession().getAttribute("userId")+""));
        uClass.setAddtime(new Date());

        List<ClassSubject> classSubjects = new ArrayList<>();
        String[] subjectIdArray = subjectIds.split(",");
        for (String sid: subjectIdArray) {
            ClassSubject classSubject = new ClassSubject();
            classSubject.setSubjectId(Integer.parseInt(sid));
            classSubjects.add(classSubject);
        }

        int i = uClassService.insertClassSubject(uClass,classSubjects);
        if(i>0) resObject.setCode(1);
        else resObject.setCode(0);

        return resObject;
    }

    @RequestMapping("edit")
    public RSTFulBody edit(UClass uClass,String subjectIds, HttpServletRequest request) throws SQLException {
        RSTFulBody resObject = new RSTFulBody();
        uClass.setEditname(request.getSession().getAttribute("userName")+"");
        uClass.setEditid(Integer.parseInt(request.getSession().getAttribute("userId")+""));
        uClass.setEdittime(new Date());

        List<ClassSubject> classSubjects = new ArrayList<>();
        String[] subjectIdArray = subjectIds.split(",");
        for (String sid: subjectIdArray) {
            ClassSubject classSubject = new ClassSubject();
            classSubject.setSubjectId(Integer.parseInt(sid));
            classSubjects.add(classSubject);
        }

        int i = uClassService.updateClassSubject(uClass,classSubjects);

        if(i>0) resObject.setCode(1);
        else resObject.setCode(0);
        return resObject;
    }

    @RequestMapping("/del")
    public RSTFulBody del(UClass uClass, HttpServletRequest request) throws SQLException {
        RSTFulBody resObject = new RSTFulBody();
        uClass.setDel(0);
        uClass.setEditname(request.getSession().getAttribute("userName")+"");
        uClass.setEditid(Integer.parseInt(request.getSession().getAttribute("userId")+""));
        uClass.setEdittime(new Date());
        uClassService.update(uClass);
        resObject.setCode(1);
        return resObject;
    }

    @RequestMapping("/getAllUClass")
    public List<UClass> getAllUClass(UClass uClass) throws SQLException {
        //搜索条件
        Map<String, Object> map = new HashMap<>();
        map.put("del",1);
        if(uClass.getClassName() != null && uClass.getClassName() != "") map.put("uClassName",uClass.getClassName());
        if(uClass.getClassId() != null) map.put("classId",uClass.getClassId());
        List<UClass> uClasss = uClassService.getListByMap(map);
        return uClasss;
    }
}
