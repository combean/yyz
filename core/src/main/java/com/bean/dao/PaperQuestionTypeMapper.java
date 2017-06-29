package com.bean.dao;

import com.bean.model.PaperQuestionType;
import com.bean.model.PaperQuestionTypeExample;
import java.util.List;

import mybatis.basemapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

public interface PaperQuestionTypeMapper extends BaseMapper<PaperQuestionType> {

    int deleteByPaperId(Integer paperId);

}