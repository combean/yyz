package com.pxjx.dao;

import com.pxjx.model.MangerInfo;
import com.pxjx.model.MangerInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MangerInfoMapper {
    long countByExample(MangerInfoExample example);

    int deleteByExample(MangerInfoExample example);

    int deleteByPrimaryKey(Integer managerInfoId);

    int insert(MangerInfo record);

    int insertSelective(MangerInfo record);

    List<MangerInfo> selectByExample(MangerInfoExample example);

    MangerInfo selectByPrimaryKey(Integer managerInfoId);

    int updateByExampleSelective(@Param("record") MangerInfo record, @Param("example") MangerInfoExample example);

    int updateByExample(@Param("record") MangerInfo record, @Param("example") MangerInfoExample example);

    int updateByPrimaryKeySelective(MangerInfo record);

    int updateByPrimaryKey(MangerInfo record);
}