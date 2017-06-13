package com.pxjx.dao;

import com.pxjx.model.UserClass;
import com.pxjx.model.UserClassExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserClassMapper {
    long countByExample(UserClassExample example);

    int deleteByExample(UserClassExample example);

    int deleteByPrimaryKey(Integer userClassId);

    int insert(UserClass record);

    int insertSelective(UserClass record);

    List<UserClass> selectByExample(UserClassExample example);

    UserClass selectByPrimaryKey(Integer userClassId);

    int updateByExampleSelective(@Param("record") UserClass record, @Param("example") UserClassExample example);

    int updateByExample(@Param("record") UserClass record, @Param("example") UserClassExample example);

    int updateByPrimaryKeySelective(UserClass record);

    int updateByPrimaryKey(UserClass record);
}