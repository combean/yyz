package com.bean.dao;

import com.bean.model.ManagerRole;
import mybatis.basemapper.BaseMapper;

import java.util.List;

public interface ManagerRoleMapper extends BaseMapper<ManagerRole>{

    int deleteByManagerId(Integer managerId);

}