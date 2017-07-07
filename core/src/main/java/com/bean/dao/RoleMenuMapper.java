package com.bean.dao;

import com.bean.model.RoleMenu;
import com.bean.model.RoleMenuExample;
import java.util.List;

import mybatis.basemapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

public interface RoleMenuMapper extends BaseMapper<RoleMenu> {

    Integer deleteByRoleId(Integer roleId);

}