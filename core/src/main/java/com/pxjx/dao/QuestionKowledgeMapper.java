package com.pxjx.dao;

import com.pxjx.model.QuestionKowledge;
import com.pxjx.model.QuestionKowledgeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QuestionKowledgeMapper {
    long countByExample(QuestionKowledgeExample example);

    int deleteByExample(QuestionKowledgeExample example);

    int deleteByPrimaryKey(Integer questionKowledgeId);

    int insert(QuestionKowledge record);

    int insertSelective(QuestionKowledge record);

    List<QuestionKowledge> selectByExample(QuestionKowledgeExample example);

    QuestionKowledge selectByPrimaryKey(Integer questionKowledgeId);

    int updateByExampleSelective(@Param("record") QuestionKowledge record, @Param("example") QuestionKowledgeExample example);

    int updateByExample(@Param("record") QuestionKowledge record, @Param("example") QuestionKowledgeExample example);

    int updateByPrimaryKeySelective(QuestionKowledge record);

    int updateByPrimaryKey(QuestionKowledge record);
}