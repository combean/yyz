package com.pxjx.dao;

import com.pxjx.model.PaperQuestionType;
import com.pxjx.model.PaperQuestionTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PaperQuestionTypeMapper {
    long countByExample(PaperQuestionTypeExample example);

    int deleteByExample(PaperQuestionTypeExample example);

    int deleteByPrimaryKey(Integer paperQuestionTypeId);

    int insert(PaperQuestionType record);

    int insertSelective(PaperQuestionType record);

    List<PaperQuestionType> selectByExample(PaperQuestionTypeExample example);

    PaperQuestionType selectByPrimaryKey(Integer paperQuestionTypeId);

    int updateByExampleSelective(@Param("record") PaperQuestionType record, @Param("example") PaperQuestionTypeExample example);

    int updateByExample(@Param("record") PaperQuestionType record, @Param("example") PaperQuestionTypeExample example);

    int updateByPrimaryKeySelective(PaperQuestionType record);

    int updateByPrimaryKey(PaperQuestionType record);
}