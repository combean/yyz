package com.bean.dao;

import com.bean.model.RoleMenu;
import com.bean.model.RoleMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoleMenuMapper {
    int insert(RoleMenu roleMenu);

    int insertList(List<RoleMenu> roleMenu);

    Integer deleteByRoleId(Integer managerId);

    List<RoleMenu> getRoleMenuListByInfo(RoleMenu roleMenu);

    Integer deleteByRoleMenuId(Integer roleMenuId);

    int getCountByInfo (RoleMenu roleMenu);
}