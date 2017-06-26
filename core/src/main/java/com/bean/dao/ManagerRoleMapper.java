package com.bean.dao;

import com.bean.model.ManagerRole;
import java.util.List;

public interface ManagerRoleMapper {
    int insert(ManagerRole managerRole);

    int insertList(List<ManagerRole> managerRole);

    Integer deleteByManagerId(Integer managerId);

    List<ManagerRole> getManagerRoleListByInfo(ManagerRole managerRole);

    Integer deleteByManagerRoleId(Integer managerRoleId);

    int getCountByInfo (ManagerRole managerRole);
}