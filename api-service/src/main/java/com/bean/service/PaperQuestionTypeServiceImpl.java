package com.bean.service;

import com.bean.dao.PaperQuestionTypeMapper;
import com.bean.model.PaperQuestionType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utils.MyLogger;

import java.util.List;


@Service("qaperQuestionTypeService")
public class PaperQuestionTypeServiceImpl implements PaperQuestionTypeService {

    @Autowired
    private PaperQuestionTypeMapper qaperQuestionTypeMapper;

    private MyLogger LOGGER = new MyLogger(PaperQuestionTypeServiceImpl.class);

    @Override
    public int insertPaperQuestionTypeList(List<PaperQuestionType> qaperQuestionType){
        return qaperQuestionTypeMapper.insertList(qaperQuestionType);
    }

    @Override
    public int insertPaperQuestionType(PaperQuestionType qaperQuestionType) {
        return qaperQuestionTypeMapper.insert(qaperQuestionType);
    }

    @Override
    public Integer deleteByPaperId(Integer paperId) {
        return qaperQuestionTypeMapper.deleteByPaperId(paperId);
    }

    @Override
    public List<PaperQuestionType> getPaperQuestionTypeListByInfo(PaperQuestionType qaperQuestionType) {
        return qaperQuestionTypeMapper.getPaperQuestionTypeListByInfo(qaperQuestionType);
    }

    @Override
    public Integer deleteByPaperQuestionTypeId(Integer qaperQuestionTypeId) {
        return qaperQuestionTypeMapper.deleteByPaperQuestionTypeId(qaperQuestionTypeId);
    }

    @Override
    public Integer getCountByInfo(PaperQuestionType qaperQuestionType) {
        return qaperQuestionTypeMapper.getCountByInfo(qaperQuestionType);
    }
}
