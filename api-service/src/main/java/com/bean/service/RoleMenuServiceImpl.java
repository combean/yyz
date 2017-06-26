package com.bean.service;

import com.bean.dao.RoleMenuMapper;
import com.bean.model.RoleMenu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utils.MyLogger;

import java.util.List;


@Service("roleMenuService")
public class RoleMenuServiceImpl implements RoleMenuService {

    @Autowired
    private RoleMenuMapper roleMenuMapper;

    private MyLogger LOGGER = new MyLogger(RoleMenuServiceImpl.class);

    @Override
    public int insertRoleMenuList(List<RoleMenu> roleMenu){
        return roleMenuMapper.insertList(roleMenu);
    }

    @Override
    public int insertRoleMenu(RoleMenu roleMenu) {
        return roleMenuMapper.insert(roleMenu);
    }

    @Override
    public Integer deleteByRoleId(Integer managerId) {
        return roleMenuMapper.deleteByRoleId(managerId);
    }

    @Override
    public List<RoleMenu> getRoleMenuListByInfo(RoleMenu roleMenu) {
        return roleMenuMapper.getRoleMenuListByInfo(roleMenu);
    }

    @Override
    public Integer deleteByRoleMenuId(Integer roleMenuId) {
        return roleMenuMapper.deleteByRoleMenuId(roleMenuId);
    }

    @Override
    public Integer getCountByInfo(RoleMenu roleMenu) {
        return roleMenuMapper.getCountByInfo(roleMenu);
    }
}
