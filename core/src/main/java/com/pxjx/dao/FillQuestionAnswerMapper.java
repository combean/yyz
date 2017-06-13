package com.pxjx.dao;

import com.pxjx.model.FillQuestionAnswer;
import com.pxjx.model.FillQuestionAnswerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FillQuestionAnswerMapper {
    long countByExample(FillQuestionAnswerExample example);

    int deleteByExample(FillQuestionAnswerExample example);

    int deleteByPrimaryKey(Integer fillAnswerId);

    int insert(FillQuestionAnswer record);

    int insertSelective(FillQuestionAnswer record);

    List<FillQuestionAnswer> selectByExample(FillQuestionAnswerExample example);

    FillQuestionAnswer selectByPrimaryKey(Integer fillAnswerId);

    int updateByExampleSelective(@Param("record") FillQuestionAnswer record, @Param("example") FillQuestionAnswerExample example);

    int updateByExample(@Param("record") FillQuestionAnswer record, @Param("example") FillQuestionAnswerExample example);

    int updateByPrimaryKeySelective(FillQuestionAnswer record);

    int updateByPrimaryKey(FillQuestionAnswer record);
}