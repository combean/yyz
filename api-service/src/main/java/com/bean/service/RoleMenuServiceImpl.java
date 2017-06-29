package com.bean.service;

import com.bean.dao.RoleMenuMapper;
import com.bean.model.RoleMenu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utils.MyLogger;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;


@Service("roleMenuService")
public class RoleMenuServiceImpl implements RoleMenuService {

    @Autowired
    private RoleMenuMapper roleMenuMapper;

    private MyLogger LOGGER = new MyLogger(RoleMenuServiceImpl.class);

    @Override
    public int insertList(List<RoleMenu> roleMenu) throws SQLException {
        return roleMenuMapper.insertList(roleMenu);
    }

    @Override
    public int insert(RoleMenu roleMenu) throws SQLException {
        return roleMenuMapper.insert(roleMenu);
    }

    @Override
    public Integer deleteByRoleId(Integer managerId) {
        return roleMenuMapper.deleteByRoleId(managerId);
    }

    @Override
    public List<RoleMenu> getListByMap(Map<String,Object> map) throws SQLException {
        return roleMenuMapper.getListByMap(map);
    }

    @Override
    public int deleteById(Integer id) throws SQLException {
        return roleMenuMapper.deleteById(id);
    }

    @Override
    public int getCountByMap(Map<String,Object> map) throws SQLException {
        return roleMenuMapper.getCountByMap(map);
    }
}
