package com.bean.dao;

import com.bean.model.PaperQuestionType;
import com.bean.model.PaperQuestionTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PaperQuestionTypeMapper {
    int insert(PaperQuestionType paperQuestionType);

    int insertList(List<PaperQuestionType> paperQuestionType);

    Integer deleteByPaperId(Integer paperId);

    List<PaperQuestionType> getPaperQuestionTypeListByInfo(PaperQuestionType paperQuestionType);

    Integer deleteByPaperQuestionTypeId(Integer paperQuestionTypeId);

    int getCountByInfo (PaperQuestionType paperQuestionType);
}