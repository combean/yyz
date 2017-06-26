package com.bean.service;

import com.bean.dao.ManagerRoleMapper;
import com.bean.model.ManagerRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utils.MyLogger;

import java.util.List;


@Service("managerRoleService")
public class ManagerRoleServiceImpl implements ManagerRoleService {

    @Autowired
    private ManagerRoleMapper managerRoleMapper;

    private MyLogger LOGGER = new MyLogger(ManagerRoleServiceImpl.class);

    @Override
    public int insertManagerRoleList(List<ManagerRole> managerRole){
        return managerRoleMapper.insertList(managerRole);
    }

    @Override
    public int insertManagerRole(ManagerRole managerRole) {
        return managerRoleMapper.insert(managerRole);
    }

    @Override
    public Integer deleteByManagerId(Integer managerId) {
        return managerRoleMapper.deleteByManagerId(managerId);
    }

    @Override
    public List<ManagerRole> getManagerRoleListByInfo(ManagerRole managerRole) {
        return managerRoleMapper.getManagerRoleListByInfo(managerRole);
    }

    @Override
    public Integer deleteByManagerRoleId(Integer managerRoleId) {
        return managerRoleMapper.deleteByManagerRoleId(managerRoleId);
    }

    @Override
    public Integer getCountByInfo(ManagerRole managerRole) {
        return managerRoleMapper.getCountByInfo(managerRole);
    }
}
