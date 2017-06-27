package com.bean.dao;

import com.bean.model.Role;
import com.bean.model.RoleExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface RoleMapper {
    int insert(Role role);

    Integer update(Role role);

    Role getRoleByInfo(Map<String,String> map);

    List<Role> getRoleListByInfo(Map<String,String> map);

    Integer getRoleCountByInfo(Map<String,String> map);
}