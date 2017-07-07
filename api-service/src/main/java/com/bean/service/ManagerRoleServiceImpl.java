package com.bean.service;

import com.bean.dao.ManagerRoleMapper;
import com.bean.model.ManagerRole;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utils.MyLogger;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;


@Service("managerRoleService")
public class ManagerRoleServiceImpl implements ManagerRoleService {

    @Autowired
    private ManagerRoleMapper managerRoleMapper;

    private MyLogger LOGGER = new MyLogger(ManagerRoleServiceImpl.class);

    @Override
    public int insertList(List<ManagerRole> managerRole) throws SQLException {
        return managerRoleMapper.insertList(managerRole);
    }

    @Override
    public int insert(ManagerRole managerRole) throws SQLException {
        return managerRoleMapper.insert(managerRole);
    }

    @Override
    public int deleteByManagerId(Integer managerId) {
        return managerRoleMapper.deleteByManagerId(managerId);
    }

    @Override
    public List<ManagerRole> getListByMap(Map<String, Object> map) throws SQLException {
        return managerRoleMapper.getListByMap(map);
    }

    @Override
    public int deleteById(Integer id) throws SQLException {
        return managerRoleMapper.deleteById(id);
    }

    @Override
    public int getCountByMap(Map<String, Object> map) throws SQLException {
        return managerRoleMapper.getCountByMap(map);
    }
}
