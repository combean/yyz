package com.bean.dao;

import com.bean.model.TfQuestionAnswer;
import com.bean.model.TfQuestionAnswerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TfQuestionAnswerMapper {
    long countByExample(TfQuestionAnswerExample example);

    int deleteByExample(TfQuestionAnswerExample example);

    int deleteByPrimaryKey(Integer tfAnswerId);

    int insert(TfQuestionAnswer record);

    int insertSelective(TfQuestionAnswer record);

    List<TfQuestionAnswer> selectByExample(TfQuestionAnswerExample example);

    TfQuestionAnswer selectByPrimaryKey(Integer tfAnswerId);

    int updateByExampleSelective(@Param("record") TfQuestionAnswer record, @Param("example") TfQuestionAnswerExample example);

    int updateByExample(@Param("record") TfQuestionAnswer record, @Param("example") TfQuestionAnswerExample example);

    int updateByPrimaryKeySelective(TfQuestionAnswer record);

    int updateByPrimaryKey(TfQuestionAnswer record);
}