package com.bean.service;

import com.bean.dao.ManagerMapper;
import com.bean.model.Manager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import utils.MyLogger;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

@Service("managerService")
public class ManagerServiceImpl implements ManagerService {

    @Autowired
    private ManagerMapper managerMapper;

    private MyLogger LOGGER = new MyLogger(ManagerServiceImpl.class);


    @Override
    public int insert(Manager manager) throws SQLException {
        return managerMapper.insert(manager);
    }

    @Override
    public Integer update(Manager manager) throws SQLException {
        return managerMapper.update(manager);
    }

    @Override
    public Manager getByMap(Map<String, Object> map) throws SQLException {
        return managerMapper.getByMap(map);
    }

    @Override
    public List<Manager> getListByMap(Map<String, Object> map) throws SQLException {
        return managerMapper.getListByMap(map);
    }

    @Override
    public Integer getCountByMap(Map<String, Object> map) throws SQLException {
        return managerMapper.getCountByMap(map);
    }

    @Override
    public Manager getById(Integer id) throws SQLException {
        return managerMapper.getById(id);
    }
}
