package com.pxjx.dao;

import com.pxjx.model.AnalysisQuestion;
import com.pxjx.model.AnalysisQuestionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AnalysisQuestionMapper {
    long countByExample(AnalysisQuestionExample example);

    int deleteByExample(AnalysisQuestionExample example);

    int deleteByPrimaryKey(Integer analysisQuestionId);

    int insert(AnalysisQuestion record);

    int insertSelective(AnalysisQuestion record);

    List<AnalysisQuestion> selectByExample(AnalysisQuestionExample example);

    AnalysisQuestion selectByPrimaryKey(Integer analysisQuestionId);

    int updateByExampleSelective(@Param("record") AnalysisQuestion record, @Param("example") AnalysisQuestionExample example);

    int updateByExample(@Param("record") AnalysisQuestion record, @Param("example") AnalysisQuestionExample example);

    int updateByPrimaryKeySelective(AnalysisQuestion record);

    int updateByPrimaryKey(AnalysisQuestion record);
}