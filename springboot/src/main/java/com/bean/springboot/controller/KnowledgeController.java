package com.bean.springboot.controller;

import com.bean.RSTFul.RSTFulBody;
import com.bean.model.Knowledge;
import com.bean.service.KnowledgeService;
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
 * Created by PVer on 2017/7/6.
 */
@RestController
@RequestMapping("/knowledge")
public class KnowledgeController {

    @Autowired
    private KnowledgeService knowledgeService;

    @RequestMapping("/add")
    public RSTFulBody add(Knowledge knowledge, HttpServletRequest request) throws SQLException {
        RSTFulBody resObject = new RSTFulBody();
        knowledge.setAddname(request.getSession().getAttribute("userName")+"");
        knowledge.setAddid(Integer.parseInt(request.getSession().getAttribute("userId")+""));
        knowledge.setAddtime(new Date());
        int i = knowledgeService.insert(knowledge);
        if(i>0) resObject.setCode(1);
        else resObject.setCode(0);
        return resObject;
    }

    @RequestMapping("edit")
    public RSTFulBody edit(Knowledge knowledge, HttpServletRequest request) throws SQLException {
        RSTFulBody resObject = new RSTFulBody();
        knowledge.setEditname(request.getSession().getAttribute("userName")+"");
        knowledge.setEditid(Integer.parseInt(request.getSession().getAttribute("userId")+""));
        knowledge.setEdittime(new Date());
        int i=knowledgeService.update(knowledge);
        if(i>0) resObject.setCode(1);
        else resObject.setCode(0);
        return resObject;
    }

    @RequestMapping("/del")
    public RSTFulBody del(Knowledge knowledge,HttpServletRequest request) throws SQLException {
        RSTFulBody resObject = new RSTFulBody();
        knowledge.setDel(0);
        knowledge.setEditname(request.getSession().getAttribute("userName")+"");
        knowledge.setEditid(Integer.parseInt(request.getSession().getAttribute("userId")+""));
        knowledge.setEdittime(new Date());
        knowledgeService.update(knowledge);
        resObject.setCode(1);
        return resObject;
    }

    @RequestMapping("/getAllKnowledge")
    public List<Knowledge> getAllKnowledge(Knowledge knowledge) throws SQLException {
        //搜索条件
        Map<String, Object> map = new HashMap<>();
        map.put("del",1);
        if(knowledge.getKnowledgeName() !=null && knowledge.getKnowledgeName() !="") map.put("knowledgeName",knowledge.getKnowledgeName());
        if(knowledge.getKnowledgeId() != null) map.put("knowledgeId",knowledge.getKnowledgeId());
        List<Knowledge> knowledges = knowledgeService.getListByMap(map);
        return knowledges;
    }
}
