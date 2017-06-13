package com.pxjx.dao;

import com.pxjx.model.ManagerRole;
import com.pxjx.model.ManagerRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ManagerRoleMapper {
    long countByExample(ManagerRoleExample example);

    int deleteByExample(ManagerRoleExample example);

    int deleteByPrimaryKey(Integer managerRoleId);

    int insert(ManagerRole record);

    int insertSelective(ManagerRole record);

    List<ManagerRole> selectByExample(ManagerRoleExample example);

    ManagerRole selectByPrimaryKey(Integer managerRoleId);

    int updateByExampleSelective(@Param("record") ManagerRole record, @Param("example") ManagerRoleExample example);

    int updateByExample(@Param("record") ManagerRole record, @Param("example") ManagerRoleExample example);

    int updateByPrimaryKeySelective(ManagerRole record);

    int updateByPrimaryKey(ManagerRole record);
}