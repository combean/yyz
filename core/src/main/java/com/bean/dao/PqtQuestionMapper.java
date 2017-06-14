package com.bean.dao;

import com.bean.model.PqtQuestion;
import com.bean.model.PqtQuestionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PqtQuestionMapper {
    long countByExample(PqtQuestionExample example);

    int deleteByExample(PqtQuestionExample example);

    int deleteByPrimaryKey(Integer pqtQuestionId);

    int insert(PqtQuestion record);

    int insertSelective(PqtQuestion record);

    List<PqtQuestion> selectByExample(PqtQuestionExample example);

    PqtQuestion selectByPrimaryKey(Integer pqtQuestionId);

    int updateByExampleSelective(@Param("record") PqtQuestion record, @Param("example") PqtQuestionExample example);

    int updateByExample(@Param("record") PqtQuestion record, @Param("example") PqtQuestionExample example);

    int updateByPrimaryKeySelective(PqtQuestion record);

    int updateByPrimaryKey(PqtQuestion record);
}