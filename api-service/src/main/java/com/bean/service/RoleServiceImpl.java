package com.bean.service;

import com.bean.dao.RoleMapper;
import com.bean.model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utils.MyLogger;

import java.util.List;
import java.util.Map;

@Service("roleService")
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleMapper roleMapper;

    private MyLogger LOGGER = new MyLogger(RoleServiceImpl.class);

    @Override
    public int insertRole(Role role) {
        return roleMapper.insert(role);
    }

    @Override
    public Integer updateRole(Role role) {
        return roleMapper.update(role);
    }

    @Override
    public Role getRoleByInfo(Map<String,String> map) {
        return roleMapper.getRoleByInfo(map);
    }

    @Override
    public List<Role> getRoleListByInfo(Map<String, String> map) {
        return roleMapper.getRoleListByInfo(map);
    }

    @Override
    public Integer getRoleCountByInfo(Map<String, String> map) {
        return roleMapper.getRoleCountByInfo(map);
    }
}
