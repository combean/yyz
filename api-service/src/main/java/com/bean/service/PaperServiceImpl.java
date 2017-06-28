package com.bean.service;

import com.bean.dao.PaperMapper;
import com.bean.model.Paper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utils.MyLogger;

import java.util.List;
import java.util.Map;


@Service("paperService")
public class PaperServiceImpl implements PaperService {

    @Autowired
    private PaperMapper paperMapper;

    private MyLogger LOGGER = new MyLogger(PaperServiceImpl.class);


    @Override
    public int insertPaper(Paper paper) {
        return paperMapper.insert(paper);
    }

    @Override
    public Integer updatePaper(Paper paper) {
        return paperMapper.update(paper);
    }

    @Override
    public Paper getPaperByInfo(Map<String, String> map) {
        return paperMapper.getPaperByInfo(map);
    }

    @Override
    public List<Paper> getPaperListByInfo(Map<String, String> map) {
        return paperMapper.getPaperListByInfo(map);
    }

    @Override
    public Integer getPaperCountByInfo(Map<String, String> map) {
        return paperMapper.getPaperCountByInfo(map);
    }
}
