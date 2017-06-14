package com.bean.dao;

import com.bean.model.Kowledge;
import com.bean.model.KowledgeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface KowledgeMapper {
    long countByExample(KowledgeExample example);

    int deleteByExample(KowledgeExample example);

    int deleteByPrimaryKey(Integer knowledgeId);

    int insert(Kowledge record);

    int insertSelective(Kowledge record);

    List<Kowledge> selectByExample(KowledgeExample example);

    Kowledge selectByPrimaryKey(Integer knowledgeId);

    int updateByExampleSelective(@Param("record") Kowledge record, @Param("example") KowledgeExample example);

    int updateByExample(@Param("record") Kowledge record, @Param("example") KowledgeExample example);

    int updateByPrimaryKeySelective(Kowledge record);

    int updateByPrimaryKey(Kowledge record);
}