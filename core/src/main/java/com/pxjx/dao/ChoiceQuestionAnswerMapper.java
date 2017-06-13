package com.pxjx.dao;

import com.pxjx.model.ChoiceQuestionAnswer;
import com.pxjx.model.ChoiceQuestionAnswerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ChoiceQuestionAnswerMapper {
    long countByExample(ChoiceQuestionAnswerExample example);

    int deleteByExample(ChoiceQuestionAnswerExample example);

    int deleteByPrimaryKey(Integer choiceAnswerId);

    int insert(ChoiceQuestionAnswer record);

    int insertSelective(ChoiceQuestionAnswer record);

    List<ChoiceQuestionAnswer> selectByExample(ChoiceQuestionAnswerExample example);

    ChoiceQuestionAnswer selectByPrimaryKey(Integer choiceAnswerId);

    int updateByExampleSelective(@Param("record") ChoiceQuestionAnswer record, @Param("example") ChoiceQuestionAnswerExample example);

    int updateByExample(@Param("record") ChoiceQuestionAnswer record, @Param("example") ChoiceQuestionAnswerExample example);

    int updateByPrimaryKeySelective(ChoiceQuestionAnswer record);

    int updateByPrimaryKey(ChoiceQuestionAnswer record);
}