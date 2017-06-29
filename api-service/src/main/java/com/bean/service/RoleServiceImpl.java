package com.bean.service;

import com.bean.dao.RoleMapper;
import com.bean.model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utils.MyLogger;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@Service("roleService")
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleMapper roleMapper;

    private MyLogger LOGGER = new MyLogger(RoleServiceImpl.class);

    @Override
    public int insert(Role role) throws SQLException {
        return roleMapper.insert(role);
    }

    @Override
    public int update(Role role) throws SQLException {
        return roleMapper.update(role);
    }

    @Override
    public Role getByMap(Map<String,Object> map) throws SQLException {
        return roleMapper.getByMap(map);
    }

    @Override
    public List<Role> getListByMap(Map<String, Object> map) throws SQLException {
        return roleMapper.getListByMap(map);
    }

    @Override
    public int getCountByMap(Map<String, Object> map) throws SQLException {
        return roleMapper.getCountByMap(map);
    }

    @Override
    public Role getById(Integer id) throws SQLException {
        return roleMapper.getById(id);
    }
}
